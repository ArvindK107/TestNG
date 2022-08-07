package Sample.Stcm;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	private void stuName() {
		SoftAssert sa = new SoftAssert();
		int a = 23212;
		int b = 232132;
	sa.assertNotEquals(a, b);
	sa.assertAll();
	}
	
	@Test
	private void stuDet() {
System.out.println("sdassa");
	}
}
