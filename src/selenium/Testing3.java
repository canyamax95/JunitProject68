package selenium;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Testing3 {
	@Rule
	public ErrorCollector err = new ErrorCollector();


	@Test
	public void test6() {
		String expected = "abc";
		
		String actual = "abc1"; // this will have different output
		//String actual = "abc";
		/*if(expected.equals(actual)){
			System.out.println("Pass");
			}else {
				System.out.println("Fail");
			}*/ // we cannot use for if else to check the conditon in JUnit
		
		System.out.println("Before Assertion");
		Assert.assertEquals(expected, actual); //Hard or regular assert which we use in industry
		System.out.println("After 1st Assert");
		Assert.assertTrue("Verifying 2>3", 4>3);
		System.out.println("After 2nd Assert");
		
	
	}
	
	@Test
	public void test7() {
		String expected = "abc";
		String actual = "abc1";
		System.out.println("Before Assert");
		try {
		Assert.assertEquals(expected, actual); 
		}catch(Throwable t) {
			System.out.println("I'm in 1st catch");
			err.addError(t);
		}
		System.out.println("After 1st Assert");
		try {
		Assert.assertTrue("Verifying 2>3", 2>3);
		}catch(Throwable t) {
			System.out.println("I'm in 2nd Assert");
			err.addError(t);
		}
		System.out.println("After 2nd Assert");
	}

}
