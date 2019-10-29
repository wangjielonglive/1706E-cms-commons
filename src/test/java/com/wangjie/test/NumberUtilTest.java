package com.wangjie.test;

import org.junit.Test;

import com.wangjie.utils.MathUtils;

public class NumberUtilTest {
	@Test
	public void number(){
		int num = 51; 
		int tatal= 68;
		String percnt = MathUtils.percnt(num, tatal);
	
		System.out.println(percnt+"%");
	}
}
