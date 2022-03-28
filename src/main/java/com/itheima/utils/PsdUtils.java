package com.itheima.utils;

import org.apache.ibatis.annotations.Param;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.print.DocFlavor;

public class PsdUtils {
    //加密
    public static String encodePassWord(String password){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }
    //验证
    public static boolean matchesPassWord(String psd,String encodePassWord){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(psd,encodePassWord);
    }
}
