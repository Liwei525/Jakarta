package com.example.demo.base.utils;

import org.springframework.util.StringUtils;
import sun.misc.BASE64Encoder;

/**
 * @author CHENGRui
 * @Since 2018/6/1
 */
public class Base64Util {

    public static String encryptBASE64(String keyStr) throws Exception {
        byte[] key = keyStr.getBytes();
        return (new BASE64Encoder()).encodeBuffer(key);
    }
}
