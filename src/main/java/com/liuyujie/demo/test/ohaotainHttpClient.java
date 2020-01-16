package com.liuyujie.demo.test;

import com.mzlion.easyokhttp.response.HttpResponse;

import java.io.IOException;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-11-13 15:13
 **/
public class ohaotainHttpClient {
    public static void main(String[] args) throws IOException {
        //final File file = new File("C:\\Users\\admin\\Desktop\\5fda4902-edbb-4768-a18e-30a3aba8bd95.data");
        //String strFile = IOTools.readFile(file);
        //IOTools.writeFile("C:\\Users\\admin\\Desktop\\","bbbbbb",strFile);
       // System.out.println(strFile);
        HttpResponse httpResponse = null;
        String url = "http://localhost:8084/requestHandle";
        try {
           // httpResponse = ESBClent.invokeUrl(url,"4345345345");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
