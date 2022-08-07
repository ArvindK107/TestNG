package Sample.Stcm;

import org.testng.annotations.Test;

public class Listeners {

	@Test(retryAnalyzer = MyRetry.class)
	private void stuName() {
System.out.println(10/0);
	}
	
	@Test
	private void stuDet() {
System.out.println(20/10);
	}
}
