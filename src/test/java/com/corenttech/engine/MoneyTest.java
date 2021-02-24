package com.corenttech.engine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	void testMultiplecation() {
		Doller five = new Doller(5);
		five.times(10);
		assertEquals(50, five.getAmount());
	}

}
