package com.liuyujie.demo.util;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author liubq
 */
@Log4j2
public class IOTools {

    /**
     * 写文件
     *
     * @param fileDir 目录
     * @param fileName 文件名
     * @param fileData 文件内容
     */
    public static void writeFile(String fileDir, String fileName, String fileData) throws IOException {
        writeFile(fileDir + fileName, fileData);
    }

    /**
     * 写文件
     *
     * @param fileData 文件内容
     */
    public static void writeFile(String fileDirAndFileName, String fileData) throws IOException {
        final File file = new File(fileDirAndFileName);
        FileUtils.forceMkdirParent(file);
        IOUtils.write(fileData, new FileOutputStream(file), StandardCharsets.UTF_8);
    }

    /**
     * 读文件
     */
    public static String readFile(final File file) throws IOException {
        return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
    }


    /*public static void writeNIO(String filePath, String fileName, ByteBuffer src) throws IOException {
        filePath = filePath.endsWith("/") ? filePath : filePath + "/";
        FileOutputStream fos = null;
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.mkdir();
            }

            fos = new FileOutputStream(new File(filePath + fileName));
            FileChannel channel = fos.getChannel();
            // 字节缓冲的容量和limit会随着数据长度变化，不是固定不变的

            int length = 0;

            while ((length = channel.write(src)) != 0) {
                 //注意，这里不需要clear，将缓冲中的数据写入到通道中后 第二次接着上一次的顺序往下读
            }
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    log.error("IOException", e);
                }
            }
        }
    }*/

//    public static void produceResponse(final File file) {
//        try {
//            final ReqMessageRest messageRest = JSON
//                    .parseObject(FileUtils.readFileToString(file, StandardCharsets.UTF_8), ReqMessageRest.class);
//            RestClient.invoke(file.getName(), messageRest);
//        } catch (Exception e) {
//            e.printStackTrace();
//            log.error("", e);
//        }
//    }
}
