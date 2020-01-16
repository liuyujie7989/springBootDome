package com.liuyujie.demo.utils;

import java.security.MessageDigest;

/** 
 * 采用MD5加密解密 
 * @author 
 * @datetime 
 */  
public class MD5Util {  
  
    /*** 
     * MD5加码 生成32位md5码 
     */  
    public static String string2MD5(String inStr){  
        MessageDigest md5 = null;  
        try{  
            md5 = MessageDigest.getInstance("MD5");  
        }catch (Exception e){  
            System.out.println(e.toString());  
            e.printStackTrace();  
            return "";  
        }  
        char[] charArray = inStr.toCharArray();  
        byte[] byteArray = new byte[charArray.length];  
  
        for (int i = 0; i < charArray.length; i++)  
            byteArray[i] = (byte) charArray[i];  
        byte[] md5Bytes = md5.digest(byteArray);  
        StringBuffer hexValue = new StringBuffer();  
        for (int i = 0; i < md5Bytes.length; i++){  
            int val = ((int) md5Bytes[i]) & 0xff;  
            if (val < 16)  
                hexValue.append("0");  
            hexValue.append(Integer.toHexString(val));  
        }  
        return hexValue.toString();  
  
    }  
  
    /** 
     * 加密解密算法 执行一次加密，两次解密 
     */   
    public static String convertMD5(String inStr){  
  
        char[] a = inStr.toCharArray();  
        for (int i = 0; i < a.length; i++){  
            a[i] = (char) (a[i] ^ 't');  
        }  
        String s = new String(a);  
        return s;  
  
    }  
    /**
     * tokenValue值的生成
     */
    public static String tokenValue(String app_id,String timestamp,String trans_id,String app_secret){
    	String tokenValue = "";
    	StringBuffer bf = new StringBuffer();
    	bf.append("APP_ID"+app_id);
    	bf.append("TIMESTAMP"+timestamp);
    	bf.append("TRANS_ID"+trans_id);
    	bf.append(app_secret);
    	String s = bf.toString();
    	tokenValue = string2MD5(s);
    	return tokenValue;
    }
    // 测试主函数  
    public static void main(String args[]) {  
    	String a = MD5Util.tokenValue("KFpTpXKcUd", "1540000789274", "201810293095949274248327", "fJiAxcQFfb4fRtNKFSBC4hrAAh8e1ZcT");
    	System.out.println(a);
  
    }  
}  
