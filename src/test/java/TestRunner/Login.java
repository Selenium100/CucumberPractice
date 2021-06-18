package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Login.feature"},
glue= {"StepDefination"},
plugin= {"pretty", "json:target/MyReport/report.json", "junit:target/MyReport/report.xml"},
publish=true
		)
public class Login {

}
