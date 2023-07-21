package runnerclasesss;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\featuress\\login.feature",
glue = "runnerclasesss")






public class Loginrunner {

}
