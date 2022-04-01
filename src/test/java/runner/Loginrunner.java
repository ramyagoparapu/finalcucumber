package runner;
	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
		features ="C:\\Users\\vanga\\eclipse-workspace\\finalpracticecucucmber\\src\\test\\java\\featurefile\\finalexam.feature",
		glue = "steps",
		tags = "@blueBackground,@whiteBackground",
		monochrome = true,
				plugin = {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json",
		}
			
			)
	public class Loginrunner {

	}



