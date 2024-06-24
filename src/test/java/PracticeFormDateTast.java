import com.demoqa.pages.PracticeFormPageDate;
import com.demoqa.utils.ConfigReader;
import org.testng.annotations.Test;

import static com.demoqa.enams.Endpoints.PRACTICE_FORM;

public class PracticeFormDateTast extends BaseTest{

    @Test
    public void  Test123() throws InterruptedException{
        browserHelper.open(ConfigReader.getValue("baseURL") + PRACTICE_FORM.getEndpoint());
       demoQa.getPracticeFormPageDate().selectDateMonthYear("30 Jun 2020");

       Thread.sleep(7000);
    }


}
