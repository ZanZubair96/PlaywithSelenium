import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

    public static void main(String[] args) {
        System.out.println("=================> Sample Selenium Execution <====================");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        System.out.println(driver.getTitle());

        driver.quit();

    }
}
