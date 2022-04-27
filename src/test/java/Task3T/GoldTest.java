package Task3T;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Task3.Gold;

public class GoldTest {

	
	@BeforeAll
	static void testStart() {
	System.out.println("Starting Test suite!");
	}
	@BeforeEach
	void testStarteach() {
	System.out.println("Starting the test");
	}
	
	@Test 
	void test1 () {	
	Gold Test1 = new Gold();
	int actual = Test1.place(297, 90);
	int expected= 1;
	assertEquals(expected, actual, "Inncorect");
	}
	@Test
	void test2 () {	
	Gold Test2 = new Gold();
	int actual = Test2.place(66, 110);
	int expected= 2;
	assertEquals(expected, actual, "Inncorect");
	}
	@Test
	void test3 () {	
	Gold Test3 = new Gold();
	int actual = Test3.place(257, 113);
	int expected= 3;
	assertEquals(expected, actual, "Inncorect");
	}
	@Test
	void test4 () {	
	Gold Test4 = new Gold();
	int actual = Test4.place(276, 191);
	int expected= 4;
	assertEquals(expected, actual, "Inncorect");
	}
	@Test
	void test5 () {	
	Gold Test5 = new Gold();
	int actual = Test5.place(280, 129);
	int expected= 5;
	assertEquals(expected, actual, "Inncorect");
	}
	
}
