import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SetUp {

    @Test
    public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver wd=new ChromeDriver();
        wd.get("http://www.gmail.com");
        //commented
    }
}
