import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepic" +
                "ker");

        WebElement dateField = driver.findElement(By.id("datapicker"));
        dateField.sendKeys("10/03/2023");
        dateField.sendKeys(Keys.return);
        driver.quit();
    }
}/