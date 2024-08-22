package TNGPkg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day4 {
	
	@AfterTest(groups="SmokeTest")
	public void afterallthetest() {
		
		System.out.println("At tghe end-Day 4");
	}
	@BeforeSuite
public void beforeentiresuite() {
		
		System.out.println("before entire suite-Day 4");
	}
	@AfterSuite
public void afterentiresuite() {
		
		System.out.println("After entire suite-Day 4");
	}

	
@Test
public void WebLoginHomeLoan() {
	
	System.out.println("WEblogin-Home");
}

@Test
public void MobileLoginHomeLoan() {
	
	System.out.println("Mobilelogin-Home");
}

@Test
public void LoginAPIHomeLoan() {
	
	System.out.println("CarloginAPI-Home");
}

}
