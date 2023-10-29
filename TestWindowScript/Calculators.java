package TestWindowScript;

import java.net.URL;
import java.util.concurrent.TimeUnit;

//import io.appium.java_client.windows.WindowsDriver;

public class Calculators {

//     static WindowsDriver CalculatorSession;
//   public static void main(String[] args)
//   {
//	   
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("platformName", "Windows");
//            capabilities.setCapability("deviceName", "WindowsPC");
//            capabilities.setCapability("app",   "Microsoft.WindowsCalculator_8weky...");
//            CalculatorSession = new WindowsDriver (new URL("http://127.0.0.1:4723"), capabilities);
//            CalculatorSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//
//            CalculatorSession.findElementByName("Clear").click();
//            CalculatorSession.findElementByName("Seven").click();
//            CalculatorResult = CalculatorSession.findElementByName("Display is 7");
//            Assert.assertNotNull(CalculatorResult);
//
//        }catch(Exception e){
//            e.printStackTrace();
//        } finally {
//        }
//    }
//
//    @Before
//    public void Clear()
//    {
//        CalculatorSession.findElementByName("Clear").click();
//        Assert.assertEquals("Display is 0", CalculatorResult.getText());
//    }
//
//    @AfterClass
//    public static void TearDown()
//    {
//        CalculatorResult = null;
//        if (CalculatorSession != null) {
//            CalculatorSession.quit();
//        }
//        CalculatorSession = null;
//    }
//
//    @Test
//    public void Addition()
//    {
//        CalculatorSession.findElementByName("One").click();
//        CalculatorSession.findElementByName("Plus").click();
//        CalculatorSession.findElementByName("Seven").click();
//        CalculatorSession.findElementByName("Equals").click();
//        Assert.assertEquals("Display is 8", CalculatorResult.getText());
//    }
//
//    @Test
//    public void Combination()
//    {
//        CalculatorSession.findElementByName("Seven").click();
//        CalculatorSession.findElementByName("Multiply by").click();
//        CalculatorSession.findElementByName("Nine").click();
//        CalculatorSession.findElementByName("Plus").click();
//        CalculatorSession.findElementByName("One").click();
//        CalculatorSession.findElementByName("Equals").click();
//        CalculatorSession.findElementByName("Divide by").click();
//        CalculatorSession.findElementByName("Eight").click();
//        CalculatorSession.findElementByName("Equals").click();
//        Assert.assertEquals("Display is 8", CalculatorResult.getText());
//    }
//
//    @Test
//    public void Division()
//    {
//        CalculatorSession.findElementByName("Eight").click();
//        CalculatorSession.findElementByName("Eight").click();
//        CalculatorSession.findElementByName("Divide by").click();
//        CalculatorSession.findElementByName("One").click();
//        CalculatorSession.findElementByName("One").click();
//        CalculatorSession.findElementByName("Equals").click();
//        Assert.assertEquals("Display is 8", CalculatorResult.getText());
//    }
//
//    @Test
//    public void Multiplication()
//    {
//        CalculatorSession.findElementByName("Nine").click();
//        CalculatorSession.findElementByName("Multiply by").click();
//        CalculatorSession.findElementByName("Nine").click();
//        CalculatorSession.findElementByName("Equals").click();
//        Assert.assertEquals("Display is 81", CalculatorResult.getText());
//    }
//
//    @Test
//    public void Subtraction()
//    {
//        CalculatorSession.findElementByName("Nine").click();
//        CalculatorSession.findElementByName("Minus").click();
//        CalculatorSession.findElementByName("One").click();
//        CalculatorSession.findElementByName("Equals").click();
//        Assert.assertEquals("Display is 8", CalculatorResult.getText());
    }



