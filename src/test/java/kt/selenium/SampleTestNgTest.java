package kt.selenium;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kt.selenium.pages.HomePage;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test(invocationCount = 924)
  public void testHomePageHasAHeader() {
    driver.get(baseUrl);
    // base test
    Assert.assertTrue("".equals(homepage.header.getText()));
    
    // switch to iframe
    homepage = homepage.switchToFrame();
    
    // select Isaiah's radio button
    Assert.assertFalse(homepage.chosenRadio.isSelected());
    
    // make sure this is Isaiah's radio
//    System.out.println(homepage.chosenRadio.getText());
//    Assert.assertTrue((homepage.chosenRadio.getText()).contains("Ahana"));
    
    homepage.submitForm();
    
//    homepage = homepage.switchToFrame();
    
//    Assert.assertTrue(homepage.chosenRadio.isSelected());
    
    
  }
}
