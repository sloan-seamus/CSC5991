package hw3_package;
import hw3_package.register_class;
import hw3_package.index_class;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class main_class {
	
	public static void register_tests(WebDriver driver) throws InterruptedException {
		register_class.test_case_1000(driver);
		register_class.test_case_1001(driver);
		register_class.test_case_1002(driver);
		register_class.test_case_1003(driver);
		register_class.test_case_1004(driver);
		register_class.test_case_1005(driver);
		register_class.test_case_1006(driver);
		register_class.test_case_1007(driver);
		register_class.test_case_1008(driver);
		register_class.test_case_1009(driver);
		register_class.test_case_1010(driver);
		register_class.test_case_1011(driver);
	}	
	public static void index_tests(WebDriver driver) throws InterruptedException {
		/*index_class.test_case_2000(driver);
		index_class.test_case_2001(driver);
		index_class.test_case_2002(driver);
		index_class.test_case_2003(driver);
		index_class.test_case_2004(driver);
		index_class.test_case_2005(driver);
		index_class.test_case_2006(driver);*/
	}
	
	public static void main(String args[]) throws InterruptedException {
		/* Declare all URL strings */
		String chromedriver_path = "D:\\Downloads\\Software Testing\\chromedriver_win32\\chromedriver.exe";
		String index_url = "http://localhost/index.php";
		
		/* Declare all Selenium required objects */
		System.setProperty("webdriver.chrome.driver", chromedriver_path);
		WebDriver driver = new ChromeDriver();
		
		
		/* Begin application for testing */
		register_tests(driver);
		System.out.println("\nRegistration Test Cases Completed.\n\n");
		//index_tests(driver);
		//create_tasks_tests(driver);
		//edit_tasks_tests(driver);
		driver.close();
		
		
	}
}
