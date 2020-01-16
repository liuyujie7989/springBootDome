package com.liuyujie.demo.test;

import com.liuyujie.demo.util.IOTools;
import okhttp3.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-11-13 10:25
 **/
public class httpclient {
    public static void main(String[] args) throws IOException {
        final File file = new File("C:\\Users\\admin\\Desktop\\新建文本文档.txt");
        String strFile = IOTools.readFile(file);
        //IOTools.writeFile("C:\\Users\\admin\\Desktop\\","bbbbbb",strFile);
        //System.out.println(strFile);
        String url = "http://10.16.32.170:8086/requestHandle";
        //第一步创建OKHttpClient

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5,TimeUnit.SECONDS)
                .writeTimeout(5,TimeUnit.SECONDS)
                .cache(new Cache(new File(strFile),10*1024*1024))
                .build();
        //第二步创建RequestBody（Form表达）
        RequestBody body = new FormBody.Builder()
                .add("jsonText", strFile)
                //.add("fileName", "1234569999")
                .build();
        //第三步创建Rquest
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        //第四步创建call回调对象
        final Call call = client.newCall(request);
        //第五步发起请求
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                System.out.println(result);
            }
        });
    }
}
