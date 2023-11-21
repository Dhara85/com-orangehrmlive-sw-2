package browserfactory;
/**
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 * 1. Create the package ‘browserfactory’ and create the class with the name ‘BaseTest’ inside the
 * ‘browserfactory’ package. And write the browser setup code inside the class ‘Base Test’.
 * 2. Create the package ‘testsuite’ and create the following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. ForgotPasswordTest
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {
    static String browser = "Chrome"; // declared globally

    public static WebDriver driver;

    public void openBrowser(String baseUrl) {
        if (browser.equalsIgnoreCase("Chrome")) {  // If else from Java
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Browser name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
        public void closeBrowser() {
            driver.quit();

        }
    }
