import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title of the page" +driver.getTitle());

        WebElement firstname = driver.findElement(By.id("firstName"));
        WebElement lastname = driver.findElement(By.id("lastName"));
        firstname.sendKeys("Ekta");
        lastname.sendKeys("Dutt");
        WebElement email = driver.findElement(By.id("email"));
        WebElement contactNumber = driver.findElement(By.id("number"));
        email.sendKeys("Ekta.dutt@gmail.com");
        contactNumber.sendKeys("9462246751");
        driver.findElement(By.cssSelector(".ui.green.button")).click();
        driver.close();
    }
}
