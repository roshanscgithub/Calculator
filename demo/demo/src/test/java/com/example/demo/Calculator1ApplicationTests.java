package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Calculator1ApplicationTests {

	@Test
	public void testadd() {
		assertEquals(15, Calculator.add(10, 5), 0);
	}

	@Test
	public void testsub() {
		assertEquals(5, Calculator.sub(10, 5), 0);
	}

	@Test
	public void testmul() {
		assertEquals(50, Calculator.mul(10, 5), 0);
	}

	@Test
	public void testdiv() {
		assertEquals(2, Calculator.divInt(10, 5), 0);
	}
}
