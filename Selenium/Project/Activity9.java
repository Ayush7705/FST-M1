import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity9
{

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

        WebElement userName = driver.findElement(By.id("user_login"));
        WebElement password = driver.findElement(By.id("user_pass"));
        WebElement login = driver.findElement(By.id("wp-submit"));

        userName.sendKeys("root");
        password.sendKeys("pa$$w0rd");
        login.click();

        driver.findElement(By.xpath("//div[contains(text(), 'Job Listings')]")).click();
        driver.findElement(By.xpath("//a[contains(@class, 'page-title-action')]")).click();
        driver.findElement(By.xpath("//button[@aria-label=\"Close dialog\"]")).click();
        driver.findElement(By.id("post-title-0")).sendKeys("Test_Specialist1");
        driver.findElement(By.xpath("//h2[contains(@class, 'hndle ui-sortable-handle')]")).click();
        driver.findElement(By.xpath("//*[@id=\"_company_website\"]")).sendKeys("www.ibm.com");
        driver.findElement(By.xpath("//*[@id=\"_filled\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div[1]/div/div[1]/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("//button[@class=\"components-button editor-post-publish-button editor-post-publish-button__button is-primary\"]")).click();
        System.out.println("Published successfully !");


        //driver.close();
    }

}
