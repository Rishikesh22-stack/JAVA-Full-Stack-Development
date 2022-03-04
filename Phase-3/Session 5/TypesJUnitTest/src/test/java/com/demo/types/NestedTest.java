package com.demo.types;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.platform.runner.JUnitPlatform;

@DisplayName("JUnit 5 Conditional Test")
@RunWith(JUnitPlatform.class)
public class NestedTest {

	@BeforeAll
	static void beforeAll()
	{
		System.out.println("Before All Test Methods");
	}
	@BeforeEach
	void beforeEach()
	{
		System.out.println("Before Each Test Methods");
	}
	@AfterEach
	void afterEach()
	{
		System.out.println("After Each Test Methods");
	}
	@AfterAll
	static void afterall()
	{
		System.out.println("After All Test Methods");
	}
	@Nested
	@DisplayName("Test For Another Inner classess")
	class AnotherInner
	{
		
	}
	
}
