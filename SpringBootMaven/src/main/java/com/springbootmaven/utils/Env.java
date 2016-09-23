package com.springbootmaven.utils;

import java.util.ResourceBundle;

/**
 * 获取当前环境
 *
 * @author guozijian
 * @date 2016/8/23 11:36
 */
public class Env {

    private final static String KEY = "env";

    private static ResourceBundle bundle;

    static {
        try {
            bundle = ResourceBundle.getBundle("env");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isDev() {
        return "DEV".equals(bundle.getString(KEY));
    }

    public static boolean isTest() {
        return "TEST".equals(bundle.getString(KEY));
    }

    public static boolean isProd() {
        return "PROD".equals(bundle.getString(KEY));
    }

    /**
     * DEV TEST PROD
     *
     * @return
     */
    public static String getEnv() {
        return bundle.getString(KEY);
    }

    public static void main(String[] args) {
        System.out.println(getEnv());
        System.out.println(isDev());
        System.out.println(isTest());
        System.out.println(isProd());
    }
}
