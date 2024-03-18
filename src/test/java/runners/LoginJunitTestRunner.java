package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/featureFiles/AdminBeds.feature"},
        glue = {"stepDefinitions","CommonActions"},
                //dryRun = true,
        plugin = {"pretty",

                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

                "timeline:test-output-thread/"

        }


)
public class LoginJunitTestRunner  {



}
