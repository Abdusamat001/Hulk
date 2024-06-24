import com.demoqa.entities.Employee;
import com.demoqa.pages.WebTablePage;
import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static com.demoqa.enams.Endpoints.WEBTABLE;

public class WebTableTest extends BaseTest{

    @Test(description = "Practice form test")
    public void test123(){
    browserHelper.open(ConfigReader.getValue("baseURL")+WEBTABLE.getEndpoint());
     demoQa.getWebTablePage().addNewEmployee(randomUtils.employeeMockEmployee());
        List<Employee> employees = demoQa.getWebTablePage().getEmployeeFromTable();

        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
    @Test(description = "расспечатать лист")
    public void  test222(){
        browserHelper.open(ConfigReader.getValue("baseURL")+WEBTABLE.getEndpoint());
        List<WebElement> employees = demoQa.getWebTablePage().webTableRow;
        for (WebElement employee : employees){
            System.out.println(employee);
        }

    }

}
