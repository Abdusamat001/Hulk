import com.demoqa.entities.TextBoxEntity;
import com.demoqa.pages.TextBoxPage;
import com.demoqa.utils.ConfigReader;
import com.demoqa.utils.RandomUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.demoqa.enams.Endpoints.TEXT_BOX;

public class TextBoxTest extends BaseTest {

    @Test
    public void textBoxTest() throws InterruptedException{
        browserHelper.open(ConfigReader.getValue("baseURL") +  TEXT_BOX.getEndpoint());
        TextBoxEntity textBoxEntity = randomUtils.generateRandomTextBoxEntity();
       demoQa.getTextBoxPage().fillUpTextBoxForm(textBoxEntity);
        Thread.sleep(3000);
        Assert.assertTrue(true);


    }
}
