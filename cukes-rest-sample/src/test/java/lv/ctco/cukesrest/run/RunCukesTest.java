package lv.ctco.cukesrest.run;

import cucumber.api.*;
import cucumber.api.junit.*;
import lv.ctco.cukesrest.*;
import org.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
    format = {"pretty", "json:target/cucumber.json", "lv.ctco.cukesrest.formatter.CukesRestJsonFormatter:target/cucumber2.json"},
    features = "classpath:features",
    glue = "lv.ctco.cukesrest.api",
    strict = true
)
public class RunCukesTest {

    @BeforeClass
    public static void setUp() throws Exception {
        new SampleApplication().run(new String[]{"server", "server.yml"});
    }
}
