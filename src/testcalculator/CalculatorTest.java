package testcalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class CalculatorTest {
	
	@BeforeAll
	public static void testInit()
	{
		System.out.println("before all test");
	}
	
	@AfterAll
	public static void testcompletion()
	{
		System.out.println("after all test");
	}
	@BeforeEach
	public void init()
	{
		System.out.println("test initialization before each test");
	}
	
	@AfterEach
	public void cleanup()
	{
		System.out.println("object de initialized");
	}

	@Test
	void testAdd() {
		
	}

	@Test
	void testSubtract() {
		
	}

	@Test
	void testMultiply() {
		
	}

	@Test
	void testDivide() {
		
	}

}
