package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testscenario6 {
@Test
	public void first_testcase() {

		System.out.println("This is my first testcase");
	}
@Test
	public void second_testcase() {

		System.out.println("This is my second testcase");

	}
@Test
	public void third_testcase() {

		System.out.println("This is my third testcase");
		Assert.assertEquals("hello", "hello world");
}
@Test
public void fourth_testcase() {

	System.out.println("This is my fourth testcase"); 
}
@Test
public void fifth_testcase() {

		System.out.println("This is my fifth testcase");
}
@Test
public void sixth_testcase() {

			System.out.println("This is my sixth testcase");
}
@Test
public void seventh_testcase() {

				System.out.println("This is my first testcase"); }}