package com.example.demo.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class IDGeneratorUtils {
	public static String genId() {
		return RandomStringUtils.randomAlphanumeric(32);
	}
	
}
