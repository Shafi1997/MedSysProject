package testCasePack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack.BaseClass;
import pageObjectPack.HomePageObject;

public class Login extends BaseClass{

	
	
	
//	@Test
//	public void loginValidData()
//	{
//
//		d.findElement(By.xpath("//input[@name='username']")).sendKeys("shahajadalam@gmail.com");
//		d.findElement(By.xpath("//input[@name='password']")).sendKeys("w3s@1234");
//		d.findElement(By.xpath("//button[@type='submit']")).click();
//		//click profile icon button
//		d.findElement(By.xpath("//img[@class='topuser-image']")).click();//(//img[@alt='User Image'])[1]   (//img[@src='https://healthcare.w3testing.com/uploads/staff_images/no_image.png'])[1]
//		//verify password option is displayed
//		d.findElement(By.xpath("//a[@class='pl25']")).isDisplayed();
//		//verify logout option is displayed
//		d.findElement(By.xpath("//a[@class='pull-right' and text()='Logout']")).isDisplayed();
//		
//	}
//	
//	@Test
//	public void homePage()
//	{
//		//verify 3 line option at the top left side of header menu bar 
//		d.findElement(By.xpath("//a[@role='button']")).click(); 
//		//click bed status
//		d.findElement(By.xpath("//a[@id='beddata']")).click();
//		//verify the name for whom the bed is allocated
//		d.findElement(By.xpath("(//div[contains(text(),'vahi')])[1]")).isDisplayed();
//		//verify bedicon in bedstatus page
//		d.findElement(By.xpath("(//i[@class='fas fa-bed'])[1]")).click();
//		
//		
//	}
	
	
	
	
	
	
	
	
//	HomePageObject hpo;
	@Test(priority=1)
	public static void loginValidData1()
	{
		HomePageObject hpo=new HomePageObject(d);
		hpo.user("shahajadalam@gmail.com");
		hpo.pass("w3s@1234");
		hpo.signInButton();
		
	}
}
//hpo.usernametxt.sendKeys("shahajadalam@gmail.com");
//hpo.passwordtxt.sendKeys("w3s@1234");
//hpo.signinbutton.click();