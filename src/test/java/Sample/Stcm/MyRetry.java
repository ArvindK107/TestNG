package Sample.Stcm;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer{
int count = 1;
int limit = 4;
	@Override
	public boolean retry(ITestResult result) {
		if (count<limit) {
			count++;
			return true;
		}
		return false;
	}
}
