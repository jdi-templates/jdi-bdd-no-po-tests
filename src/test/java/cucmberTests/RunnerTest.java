package cucmberTests;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.composite.WebPage;
import cucmberTests.steps.User;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.elements.init.UIFactory.$;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "classpath:features"
    , glue = {"com.epam.jdi.bdd", "cucmberTests"}
    , plugin = "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
)
public class RunnerTest {

    @BeforeClass()
    public static void setUp() {

        WebPage.openUrl("https://jdi-testing.github.io/jdi-light/");
        $("img#user-icon").click();
        new Form<User>().submit(new User().set(u -> { u.name = "Roman"; u.password = "Jdi1234"; }));
    }


    @AfterClass()
    public static void tearDownClass() {
        killAllSeleniumDrivers();
    }
}