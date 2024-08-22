package TNGPkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@Parameters({"URL"})
@Test
public void WebLoginCarLoan(String urlname) {
	
	System.out.println("WEblogin-CarLoan");
	System.out.println(urlname);
}
@Test
public void MobileLoginCarLoanCheck() {
	
	System.out.println("Mobilelogin-CarLoan-Check");
}

@BeforeMethod
public void checkingBeforemethod() {
	
	System.out.println("before Method");
}


@Test
public void MobileLoginCarLoan() {
	
	System.out.println("Mobilelogin-CarLoan");
}


@Test
public void LoginAPICarLoan() {
	
	System.out.println("Carlogin-CarLoan");
}

}
