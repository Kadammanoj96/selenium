package testNG;

import org.testng.annotations.Test;

public class Ex1 {
	@Test(priority=0)
	public void add() {
    System.out.println("add");
	}
	@Test(priority=-25)
	public void sub() {
		String str= "pune";
		System.out.println(str);

	}
	@Test(priority=100)
	public void book() {
		System.out.println("boAk");
	}
	@Test
	public void Book() {
		System.out.println("book");
	}
	@Test
	public void bBok() {
		System.out.println("bBok");
	}
}
