package SeleHomework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumClasswork {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","C:\\Users\\Paresh Patel\\IdeaProjects\\software\\Driver\\msedgedriver.exe");
                WebDriver driver= new EdgeDriver();
                driver.get("https://demo.nopcommerce.com/");
    }
}
