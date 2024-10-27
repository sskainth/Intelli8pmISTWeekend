package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import utlility.TestContext;

public class Hooks {

    TestContext context;
    public Hooks(TestContext context){
        this.context = context;
    }

    @Before()
    public void preCondition(){
        System.out.println("execution starts..................");
    }

    @After()
    public void postCondition(){

        context.base.browserInvocation().quit();
    }

    @AfterStep()
    public void takeScreenshot(){
        System.out.println("screenshot");
    }

}
