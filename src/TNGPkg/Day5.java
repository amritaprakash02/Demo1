package TNGPkg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day5 {
	@Parameters({"URL","KEY"})
	@Test
	public void checkDay2(String urlname,String keyval) {
		System.out.println("Hello Day2_PL");
		System.out.println(urlname);
		System.out.println(keyval);
		System.out.println("**************************");
	}
	
@Test(dataProvider = "getData")
public void newcheck(String username,String pass) {
	System.out.println("AAAAAAAAAAAAAAa");
	System.out.println(username);
	System.out.println(pass);
}

	@Test(timeOut = 4000 )
	public void demoDay2() {
		System.out.println("Hi Day2_PL");
	}
	
	@BeforeTest(enabled = false)
	public void preRequisite() {
		System.out.println("Before allthe test- preRequisites");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		data[0][0]="firstuser";
		data[0][1]="firstpass";
		
		data[1][0]="seconduser";
		data[1][1]="secondpass";
		
		data[2][0]="thirduser";
		data[2][1]="thirdpass";
		return data;
	}
	

}
