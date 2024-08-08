package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class wpjobpage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"menu-item-2966\"]/a")
	WebElement candidate;
	@FindBy(xpath="//*[@id=\"user_login\"]\r\n")
	WebElement emailtext;
	@FindBy(xpath="//*[@id=\"user_password\"]")
	WebElement pswd;
	@FindBy(xpath="//*[@id=\"wpjb_submit\"]\r\n")
	WebElement login;
	@FindBy(xpath="//*[@class=\"wpjb-box wpjb-layer-inside wpjb-box-myresume\"]")
	WebElement myresume;
	@FindBy(xpath="//*[@id=\"first_name\"]")
	WebElement  fname;
	@FindBy(xpath="//*[@id=\"last_name\"]")
	WebElement  lname;
	@FindBy(xpath="	//*[@id=\"user_email\"]\r\n")
	WebElement  mailid;
	@FindBy(xpath="")
	WebElement  browsefile;
	@FindBy(xpath="//*[@id=\"candidate_location\"]")
	WebElement  city;
	@FindBy(xpath="//*[@id=\"wpjb-resume\"]/fieldset[8]/input\r\n")
	WebElement  update;
	@FindBy(xpath="//*[@id=\"wpjb_widget_custommenu\"]/li[4]/a\r\n")
	WebElement  jobs;
	@FindBy(xpath="//*[@id=\"query\"]\r\n")
	WebElement  jobsearch;
	@FindBy(xpath="	//*[@id=\"wpjb-top-search-form\"]/div[2]/a[1]\r\n")
	WebElement  searchbutton;
	@FindBy(xpath="//*[@id=\"post-2957\"]/div/div/div[2]/div/div[2]/div[1]/a")
	WebElement abstarct;
	@FindBy(xpath="//*[@id=\"wpjb-scroll\"]/div[1]/a[2]")
	WebElement bookmark;
	@FindBy(xpath="//*[@id=\"wpjb_widget_custommenu\"]/li[13]/a\r\n")
	WebElement mybookmark;
	@FindBy(xpath="//*[@id=\"wpjb_widget_custommenu\"]/li[21]/a")
	WebElement logout;
	@FindBy(xpath="	//*[@id=\"candidate_country\"]\r\n")
	WebElement dropdown;
	
	public wpjobpage(	WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void test() {				
		candidate.click();
	}
	public void setvalue(String email,String password) throws InterruptedException {
		Thread.sleep(3000);
emailtext.clear();
emailtext.sendKeys(email);
pswd.clear();
pswd.sendKeys(password);
login.click();

}
	public void afterlogin() throws InterruptedException {
		myresume.click();
		fname.clear();
		fname.sendKeys("Nikitha");
		lname.clear();
		lname.sendKeys("Prasad");
		mailid.clear();
		mailid.sendKeys("mari4255@gmail.com");
		city.clear();
		city.sendKeys("kakkanad");
		Thread.sleep(3000);
		dropdown.click();
		Select s =new Select(dropdown);
		s.selectByValue("356");
				
	}
	
	
	public void jobs() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		update.click();
		jobs.click();
		jobsearch.sendKeys("Quality Assurance tester");
		searchbutton.click();
		abstarct.click();
		bookmark.click();
		mybookmark.click();
		logout.click();
		
	}
}