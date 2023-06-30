package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
					features = {"src\\test\\resources\\execution\\Home.feature"},
					glue = {"execution"},
					plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				)

public class LetCodeRunner extends AbstractTestNGCucumberTests{

}
