package pageObjectPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import objectBasePack.BaseObjectPage;

public class HomePageObject extends BaseObjectPage{

	public HomePageObject(WebDriver d) {
		super(d);
	}

	
	@FindBy(xpath="//input[@name='username']") public WebElement usernametxt;
	@FindBy(xpath="//input[@name='password']") public WebElement passwordtxt;
	@FindBy(xpath="//button[@type='submit']") public WebElement signinbutton;
	
	//homepage objects
	@FindBy(className="topuser-image") public WebElement profileIconHomepage;
	@FindBy(xpath="//div[@class='sstopuser-test']/h4") public WebElement profilePopupTxt;
	@FindBy(xpath="//div[@class='sstopuser-test']/h5") public WebElement profilePopupTxt1;
	@FindBy(xpath="//a[@class='pl25']") public WebElement profilePopupPasswordBtn; ////a[@class='pl25' and text()='Password']
	@FindBy(xpath="//a[@class='pull-right' and text()='Logout']") public WebElement profilePopuplogoutBtn;
	@FindBy(xpath="(//a[@role='button'])[1]") public WebElement threelinesmainheaderbar;
	@FindBy(xpath="//a[@id='beddata']") public WebElement bedstatusbutton;
	@FindBy(xpath="(//i[@class='fas fa-bed'])[1]") public WebElement bedicon;
	@FindBy(xpath="(//div[contains(text(),'vahi')])[1]") public WebElement bediconname;
	@FindBy(xpath="(//a[@title='Task'])[1]") public WebElement taskicon;
	@FindBy(xpath="//a[@class='pull-right pt0']") public WebElement taskiconviewalllink;
	@FindBy(xpath="//button[normalize-space()='month']") public WebElement taskpagecalendermonthpage;
	@FindBy(xpath="//button[normalize-space()='week']") public WebElement taskpagecalenderweekpage;
	@FindBy(xpath="(//button[normalize-space()='day'])[1]") public WebElement taskpagecalenderdaypage;
	@FindBy(className="fc-icon fc-icon-left-single-arrow") public WebElement taskpagecalenderbacknavigtnicon;////span[@class='fc-icon fc-icon-left-single-arrow']
	@FindBy(className="fc-icon fc-icon-right-single-arrow") public WebElement taskpagecalenderforwardnavigtnicon;////span[@class='fc-icon fc-icon-right-single-arrow']
	@FindBy(xpath="//h2[normalize-space()='October 2024']") public WebElement taskpagecalendermonthyeartext;
	////div[@class='fc-bg']//table//tbody//tr
	
	public void user(String username)
	{
		usernametxt.sendKeys(username);
	}
	public void pass(String password)
	{
		passwordtxt.sendKeys(password);
	}
	public void signInButton()
	{
		signinbutton.click();
	}
	
}
