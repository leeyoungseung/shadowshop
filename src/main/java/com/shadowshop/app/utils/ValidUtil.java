package com.shadowshop.app.utils;

import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidUtil {

	private static final Logger logger = LoggerFactory.getLogger(ValidUtil.class);
	
	public static boolean validation(String pattern, String value) {
		logger.info("pattern : "+pattern);
		logger.info("value : "+value);
		boolean res = Pattern.compile(pattern).matcher(value).matches();
		return res;
	}
}
