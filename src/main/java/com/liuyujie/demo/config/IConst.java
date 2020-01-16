package com.liuyujie.demo.config;

import java.io.FilenameFilter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * 常量池
 * <hr>
 *
 * @author TheWk
 * @version 1.0.0
 * <pre>
 * =========================== Logs =========================== <br>
 * 1.0.0(2018-12-04 20:58) TheWk 创建 <br>
 * =========================== Logs =========================== <br>
 * </pre>
 */
public interface IConst {
    //    _____   _             __      ___  __
    //   |_   _| | |_      ___  \ \    / / |/ /
    //     | |   | ' \    / -_)  \ \/\/ /| ' <
    //    _|_|_  |_||_|   \___|   \_/\_/ |_|\_\
    //  _|"""""|_|"""""|_|"""""|_|"""""|_|"""""|_
    //  "`-0-0-'"`-0-0-'"`-0-0-'"`-0-0-'"`-0-0-'"

    DateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");


    /**
     * 响应编码:成功
     */
    Integer RESPONSE_CODE_SUCCESS = 0;


    /**
     * 响应编码:失败
     */
    Integer RESPONSE_CODE_ERROR = 1;

    /**
     * 自定义文件后缀
     */
    String CUSTOM_FILE_SUFFIX = ".data";


    /**
     * 文件名称过滤器_只允许自定义的文件结尾
     */
    FilenameFilter CUSTOM_FILE_NAME_FILTER = (dir, name) -> name.endsWith(CUSTOM_FILE_SUFFIX);


    /**
     * 响应文件JSON的KEY:data
     */

    String JSON_KEY_DATA = "data";
    String JSON_KEY_CONTENT_TYPE = "contentType";
    String JSON_KEY_REQUEST_ID = "requestId";
    String JSON_KEY_RESPONSE_BODY = "responseBody";
    String JSON_KEY_RETURN_URL = "returnUrl";

    String JSON_KEY_RESPONSE_ERROR_MESSAGE = "errorMsg";

    int HTTP_CODE_SUCCESS = 200;

    String ESB_APP_ID = "KFpTpXKcUd";
    String  ESB_APP_SECRET = "fJiAxcQFfb4fRtNKFSBC4hrAAh8e1ZcT";


}
