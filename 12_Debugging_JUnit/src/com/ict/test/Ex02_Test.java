package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex02;

public class Ex02_Test {
	Ex02 ex2 ;
	@Before
	public void testBefore() {
		ex2 = new Ex02();
	} 
	
	@Test
	public void test() {
		int res = ex2.mul(4, 5);
		assertEquals(20, res);
	}
	
	@After
	public void testAfter() {
		
	}

}
