package hooks;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplementHooks extends BaseClass {

    @Before
    public static void preCondition(){
            if(driver == null){
                driver = new ChromeDriver();
                String url ="https://www.takealot.com/";
                driver.get(url);
                driver.manage().window().maximize();

                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
            }
    }

    @After
    public static  void postCondition(){
        driver.quit();
        driver = null;
    }
}
