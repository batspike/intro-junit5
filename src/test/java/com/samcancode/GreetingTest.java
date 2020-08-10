package com.samcancode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class GreetingTest {
	private Greeting greeting;
	
	@BeforeEach
	void setup() {
		greeting = new Greeting();
	}

	@Test
	@Order(1)
	void testHelloWorld() {
		System.out.println(greeting.helloWorld());
	}

	@Test
	@Order(2)
	void testHelloWorldString() {
		System.out.println(greeting.helloWorld("Sam"));
	}

}
