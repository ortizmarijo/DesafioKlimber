package klimber.StepDefinitions;

import com.sun.istack.internal.logging.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import klimber.page.KlimberAssurancePage;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import klimber.config.BaseConfigProperties;
import klimber.page.BasePage;
import klimber.page.WebDriverHelper;

import java.util.List;

public class StepDefinitions extends WebDriverHelper{
    static WebDriver driver;
    private static Logger log = Logger.getLogger(StepDefinitions.class);
    private final BaseConfigProperties baseConfigProperties = new BaseConfigProperties();
    private static BasePage basePage = new BasePage();
    private static KlimberAssurancePage klimberAssurance = new KlimberAssurancePage();

    public StepDefinitions(){
        driver = Hooks.driver;
    }

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("^I am in app main site$")
    public void iAmInAppMainSite() {
        driver.manage().window().maximize();
        String url = baseConfigProperties.getMainSiteUrlBase();
        log.info("Navigate to: " + url);
        driver.get(url);
        HandleMyWindows.put("main", driver.getWindowHandle());
        waitPageCompletelyLoaded();

    }

    @And("^I wait for first step elements are loaded$")
    public void iWaitForTitleVisible() {
        klimberAssurance.waitForFirstStepElements();
    }

    @Then("^I fill following text boxes:$")
    public void iSetFollowingTextBoxes(List<List<String>> table) {
        klimberAssurance.setFirstStepTextBoxes(table);
    }

    @And("^click on (.*?) button$")
    public void clickOnButton(String tag) {
        klimberAssurance.clickOnButtons(tag);
    }

    @And("^I wait for second step elements are loaded$")
    public void iWaitForSecondStepElementsAreLoaded() {
        klimberAssurance.waitForSecondStepElements();
    }


    @And("^I wait for last step elements are loaded$")
    public void iWaitForLastStepElementsAreLoaded() {
        klimberAssurance.waitForLastStepElements();
    }

    @Then("I fill registration form with values:")
    public void iFillRegistrationFormWithValues(List<List<String>> table) {
        klimberAssurance.setLastStepTextBoxes(table);
    }
}
