package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"C:\\Users\\nisum\\IdeaProjects\\FreeCrmBDDFramework\\src\\main\\java\\features\\login.feature","C:\\Users\\nisum\\IdeaProjects\\FreeCrmBDDFramework\\src\\main\\java\\features\\deals.feature"},
        glue={"stepDefinations"},//the path of the step definition files
        format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},//to generate different types of reporting
        dryRun = false,//to check the mapping is proper between feature file and step def file
        monochrome = true,//display the console output in a proper readable format
        strict = true//it will check if any step is not defined in step definition file


)
        public class TestRunner {
}
