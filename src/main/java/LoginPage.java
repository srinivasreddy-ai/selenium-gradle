import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class LoginPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement usernamefield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        usernamefield.sendKeys("standard_user");
        WebElement passwordfield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        passwordfield.sendKeys("secret_sauce");
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        loginButton.click();
        driver.quit();
    }
    
}
