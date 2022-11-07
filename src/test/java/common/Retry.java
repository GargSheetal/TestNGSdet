package common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//Test case for its execution is in the assertions package > Assertion example

public class Retry implements IRetryAnalyzer{

	// copy paste the following code from testNG web-site from the Re-running failed test-cases section
	private int retryCount = 0;
	  private static final int maxRetryCount = 4; // it represents the number of times the test will be retried.
	 
	  
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	
}
