
import com.demoqa.pages.ProgressBarPage;
import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.sql.DriverManager;
import java.time.Duration;

import static com.demoqa.enams.Endpoints.PROGRESS_BAR;

public class ProgressBarTest extends BaseTest {
    @Test(description = "")
    public void progressBarTest() throws InterruptedException {
        browserHelper.open(ConfigReader.getValue("baseURL") +  PROGRESS_BAR.getEndpoint());
        webElementActions.click(demoQa.getProgressBarPage().startStopButton);
        Thread.sleep(2000);
        webElementActions.click(demoQa.getProgressBarPage().startStopButton);
        Thread.sleep(6000);

        System.out.println(demoQa.getProgressBarPage().aria_valueNow.getAttribute("aria-valuenow"));

    }


}
