package cucmberTests;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.composite.WebPage;
import cucmberTests.steps.User;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.elements.init.UIFactory.$;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "classpath:features"
    , glue = {"com.epam.jdi.bdd", "cucmberTests"}
)
public class RunnerTest {

    @BeforeClass()
    public void setUp() {

        WebPage.openUrl("https://jdi-testing.github.io/jdi-light/");
        $("img#user-icon").click();
        new Form<User>().submit(new User().set(u -> { u.name = "Roman"; u.password = "Jdi1234"; }));
    }


    @AfterClass()
    public void tearDownClass() {
        killAllSeleniumDrivers();
    }
}