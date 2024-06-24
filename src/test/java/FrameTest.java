import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.demoqa.enams.Endpoints.FRAMES;

public class FrameTest extends BaseTest{


    @Test(description = "Verify thet driver can switch to another frame")
    public void doubleClickTest(){
        browserHelper.open(ConfigReader.getValue("baseURL") + FRAMES.getEndpoint());
        iframeHelper.switchToFrame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        iframeHelper.switchToParentFrame();
        System.out.println(driver.findElement(By.tagName("h1")).getText());


    }
}
