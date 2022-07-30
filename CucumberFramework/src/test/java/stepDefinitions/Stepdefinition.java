package stepDefinitions;




import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.pageobjects.BBBPageObject;
import com.pageobjects.BouncePageObject;
import com.pageobjects.PandGPageObject;
import com.pageobjects.RegistrationPageObject;
import com.pageobjects.SearchPageObject;
import com.pageobjects.ShopProductsPageObject;
import com.pageobjects.WhatsnewPageObject;
import com.utilities.PropertyClass;
import com.utilities.Screenshot;
import com.utilities.Windowhandle;
import com.utilities.baseClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends baseClass{
	PropertyClass property;
	public static baseClass baseObj=new baseClass();
	public Screenshot ScreObj=new Screenshot();
	Logger log=LogManager.getLogger(baseClass.class.getName());
	
	
	@BeforeAll
	public static void browser() throws IOException {
	
		baseObj.ExtentReport();
	
	}
	@Before
	public void extent(Scenario result) {
		extentTest=extent.createTest(result.getName());
		
	}
	@Given("^loading the website$")
    public void loading_the_website() throws Throwable {
		property=new PropertyClass();
		driver=InitializeDriver();
		log.info("initialized driver");
		driver.get(property.geturl());
		log.info("HomePage is opened");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
    }

    @When("^Click on Register$")
    public void click_on_register() throws Throwable {
    	RegistrationPageObject.Register(driver);
    	log.info("Registraction page opened");
    }

    @When("^clicking the search button$")
    public void clicking_the_search_button() throws Throwable {
    	SearchPageObject.Search(driver);
    	log.info("Clicked on search button");
    }

    @Then("^Place (.+)and(.+)and(.+)$")
    public void place_andand(String Firstname, String Emial, String Password) throws Throwable {
    	RegistrationPageObject.SignnowInput(driver, Firstname, Emial, Password);
    	log.info("Entered Firstname, Email,Password ");
    }
    @Then("^Enter (.+)and(.+)$")
    public void enter_and( String Emial, String Password) throws Throwable {
    	RegistrationPageObject.LoginInput(driver, Emial, Password);
    	log.info("Enterd Email,Password");
    }

    @Then("^check whether the text is present or not$")
    public void check_whether_the_text_is_present_or_not() throws Throwable {
    	boolean searchresult=driver.getPageSource().contains("Innovative liquid detergent technology gets between the fibers to clean invisible stains.");
		Assert.assertTrue(searchresult);
		log.info("verified the text in Search Result");
    }

    @And("^Click on Signnow$")
    public void click_on_signnow() throws Throwable {
    	RegistrationPageObject.Signnow(driver);
    	log.info("Clicked on sign now button");
    	Windowhandle.Window(driver);
    	log.info("Child window opened");
    }

    @And("^Click on Create an Account$")
    public void click_on_create_an_account() throws Throwable {
    	RegistrationPageObject.CreateAccount(driver);
    	log.info("Clicked on Create an Account button");
    }

    @And("^Try to Click on Create an Account$")
    public void try_to_click_on_create_an_account() throws Throwable {
    	Assert.assertTrue(RegistrationPageObject.InvalidCreateAccount(driver));
    	log.info("Din't Allowed to click on Create an Account button");
    }
    @And("^Click on Login$")
    public void click_on_login() throws Throwable {
    	RegistrationPageObject.Login(driver);
    	log.info("Clicked on Login");
    }

    @And("^Click on EndLogin$")
    public void click_on_endlogin() throws Throwable {
    	RegistrationPageObject.EndLogin(driver);
    	log.info("Clicked on EndLogin");
    }
    @And("^Try to Click on EndLogin$")
    public void try_to_click_on_endlogin() throws Throwable {
    	Assert.assertTrue(RegistrationPageObject.InvalidEndLogin(driver));
    	log.info("Din't Allowed to click on End Login");
    }

    @And("^Enter the text in searchbox as \"([^\"]*)\"$")
    public void enter_the_text_in_searchbox_as_something(String strArg1) throws Throwable {
        SearchPageObject.Entertext(driver, strArg1);
        log.info("Entered the text in search box");
    }
    
    @When("^Mouse hover on shopproducts$")
    public void mouse_hover_on_shopproducts() throws Throwable {
    	ShopProductsPageObject.Shopfunctionality(driver);
    	log.info("Mouse hovered on shopproducts");
		
    }

    @When("^Click on Whatsnew$")
    public void click_on_whatsnew() throws Throwable {
    	WhatsnewPageObject.Whatsnew(driver);
    	log.info("Clicked on Whatsnew");
		
    }

    @When("^Click on PandG$")
    public void click_on_pandg() throws Throwable {
    	PandGPageObject.PandG(driver);
    	log.info("Clicked on PandG");
    }

    @When("^Click on Bounce$")
    public void click_on_bounce() throws Throwable {
    	BouncePageObject.bounce(driver);
    	log.info("Clicked on Bounce");
    }

    @When("^Click on BBB$")
    public void click_on_bbb() throws Throwable {
    	BBBPageObject.BBB(driver);
    	log.info("Clicked on BBB");
		
    }

    @Then("^Click on shopproducts$")
    public void click_on_shopproducts() throws Throwable {
    	ShopProductsPageObject.Shopnavigation(driver);
    	log.info("Clicked on shopproducts");
    }

    @Then("^Validate the text in page$")
    public void validate_the_text_in_page() throws Throwable {
    	
		boolean Text=driver.getPageSource().contains("Tide Hygienic Clean Heavy Duty 10X Free Power PODS®");
		Assert.assertTrue(Text);
		log.info("Text is validated in page ");
		
    }

    @Then("^Click on fragrenceingredients$")
    public void click_on_fragrenceingredients() throws Throwable {
    	PandGPageObject.Fragrance(driver);
    	log.info("Clicked on fragrenceingredients");
    }

    @Then("^Click on product$")
    public void click_on_product() throws Throwable {
    	BouncePageObject.Product(driver);
    	log.info("Clickied on product");
    }

    @Then("^Check the BBB Text in page$")
    public void check_the_bbb_text_in_page() throws Throwable {
    	boolean pageText=driver.getPageSource().contains("BBB");
		Assert.assertTrue(pageText);
		log.info("Checked the BBB Text in page");
    }

    @And("^Click on powder$")
    public void click_on_powder() throws Throwable {
    	ShopProductsPageObject.Powder(driver);
    	log.info("Clicked on powder");
    }

    @And("^Check the text in page$")
    public void check_the_text_in_page() throws Throwable {
    	boolean powderText=driver.getPageSource().contains("Related articles");
		Assert.assertTrue(powderText);
		log.info("Text verified in powder products Page");
		driver.navigate().back();
		log.info("Navigated back to Page");
    }

    @And("^Validate the text$")
    public void validate_the_text() throws Throwable {
    	boolean ShopText=driver.getPageSource().contains("Tide Products");
		Assert.assertTrue(ShopText);
		log.info("Text verified in Shopproducts Page");
    }
    @And("^Checking the text$")
    public void checking_the_text() throws Throwable {
    	boolean fragranceText=driver.getPageSource().contains("More about the fragrance ingredients we use");
		Assert.assertTrue(fragranceText);
		log.info("Text verified in P&G Page");
    }
    @And("^Check the text in Bouncepage$")
    public void check_the_text_in_Bouncepage() throws Throwable {
    	boolean productText=driver.getPageSource().contains("Bounce® Rapid Touch Up 3-in-1 Clothing Spray");
		Assert.assertTrue(productText);
		log.info("Text verified in Bounce Page");
    }


    @And("^Click on new product in that page$")
    public void click_on_new_product_in_that_page() throws Throwable {
    	WhatsnewPageObject.Product(driver);
    	log.info("Click on new product in that page");
    }

    @And("^Mouse hover on ourbrands$")
    public void mouse_hover_on_ourbrands() throws Throwable {
    	PandGPageObject.Ourproducts(driver);
    	log.info("Mouse hover on ourbrands");
    }

    @And("^Click on search and Enter the text \"([^\"]*)\" in searchbox$")
    public void click_on_search_and_enter_the_text_something_in_searchbox(String strArg2) throws Throwable {
    	BouncePageObject.Search(driver, strArg2);
    	log.info("Clicked on search and Enter the text");
    }

    @After
	public void Teardown(Scenario result) throws IOException {
		if(result.isFailed()) {
			extentTest.log(Status.FAIL, "The Test case Failed is"+result.getName());
			
			String temp=Screenshot.getScreenshot(driver);
			extentTest.fail("faild test", MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			
		}
		
		else{
			extentTest.log(Status.PASS, "The Test case passed is"+result.getName());
		}
		driver.quit();
	}
    @AfterAll
	public static void endreport() {
		extent.flush();
		
		
	}
}
	


