import com.demoqa.entities.PractiseFormEntity;
import com.demoqa.utils.ConfigReader;
import org.testng.annotations.Test;

import static com.demoqa.enams.Endpoints.PRACTICE_FORM;

public class PracticeFormTest extends BaseTest{
    @Test
    public void PracticeFormTest() throws InterruptedException {
        browserHelper.open(ConfigReader.getValue("baseURL") + PRACTICE_FORM.getEndpoint());
        PractiseFormEntity practiseFormEntity = randomUtils.generateRandomPractiseFormEntity();
       demoQa.getPracticeFormsPage().fillUpPracticeFormPage(practiseFormEntity);
        Thread.sleep(20000);
    }





}
