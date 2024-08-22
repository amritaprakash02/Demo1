package TNGPkg;

import org.testng.annotations.Test;

public class TNGClass {
	
	@Test(groups="SmokeTest")
	public void demo() {
		System.out.println("Hello_PL-Day1_second");
	}
	@Test
	public void demo2() {
		System.out.println("Hello_PL-Day1_third");
	}

	@Test(dependsOnMethods ={"demo","demo2","checkDay2"})
	public void check() {
		System.out.println("Hi_PL-Day1_first");
	}
}
