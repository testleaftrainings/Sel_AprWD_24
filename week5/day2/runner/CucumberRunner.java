package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features = {"src/test/java/features"},
                 glue="stepdefnition",
                 monochrome = true,
                 publish = true,
                // tags="@regression"  //only smoke testcase
                 tags="@SmokeTestcase or @Sanitytestcase"//It will excute either smoke or sanity
		      //  tags="@functional and @smoke"//scenarios having both @fuctional and @smoke it will execute
                 
                // tags="not @smoke"
               //  tags="@aravind"
		)
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
