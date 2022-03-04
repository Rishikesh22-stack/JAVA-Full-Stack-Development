package com.simplilearn.testdemojunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 test Cases")
public class StandardTestClass {

	@BeforeAll
	void initAll()
	{
		System.out.println("Before all");
	}
	@BeforeEach
	void init()
	{
		System.out.println("Before Each");
	}
	@Test
	void myTest()
	{
		System.out.println("Test Case Excuted");
	}
	@Test
	void failingTest()
	{
		System.out.println("Test Case Fail");
	}
	@AfterEach
	void tearDown()
	{
		System.out.println("");
	}
}
