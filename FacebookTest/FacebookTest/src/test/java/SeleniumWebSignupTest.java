import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumWebSignupTest {

    //import the selenium webDriver
    private WebDriver driver;

    @Test
    public void start() throws InterruptedException {
        //Locate where the chromedriver is
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        //1 Open your chrome browser
        driver = new ChromeDriver();

        //2 input your selenium Demo page Url (https://selenium-blog.herokuapp.com/)
        driver.get("https://selenium-blog.herokuapp.com/");

        //wait globally for full loading
        Thread.sleep(10000);

        //3 Maximize the page
        driver.manage().window().maximize();

        //4. Click on the signup button to open the signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();

        //5.Input your username on the username field
        driver.findElement(By.id("user_username")).sendKeys("Mercy10");

        //6.Input your Email on the Email field
        driver.findElement(By.id("user_email")).sendKeys("mercy10@futura.com");

        //7. Locate the password field and inout your password
        driver.findElement(By.id("user_password")).sendKeys("admin");

        //8. Click on Signup button
        driver.findElement(By.id("submit")).click();

        //9. Wait for Success message
        Thread.sleep(5000);

        //10. Click on user1 item on the list page
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();

        //10. Search for an element (Using python with selenium) amd confirm if it is present
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/a")).click();

        //11. click on logout
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();

    }

        @AfterTest
        public void closeBrowser(){
            //Quit the browser
            driver.quit();

        }







    }

