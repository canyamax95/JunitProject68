package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		System.out.println("login");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		System.out.println("logout");
	}

	@Test
	public void test1() {
		//System.out.println("login");
		System.out.println("test1");
		//System.out.println("logout");
		
	}
	@Test
	public void test2() {
		//System.out.println("login");
		System.out.println("test2");
		//System.out.println("logout");
	}
	@Test
	public void test3() {
		//System.out.println("login");
		System.out.println("test3");
		//System.out.println("logout");
	}
		

}
