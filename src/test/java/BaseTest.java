import com.demoqa.driver.DriverManeger;
import com.demoqa.helper.AlertHelper;
import com.demoqa.helper.BrowserHelper;
import com.demoqa.helper.IframeHelper;
import com.demoqa.helper.WebElementActions;
import com.demoqa.pages.*;
import com.demoqa.utils.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {


    protected WebDriver driver;
    protected DemoQa demoQa;
    protected WebElementActions webElementActions;
    protected AlertHelper alertHelper;
    protected BrowserHelper browserHelper;
    protected RandomUtils randomUtils;
    protected IframeHelper iframeHelper;
    protected OrangePage orangePage;


    @BeforeClass(alwaysRun = true)
    public void setUp(){
        driver = DriverManeger.getDriver();

        webElementActions = new WebElementActions();
        alertHelper = new AlertHelper(driver);
        browserHelper = new BrowserHelper(driver);
        randomUtils = new RandomUtils();
        iframeHelper = new IframeHelper(driver);
        orangePage = new OrangePage();
        demoQa = new DemoQa();
        demoQa.setUp();



    }
    @AfterClass(alwaysRun = true)
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        DriverManeger.closeDriver();
    }
}
