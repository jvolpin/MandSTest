/**
 * Created by Juan on 09/09/2015.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber"},
        features = "src/test/resources"
        )

public class CukesRunner {}
