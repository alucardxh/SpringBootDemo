package com.example.demo.common.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class IDGeneratorUtils {
	public static String genId() {
		return RandomStringUtils.randomAlphanumeric(32);
	}

	public static String GeneratorRandomNum(int length) {
		return RandomStringUtils.randomAlphanumeric(length);
	}
	
}
