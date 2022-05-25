import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.marionette","C:\\Users\\Paresh Patel\\IdeaProjects\\software\\Driver\\geckodriver.exe");

        WebDriver w = new FirefoxDriver();
        w.get("https://demo.nopcommerce.com/");

    }
}
