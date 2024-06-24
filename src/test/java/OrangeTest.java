import com.demoqa.enams.TopBarMenuEnums;
import org.testng.annotations.Test;

public class OrangeTest extends BaseTest{
    @Test
    public void orangeTest() throws InterruptedException{
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        orangePage.fillUpRegistration();
        Thread.sleep(5000);

        orangePage.topBarAndItems(TopBarMenuEnums.JOB,"Employment Status");
    }
}
