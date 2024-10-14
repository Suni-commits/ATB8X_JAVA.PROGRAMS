package Oct.AbstractnewPacka;

public class Baseclass extends GrandBaseclass
{
    void openBrowser(){
        System.out.println("Open chrome browser");
    }
    void closeBrowser()
    {
        System.out.println("Close chrome browser");
    }

    @Override
    void takeScreenshot() {
        System.out.println("screen shots");
    }
}
