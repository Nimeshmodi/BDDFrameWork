package StepDefination;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class RegisterStepDefination {
    WebDriver driver;


    @Given("^User able to open browser$")
    public void user_able_to_open_browser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();


        }

        @Given("^enter the Url$")
        public void enter_the_Url()  {
            driver.get("https://demo.nopcommerce.com/");

        }

        @When("^user click on Register Link$")
        public void user_click_on_Register_Link() {
        driver.findElement(By.className("ico-register")).click();

        }

        @Then("^User on Register Page Verify Register Page Title$")
        public void user_on_Register_Page_Verify_Register_Page_Title()  {
        String title = driver.getTitle();
        System.out.println(title);
            Assert.assertEquals("nopCommerce demo store. Register",title);
        }

        @Then("^User click on Gender$")
        public void user_click_on_Gender()  {
        driver.findElement(By.id("gender-male")).click();

        }

        @Then("^User Enter First Name$")
        public void user_Enter_First_Name()  {
        driver.findElement(By.id("FirstName")).sendKeys("Nimesh");


        }

        @Then("^User Enter Last name$")
        public void user_Enter_Last_name() {
        driver.findElement(By.id("LastName")).sendKeys("Modi");

        }

        @Then("^User Enter Birth of Date$")
        public void user_Enter_Birth_of_Date()  {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/label"));

        }

        @Then("^User Enter Valid Enail$")
        public void user_Enter_Valid_Enail()  {
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("modinimesh.b@gmail.com");

        }

        @Then("^User Enter Company Name$")
        public void user_Enter_Company_Name() {
        driver.findElement(By.id("Company")).sendKeys("unify");

        }

        @Then("^User Enter Password$")
        public void user_Enter_Password()  {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[1]/label")).sendKeys("12345");

        }

        @Then("^User Enter Confirm Password$")
        public void user_Enter_Confirm_Password()  {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[2]/label")).sendKeys("12345");

        }

        @Then("^User is on complete Register Page$")
        public void user_is_on_complete_Register_Page() {
        driver.findElement(By.id("register-button"));


        }

        @Then("^User Close the Browser$")
        public void user_Close_the_Browser()  {
        driver.close();

        }


    }



