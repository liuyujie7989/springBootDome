package com.liuyujie.demo.pojo;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * <br>
 * 标题: RSA加密工具类 <br>
 * 描述: <br>
 * 公司: www.tydic.com <br>
 *
 * @author shenxiangwei
 * @time 2019/5/29 10:24 AM
 */
public class RSAUtils {
    private static Logger logger = LoggerFactory.getLogger(RSAUtils .class);


    /**
     * 用于封装随机产生的公钥与私钥
     *
     * @author yihur
     * @date 2019/4/4
     * @param
     * @return
     */
    private static Map<Integer, String> keyMap = new HashMap<>();

    public static String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAInDB3GQDPTnmfCmqiP+x6KZ+o0BYSUo3To5ad2DOw4hgRFzGX" +
            "S5Fxgg64VB3Zx/xTc/4jY1FKo59/yBZqg5u6XyEma6nZd77wRuLQHmtKDuht+I5m3a8V+4h0VpwxmnJSt/vZ3A64V/g5BxfC02u8IirdGz47EC" +
            "z9CGr0JqI/KFAgMBAAECgYAM4RXeERiVAN4MeJhpexVQ51JcQmfBoJtmKR3znqQzwwAdEIStu+wjzlgWgjzkt7FJZAiTBs1iyL6ddb+SNKuNSf" +
            "4DUbEaEuLVQ3cKuwhb781FkqwAceQ/hvUN4XktfaURBQ6wTHX8Ky9hL/eOfa49dGauVQZrQXbav7gIj2FmoQJBAMGRgCf4c1+t45WeOn0QKMOK" +
            "W9BVPVxN9lpXSDlarSjwzSDnBfVc7tSe8zWrFIQm2oJON4lgyBCD/HKkWt0z9/0CQQC2MbXTQ8GhSwZCi+35fr3FPOKnFAE+TnNjF+3f7swOdJ" +
            "odKy/rDIkqLkLCs17BrSIC4/AVK8g8Xx94qdUmJ5cpAkAkiqc65HhDU7xm/lvkSCyp3XC/v5e52S3smBWWXjvaQrs2vuYtD8I2eVtIgmd5Gyyc" +
            "9M8fLBoYpBIAQm60256xAkA58l2OMAKpth7rk23A6Jqa3N6JnUc39eOlJLs3ec/U2SkbFd1LuNT3YXdCTaJZnyMuICj/0skAypBL5FgypmzhAk" +
            "EAscSda1LdrvoKDh6j5BILpkSSmVUkEZCV+uc8bwWkqfRmNcEYVNUXZEfcT8xMz0dbcuWIB5MFwMuGlY7aPnAblw==";
    /**
     * 测试方法
     *
     * @param args
     * @return void
     * <p>
     * <p>
     * 前端用crypto-js进行加密，
     * npm i jsencrypt，
     * 然后页面头引入import JSEncrypt from 'jsencrypt';
     * const encrypt = new JSEncrypt();
     * encrypt.setPublicKey('你的公钥');
     * password = encrypt.encrypt(‘你的密码’);// 加密后的字符串
     * @author yihur
     * @date 2019/4/4
     */
    public static void main(String[] args) {
        /**
         * 使用随机的密钥对
         */
//        //生成公钥和私钥
//        genKeyPair();
//        //加密字符串
//        String message = "df723820";
//        System.out.println("随机生成的公钥为:" + keyMap.get(0));
//        System.out.println("随机生成的私钥为:" + keyMap.get(1));
//        String messageEn = encrypt(message, keyMap.get(0));
//        System.out.println("加密后的字符串为:" + messageEn);
//        String messageDe = decrypt(messageEn, keyMap.get(1));
//        System.out.println("还原后的字符串为:" + messageDe);

        /**
         * 使用固定的密钥对
         */
        String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCJwwdxkAz055nwpqoj/seimfqNAWElKN06OWndgzsOIYERcxl0uRcYIOuFQd2" +
                "cf8U3P+I2NRSqOff8gWaoObul8hJmup2Xe+8Ebi0B5rSg7obfiOZt2vFfuIdFacMZpyUrf72dwOuFf4OQcXwtNrvCIq3Rs+OxAs/Qhq9CaiPyhQIDAQAB";

        String message = "df723820";
        String messageEn = encrypt(message, publicKey);
        System.out.println("加密后的字符串为:" + messageEn);
        String messageDe = decrypt(messageEn, privateKey);
        System.out.println("还原后的字符串为:" + messageDe);
    }

    /**
     * 随机生成密钥对
     *
     * @param
     * @return void
     * @author yihur
     * @date 2019/4/4
     */
    public static void genKeyPair() {
        // KeyPairGenerator类用于生成公钥和私钥对，基于RSA算法生成对象
        KeyPairGenerator keyPairGen = null;
        try {
            keyPairGen = KeyPairGenerator.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        // 初始化密钥对生成器，密钥大小为96-1024位
        assert keyPairGen != null;
        keyPairGen.initialize(1024, new SecureRandom());
        // 生成一个密钥对，保存在keyPair中
        KeyPair keyPair = keyPairGen.generateKeyPair();
        // 得到私钥
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        // 得到公钥
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        String publicKeyString = new String(Base64.encodeBase64(publicKey.getEncoded()));
        // 得到私钥字符串
        String privateKeyString = new String(Base64.encodeBase64((privateKey.getEncoded())));
        // 将公钥和私钥保存到Map
        //0表示公钥
        keyMap.put(0, publicKeyString);
        //1表示私钥
        keyMap.put(1, privateKeyString);
    }

    /**
     * RSA公钥加密
     *
     * @param str       加密字符串
     * @param publicKey 公钥
     * @return 密文
     */
    public static String encrypt(String str, String publicKey) {
        //base64编码的公钥
        byte[] decoded = Base64.decodeBase64(publicKey);
        RSAPublicKey pubKey = null;
        String outStr = null;
        try {
            pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, pubKey);
            outStr = Base64.encodeBase64String(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)));
        } catch (InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | InvalidKeyException | NoSuchPaddingException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        //RSA加密
        return outStr;
    }

    /**
     * RSA私钥解密
     *
     * @param str        加密字符串
     * @param privateKey 私钥
     * @return 明文
     */
    public static String decrypt(String str, String privateKey) {
        //64位解码加密后的字符串
        byte[] inputByte = Base64.decodeBase64(str.getBytes(StandardCharsets.UTF_8));
        //base64编码的私钥
        byte[] decoded = Base64.decodeBase64(privateKey);
        RSAPrivateKey priKey = null;
        //RSA解密
        Cipher cipher = null;
        String outStr = null;
        try {
            priKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(decoded));
            cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, priKey);
            outStr = new String(cipher.doFinal(inputByte));
        } catch (InvalidKeySpecException | NoSuchAlgorithmException | NoSuchPaddingException | BadPaddingException | IllegalBlockSizeException | InvalidKeyException e) {
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        return outStr;
    }
}
