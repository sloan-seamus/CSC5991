package hw3_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class register_class {
	static String usernames[] = {"Test1", "Test2", "Test3", "Test4", "Test5", "Test6", "Test7", "Test8", "Test9" ,"Test10"};
	static String passwords[] = {"Test1", "Test2", "Test3", "Test4", "Test5", "Test6", "Test7", "Test8", "Test9" ,"Test10"};
	static String expectedTitle = "Register";
	static String expectedURL = "http://localhost/register.php";
	static String redirectedURL = "http://localhost/index.php";
	public static void navigate(WebDriver driver) {
		driver.get("http://localhost/index.php");
	}
	public static Boolean checkTitle(String actual) {
		if(expectedTitle.equals(actual))
			return true;
		else
			return false;
	}
	public static Boolean checkURL(String actual) {
		if (expectedURL.equals(actual))
			return true;
		else
			return false;
	}
	public static void insertUsername(WebDriver driver, String username) {
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys(username);
	}
	public static void insertPassword1(WebDriver driver, String username) {
		driver.findElement(By.xpath("/html/body/form/input[2]")).sendKeys(username);
	}
	public static void insertPassword2(WebDriver driver, String username) {
		driver.findElement(By.xpath("/html/body/form/input[3]")).sendKeys(username);
	}
	public static void registerButton(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
	}
	public static void registerUser(WebDriver driver, String username, String password1, String password2) {
		insertUsername(driver, username);
		insertPassword1(driver, password1);
		insertPassword2(driver, password2);
		registerButton(driver);
		
	}
	
	public static void test_case_1000(WebDriver driver) throws InterruptedException {
		/*Navigate to the Register page */
		navigate(driver);
		driver.findElement(By.xpath("/html/body/a")).click();
		if(!checkTitle(driver.getTitle()))
			System.out.println("TC1000 : Failure : Invalid Title");
		if(!checkURL(driver.getCurrentUrl()))
			System.out.println("TC1000 : Failure : Invalid URL");
		
		
		/* Register a user and verify they were registered */
		registerUser(driver, usernames[0], passwords[0], passwords[0]);	
		String body = driver.findElement(By.xpath("/html/body")).getText();
		if(body.contains("Username is unavailable.")) {
			System.out.println("TC1000 : Failure: Username is unavailable.");
			return;
		}
		if(body.contains("Passwords do not match.")) {
			System.out.println("TC1000 : Failure: Non-matching passwords.");
			return;
		}

		Thread.sleep(4001);
		if(driver.getCurrentUrl().contentEquals(redirectedURL))
			System.out.println("TC1000 : Pass : User was redirected.");
		else
			System.out.println("TC1000 : Failure : User failed to redirect after registration.");
	}
	public static void test_case_1001(WebDriver driver) throws InterruptedException {
		/*Navigate to the Register page */
		
		navigate(driver);
		driver.findElement(By.xpath("/html/body/a")).click();
		if(!checkTitle(driver.getTitle()))
			System.out.println("TC1001 : Failure : Invalid Title");
		if(!checkURL(driver.getCurrentUrl()))
			System.out.println("TC1001 : Failure : Invalid URL");
		
		
		/* Register a user and verify they were registered */
		registerUser(driver, "", passwords[1], passwords[1]);
		//registerUser(driver, "", passwords[1], passwords[2]);	
		String body = driver.findElement(By.xpath("/html/body")).getText();
		if(body.contains("New Username:")) {
			System.out.println("TC1001 : Failure: Invalid User was registered.");
			return;
		}

		Thread.sleep(4001);
		if(driver.getCurrentUrl().contentEquals(expectedURL))
			System.out.println("TC1001 : Pass : User remains at registration page.");
		else
			System.out.println("TC1001 : Failure : Invalid user successfully registered.");
	}
	public static void test_case_1002(WebDriver driver) throws InterruptedException {
		/*Navigate to the Register page */
		
		navigate(driver);
		driver.findElement(By.xpath("/html/body/a")).click();
		if(!checkTitle(driver.getTitle()))
			System.out.println("TC1002 : Failure : Invalid Title");
		if(!checkURL(driver.getCurrentUrl()))
			System.out.println("TC1002 : Failure : Invalid URL");
		
		
		/* Register a user and verify they were registered */
		registerUser(driver, usernames[2], "", passwords[2]);
		String body = driver.findElement(By.xpath("/html/body")).getText();
		if(body.contains("New Username:")) {
			System.out.println("TC1002 : Failure: Invalid User was registered.");
			return;
		}

		Thread.sleep(4001);
		if(driver.getCurrentUrl().contentEquals(expectedURL))
			System.out.println("TC1002 : Pass : User remains at registration page.");
		else
			System.out.println("TC1002 : Failure : Invalid user successfully registered.");
	}
	public static void test_case_1003(WebDriver driver) throws InterruptedException {
		/*Navigate to the Register page */
		
		navigate(driver);
		driver.findElement(By.xpath("/html/body/a")).click();
		if(!checkTitle(driver.getTitle()))
			System.out.println("TC1003 : Failure : Invalid Title");
		if(!checkURL(driver.getCurrentUrl()))
			System.out.println("TC1003 : Failure : Invalid URL");
		
		
		/* Register a user and verify they were registered */
		registerUser(driver, usernames[3], passwords[3], "");
		String body = driver.findElement(By.xpath("/html/body")).getText();
		if(body.contains("New Username:")) {
			System.out.println("TC1003 : Failure: Invalid User was registered.");
			return;
		}

		Thread.sleep(4001);
		if(driver.getCurrentUrl().contentEquals(expectedURL))
			System.out.println("TC1003 : Pass : User remains at registration page.");
		else
			System.out.println("TC1003 : Failure : Invalid user successfully registered.");
	}
	public static void test_case_1004(WebDriver driver) throws InterruptedException {
		/*Navigate to the Register page */
		
		navigate(driver);
		driver.findElement(By.xpath("/html/body/a")).click();
		if(!checkTitle(driver.getTitle()))
			System.out.println("TC1004 : Failure : Invalid Title");
		if(!checkURL(driver.getCurrentUrl()))
			System.out.println("TC1004 : Failure : Invalid URL");
		
		
		/* Register a user and verify they were registered */
		registerUser(driver, usernames[4], "", "");
		String body = driver.findElement(By.xpath("/html/body")).getText();
		if(body.contains("New Username:")) {
			System.out.println("TC1004 : Failure: Invalid User was registered.");
			return;
		}

		Thread.sleep(4001);
		if(driver.getCurrentUrl().contentEquals(expectedURL))
			System.out.println("TC1004 : Pass : User remains at registration page.");
		else
			System.out.println("TC1004 : Failure : Invalid user successfully registered.");
	}
	public static void test_case_1005(WebDriver driver) throws InterruptedException {
		/*Navigate to the Register page */
		
		navigate(driver);
		driver.findElement(By.xpath("/html/body/a")).click();
		if(!checkTitle(driver.getTitle()))
			System.out.println("TC1005 : Failure : Invalid Title");
		if(!checkURL(driver.getCurrentUrl()))
			System.out.println("TC1005 : Failure : Invalid URL");
		
		
		/* Register a user and verify they were registered */
		registerUser(driver, "", "", passwords[5]);
		String body = driver.findElement(By.xpath("/html/body")).getText();
		if(body.contains("New Username:")) {
			System.out.println("TC1005 : Failure: Invalid User was registered.");
			return;
		}

		Thread.sleep(4001);
		if(driver.getCurrentUrl().contentEquals(expectedURL))
			System.out.println("TC1005 : Pass : User remains at registration page.");
		else
			System.out.println("TC1005 : Failure : Invalid user successfully registered.");
	}
	public static void test_case_1006(WebDriver driver) throws InterruptedException {
		/*Navigate to the Register page */
		
		navigate(driver);
		driver.findElement(By.xpath("/html/body/a")).click();
		if(!checkTitle(driver.getTitle()))
			System.out.println("TC1005 : Failure : Invalid Title");
		if(!checkURL(driver.getCurrentUrl()))
			System.out.println("TC1005 : Failure : Invalid URL");
		
		
		/* Register a user and verify they were registered */
		registerUser(driver, "", "", passwords[6]);
		String body = driver.findElement(By.xpath("/html/body")).getText();
		if(body.contains("New Username:")) {
			System.out.println("TC1005 : Failure: Invalid User was registered.");
			return;
		}

		Thread.sleep(4001);
		if(driver.getCurrentUrl().contentEquals(expectedURL))
			System.out.println("TC1005 : Pass : User remains at registration page.");
		else
			System.out.println("TC1005 : Failure : Invalid user successfully registered.");
	}
	public static void test_case_1007(WebDriver driver) throws InterruptedException {
		/*Navigate to the Register page */
		
		navigate(driver);
		driver.findElement(By.xpath("/html/body/a")).click();
		if(!checkTitle(driver.getTitle()))
			System.out.println("TC1006 : Failure : Invalid Title");
		if(!checkURL(driver.getCurrentUrl()))
			System.out.println("TC1006 : Failure : Invalid URL");
		
		
		/* Register a user and verify they were registered */
		registerUser(driver, usernames[7], passwords[7], passwords[8]);
		String body = driver.findElement(By.xpath("/html/body")).getText();
		if(body.contains("New Username:")) {
			System.out.println("TC1006 : Failure: Invalid User was registered.");
			return;
		}

		Thread.sleep(4001);
		if(driver.getCurrentUrl().contentEquals(expectedURL))
			System.out.println("TC1006 : Pass : User remains at registration page.");
		else
			System.out.println("TC1006 : Failure : Invalid user successfully registered.");
	}
	public static void test_case_1008(WebDriver driver) throws InterruptedException {
		/*Navigate to the Register page */
		
		navigate(driver);
		driver.findElement(By.xpath("/html/body/a")).click();
		if(!checkTitle(driver.getTitle()))
			System.out.println("TC1007 : Failure : Invalid Title");
		if(!checkURL(driver.getCurrentUrl()))
			System.out.println("TC1007 : Failure : Invalid URL");
		
		
		/* Register a user and verify they were registered */
		registerUser(driver, "", "", "");
		String body = driver.findElement(By.xpath("/html/body")).getText();
		if(body.contains("New Username:")) {
			System.out.println("TC1007 : Failure: Invalid User was registered.");
			return;
		}

		Thread.sleep(4001);
		if(driver.getCurrentUrl().contentEquals(expectedURL))
			System.out.println("TC1007 : Pass : User remains at registration page.");
		else
			System.out.println("TC1007 : Failure : Invalid user successfully registered.");
	}
	public static void test_case_1009(WebDriver driver) throws InterruptedException {
		/*Navigate to the Register page */
		
		navigate(driver);
		driver.findElement(By.xpath("/html/body/a")).click();
		if(!checkTitle(driver.getTitle()))
			System.out.println("TC1009 : Failure : Invalid Title");
		if(!checkURL(driver.getCurrentUrl()))
			System.out.println("TC1009 : Failure : Invalid URL");
		
		
		/* Register a user and verify they were registered */
		registerUser(driver, usernames[0], passwords[8], passwords[8]);
		String body = driver.findElement(By.xpath("/html/body")).getText();
		if(body.contains("New Username:")) {
			System.out.println("TC1009 : Failure: Invalid User was registered.");
			return;
		}
		if(!body.contains("Username is unavailable.")) {
			System.out.println("TC1009 : Failure : Existing username error not displayed.");
			return;
		}

		Thread.sleep(4001);
		if(driver.getCurrentUrl().contentEquals(expectedURL))
			System.out.println("TC1009 : Pass : User remains at registration page.");
		else
			System.out.println("TC1009 : Failure : Invalid user successfully registered.");
	}
	public static void test_case_1010(WebDriver driver) throws InterruptedException {
		/*Navigate to the Register page */
		navigate(driver);
		driver.findElement(By.xpath("/html/body/a")).click();
		if(!checkTitle(driver.getTitle()))
			System.out.println("TC1010 : Failure : Invalid Title");
		if(!checkURL(driver.getCurrentUrl()))
			System.out.println("TC1010 : Failure : Invalid URL");
		
		
		/* Register a user and verify they were registered */
		registerUser(driver, usernames[9], passwords[0], passwords[0]);	
		String body = driver.findElement(By.xpath("/html/body")).getText();
		if(body.contains("Username is unavailable.")) {
			System.out.println("TC1010 : Failure: Username is unavailable.");
			return;
		}
		if(body.contains("Passwords do not match.")) {
			System.out.println("TC1010 : Failure: Non-matching passwords.");
			return;
		}

		Thread.sleep(4001);
		if(driver.getCurrentUrl().contentEquals(redirectedURL))
			System.out.println("TC1010 : Pass : User was redirected.");
		else
			System.out.println("TC1010 : Failure : User failed to redirect after registration.");
	}
	public static void test_case_1011(WebDriver driver) throws InterruptedException {
		/*Navigate to the Register page */
		navigate(driver);
		driver.findElement(By.xpath("/html/body/a")).click();
		if(!checkTitle(driver.getTitle()))
			System.out.println("TC1011 : Failure : Invalid Title");
		if(!checkURL(driver.getCurrentUrl()))
			System.out.println("TC1011 : Failure : Invalid URL");
		
		
		/* Register a user and verify they were registered */
		registerUser(driver, usernames[0], passwords[0], passwords[0]);	
		String body = driver.findElement(By.xpath("/html/body")).getText();
		if(!body.contains("Username is unavailable.")) {
			System.out.println("TC1011 : Failure: Username is unavailable error not displayed.");
			return;
		}
		if(body.contains("Passwords do not match.")) {
			System.out.println("TC1011 : Failure: Non-matching passwords.");
			return;
		}

		Thread.sleep(4001);
		if(driver.getCurrentUrl().contentEquals(expectedURL))
			System.out.println("TC1011 : Pass : User remains at registration page.");
		else
			System.out.println("TC1011 : Failure : Invalid user successfully registered.");
	}
	
}
