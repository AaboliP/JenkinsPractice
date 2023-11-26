package testcases;

import static org.testng.Assert.*;
import org.testng.annotations.Test;
import basetest.InstagramBaseTest;

public class VerifyURL extends InstagramBaseTest{
	
	@Test
	public void verifyURL() {

		assertEquals(driver.getCurrentUrl(), "https://www.instagram.com/", "Expected url is not as same as actual url");
	}
}
