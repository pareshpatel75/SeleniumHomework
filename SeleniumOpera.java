import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SeleniumOpera {
    public static void main(String[] args) {
        System.setProperty("webdriver.opera.driver","C:\\Users\\Paresh Patel\\IdeaProjects\\software\\Driver\\operadriver.exe");
        WebDriver wed = new OperaDriver();
        wed.get("https://demo.nopcommerce.com/");

    }
}
