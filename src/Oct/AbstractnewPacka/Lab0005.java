package Oct.AbstractnewPacka;

public class Lab0005 {
    public static void main(String[] args)
    {
        ChromeTC ct=new ChromeTC();
        ct.openBrowser();
        ct.closeBrowser();
        ct.takeScreenshot();
        FirefoxTC ft=new FirefoxTC();
        ft.openBrowser();
        ft.closeBrowser();

    }
}
