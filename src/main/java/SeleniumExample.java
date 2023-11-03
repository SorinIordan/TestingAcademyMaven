import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
    @SuppressWarnings({ "null", "unused" })
    public static void main(String[] args) {
        // Specify the path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "chromedriver-win64/chromedriver.exe");

        // Initialize the Chrome WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a webpage
        driver.get("https://www.google.com");

        // Find and click the "Accept All Cookies" button (you need to inspect the page to get the correct selector)
        WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb"));
        if (acceptCookiesButton.isDisplayed()) {
            acceptCookiesButton.click();
        }

        // Find the search input element by its name attribute (Google's search bar has name="q")
        WebElement searchBar = driver.findElement(By.name("q"));

        WebElement searchInput = null;
        searchInput = driver.findElement(By.id("APjFqb"));
        // Type a search query and submit
        searchInput.sendKeys("selenium webDriver");
        searchInput.sendKeys(Keys.ENTER);

        // Wait for a few seconds to see the search results (you can adjust this time)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
