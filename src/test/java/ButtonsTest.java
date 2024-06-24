
import com.demoqa.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.demoqa.enams.Endpoints.BUTTONS;


public class ButtonsTest extends BaseTest {

    @Test(description = "Verify double click button is working propertly")
    public void doubleClickTest(){
        browserHelper.open(ConfigReader.getValue("baseURL") + BUTTONS.getEndpoint());
        webElementActions.doubleClick(demoQa.getButtonsPage().doubleClickBtn);
        Assert.assertEquals(demoQa.getButtonsPage().doubleClickMessage.getText(),"You have done a double click");

    }

    @Test(description = "Verify right click button is working propertly")
    public void rightClickTest(){
        browserHelper.open(ConfigReader.getValue("baseURL")+ BUTTONS.getEndpoint());
        webElementActions.rightClick(demoQa.getButtonsPage().rightClickBtn);
        Assert.assertEquals(demoQa.getButtonsPage().rightClickMessage.getText(),"You have done a right click");

    }
}
