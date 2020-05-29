package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex01;
import com.ict.junit.Ex02;
import com.ict.junit.Ex03;

public class Ex03_Test {
	Ex01 e1 ;
	Ex02 e2 ;
	Ex03 e3 ;
	
	@Before
	public void testBefore() {
		e1 = new Ex01();
		e2 = new Ex02();
		e3 = new Ex03();
	}
	
	@Test
	public void test1() {
		assertEquals(9, e1.add(2, 7));
		assertEquals(-9, e1.add(-2, -7));
		assertEquals(5, e1.add(-2, 7));
		assertEquals(-5, e1.add(2, -7));
		
	    int res = e2.mul(2, 7);
	    assertEquals(14, res);
	}
	
	@Test
	public void test2() {
	    int res = e3.div(7, 2);
	    assertEquals(3, res);
	}
	@After
	public void testAfter() {
		
	}

}
