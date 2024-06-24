import com.demoqa.utils.ConfigReader;
import org.testng.annotations.Test;

import static com.demoqa.enams.Endpoints.MENU;

public class MenuTest extends BaseTest{

    @Test(description = "Verify move to element method is working")
    public void moveToElementTest() throws InterruptedException {
        browserHelper.open(ConfigReader.getValue("baseURL") + MENU.getEndpoint());
        webElementActions.moveToElement(demoQa.getMenuPage().mainItem2);
        Thread.sleep(5000);

    }
}
