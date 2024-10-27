package utlility;

public class TestContext {

   public BrowserBase base;
   public PageObjectManager pageObjectManager;

    public TestContext(){
         base = new BrowserBase();
         pageObjectManager = new PageObjectManager(base.browserInvocation());
    }
}
