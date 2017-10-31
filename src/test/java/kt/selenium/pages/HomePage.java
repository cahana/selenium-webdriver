package kt.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 */
public class HomePage extends Page {

  @FindBy(how = How.TAG_NAME, using = "h1")
  @CacheLookup
  public WebElement header;
  
  @FindBy(id = "wufooFormk1s67pra09vehqk")
  public WebElement iframe;
  
  @FindBy(id = "Field5")
  public List<WebElement> radioButtons;
  
  @FindBy(id = "Field5_11")
  public WebElement chosenRadio;
  
  @FindBy(id = "form990")
  public WebElement submit;

  By iframeLocator = By.id("wufooFormk1s67pra09vehqk");
  By formLocator = By.id("form990"); // submit this
  By liLocator = By.id("fo990li5");
  By ahanaLocator = By.id("Field5_11"); // select this; verify it's Isaiah; name=Field5
  By submitButton = By.id("saveForm");
  By kahahwaiLocator = By.id("Field2_6");
  
  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }
  
  public HomePage switchToFrame() {
	  driver.switchTo().frame(iframe);
	  return this;
  }
  
  public HomePage submitForm() {
	  driver.findElement(kahahwaiLocator).click();
	  driver.findElement(ahanaLocator).click();
	  driver.findElement(submitButton).submit();
	  
	  return this;
  }
}
