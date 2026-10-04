import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductsPage {
    WebDriver driver;
    By productClick = By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']");
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickProduct() {
        driver.findElement(productClick).click();
        
        driver.quit();
    }
}