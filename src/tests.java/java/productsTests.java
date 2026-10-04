package src.tests.java.java;

public class productsTests {
    public void addProductToCart() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        productsPage productsPage = new productsPage(driver);
        productsPage.clickProduct();

        loginPage loginPage = new loginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
    }
    
}
