package com.springbootmaven.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ResourceBundle;

public class EnvConfig {
	private static final Log log = LogFactory.getLog(EnvConfig.class);
	private static ResourceBundle bundle;
	static {  
		try {
			bundle = ResourceBundle.getBundle("env");  
		} catch (Exception e) {
			log.error("",e);
		}
	}
	public static String v(String key){
		return bundle.getString(key);
	}

    public static Integer num(String key) {
        return Integer.valueOf(v(key));
    }
}
