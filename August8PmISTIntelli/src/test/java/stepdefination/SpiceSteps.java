package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utlility.TestContext;

public class SpiceSteps {
    TestContext context;
    public SpiceSteps(TestContext context){
        this.context = context;
    }

    @Given("user enter the from value")
    public  void enterFromValue(){
        context.pageObjectManager.getSpiceHomePage().clickFromDropdown();
        context.pageObjectManager.getSpiceHomePage().enterFromValue("JAI");

    }

    @And("user enter the to value")
    public void userEnterTheToValue() {

    }
}
