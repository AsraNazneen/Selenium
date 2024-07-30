package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testscenario1 {
@Test (priority=1)
	public void first_testcase() {

		System.out.println("This is my first testcase");
		Assert.assertEquals("hello", "hello world");
	}
@Test(groups="Sanity")
	public void second_testcase() {

		System.out.println("This is my second testcase");

	}
@Test(priority=0)
	public void third_testcase() {

		System.out.println("This is my third testcase");

}
@Test(enabled=false)
public void fourth_testcase() {

	System.out.println("This is my fourth testcase"); 
}
@Test(priority=-1)
public void fifth_testcase() {

		System.out.println("This is my fifth testcase");
}
@Test(dependsOnMethods="third_testcase")
public void sixth_testcase() {

			System.out.println("This is my sixth testcase");
}
@Test(priority=-3)
public void seventh_testcase() {

				System.out.println("This is my seventh testcase"); }}