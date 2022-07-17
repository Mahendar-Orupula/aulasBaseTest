package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Aulas_Base.BaseTest;

public class AnnouncementPage extends BaseTest



{
	@FindBy(xpath="//a[@href='/announcement']")
	WebElement Announcement;
	@FindBy(xpath="//div[contains(@class,'ant-page-header-compact')]")
	WebElement AnnouncementText;
	//**************validateAnyOneAnnouncement******************//
	@FindBy(xpath="//div[@class='ant-tabs-tab']")
	WebElement Announced;
	@FindBy(xpath="(//div[@class='sc-dJjYzT CmgHA cursor-pointer'])[1]")
	WebElement anyoneAnnouncement;
	@FindBy(xpath="//span[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement CloseButton;
		//*******************CreateNewAnnounced*********************************//
	@FindBy(xpath="//span[text()='+ Create']")
	WebElement CreateButton;
	@FindBy(xpath="(//input[@class='ant-input'])[2]")
	WebElement EnterTitle;
	@FindBy(xpath="(//input[@class='ant-input'])[3]")
	WebElement EnterTitle1;
	@FindBy(xpath="//div[contains(@class,'container')]/div[1]")
	WebElement EnterDescription;
	@FindBy(xpath="(//div[contains(@class,'ant-select-selector')])[2]")
	WebElement SelectTarget;
	@FindBy(xpath="(//div[contains(@class,'ant-select-selector')])[3]")
	WebElement SelectTarget1;
	//Target
	@FindBy(xpath="(//div[contains(@class,'holder')])[3]/div[1]")
	WebElement TargetAll;
	@FindBy(xpath="(//div[text()='All'])[3]")
	WebElement TargetAll1;
	@FindBy(xpath="(//div[contains(@class,'holder')])[3]/div[2]")
	WebElement TargetTeacher;
	@FindBy(xpath="(//div[contains(@class,'holder')])[3]/div[3]")
	WebElement TargetStudent;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[3]")
	WebElement StudentClassSelector;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[4]")
	WebElement StudentClassSelector1;
	@FindBy(xpath="(//div[text()='All'])[2]")
	WebElement StudentClass;
	@FindBy(xpath="(//div[contains(@class,'holder')])[3]/div[4]")
	WebElement TargetDataOperator;
	@FindBy(xpath="(//div[contains(@class,'holder')])[3]/div[5]")
	WebElement TargetOperation;
	@FindBy(xpath="//span[text()='Save As Draft']")
	WebElement SaveAsDraftbtn;
	@FindBy(xpath="//span[text()='Announce Now']")
	WebElement AnnounceBtn;
	@FindBy(xpath="//span[@class='ant-modal-close-x']")
	WebElement CloseAnnounceBtn;

	//*******************Header/font Change*********************************//
	@FindBy(xpath="//span[@class='ql-picker-label']")
	WebElement SelectHeading;
	@FindBy(xpath="(//span[@class='ql-picker-item'])[1]")
	WebElement Heading1;
	@FindBy(xpath="(//span[@class='ql-picker-item'])[2]")
	WebElement Heading2;
	@FindBy(xpath="(//span[@class='ql-picker-item'])[3]")
	WebElement NormalHeading;
	@FindBy(xpath="//button[@class='ql-bold']")
	WebElement Bold;
	@FindBy(xpath="//button[@class='ql-italic']")
	WebElement Italic;
	@FindBy(xpath="//button[@class='ql-underline']")
	WebElement Underline;
	@FindBy(xpath="(//button[@class='ql-list'])[1]")
	WebElement Numbers;
	@FindBy(xpath="(//button[@class='ql-list'])[2]")
	WebElement bulletpoints;
	@FindBy(xpath="//button[@class='ql-link']")
	WebElement links;
	///////////////***********Draft************//////////
	@FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[1]")
	WebElement Draft;
	@FindBy(xpath="(//div[@class='sc-bqiRlB dTUKFo cursor-pointer'])[1]")
	WebElement Draft1;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-default']")
	WebElement SaveAsDraft;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement DeleteDraft;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[3]")
	WebElement AnounceNowDraft;
	@FindBy(xpath="(//input[@class='ant-input'])[1]")
	WebElement DraftEnterSearch;
	@FindBy(xpath="(//span[@class='ant-input-suffix'])[1]")
	WebElement DraftEnterSearchClose;
	@FindBy(xpath="(//span[@class='ant-input-group-addon'])[1]")
	WebElement DraftSearch;
	@FindBy(xpath="//span[@style='font-weight: bold; font-family: roboto;']")
	WebElement DraftCount;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[1]")
	WebElement DraftFilter;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[1]")
	WebElement DraftFilterAll;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[2]")
	WebElement DraftFilterTeacher;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[3]")
	WebElement DraftFilterStudent;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[4]")
	WebElement DraftFilterDataOperator;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[5]")
	WebElement DraftFilterOperation;
	
	
    ///////////////***********Announce************//////////
	@FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[2]")
	WebElement Announce;
	@FindBy(xpath="(//div[@class='sc-dJjYzT CmgHA cursor-pointer'])[1]")
	WebElement Announce1;
	@FindBy(xpath="//button[@class='ant-modal-close']")
	WebElement IntoMarkClose;
	@FindBy(xpath="(//input[@class='ant-input'])[2]")
	WebElement AnnounceEnterSearch;
	@FindBy(xpath="(//span[@class='ant-input-suffix'])[2]")
	WebElement AnnounceEnterSearchClose;
	@FindBy(xpath="(//span[@class='ant-input-group-addon'])[2]")
	WebElement AnnounceSearch;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[2]")
	WebElement AnnounceFilter;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[6]")
	WebElement AnnounceFilterAll;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[7]")
	WebElement AnnounceFilterTeacher;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[8]")
	WebElement AnnounceFilterStudent;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[9]")
	WebElement AnnounceFilterDataOperator;
	@FindBy(xpath="(//div[@class='ant-select-item-option-content'])[10]")
	WebElement AnnounceFilterOperation;
	
	
	public AnnouncementPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	//private static Logger log=LogManager.getLogger(AnnouncementPage.class.getName());
	
	public void AnnouncementClick() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement Communication = driver.findElement(By.xpath("//div[text()='Communication']"));
		Thread.sleep(2000);
      	js.executeScript("arguments[0].scrollIntoView(true)", Communication);
      	wait.until(ExpectedConditions.elementToBeClickable(Announcement));
		Announcement.click();
		Thread.sleep(2000);
		
		
	}
	public void AnnouncementClose() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(CreateButton));
		CreateButton.click();
		Thread.sleep(4000);
		CloseAnnounceBtn.click();
		Thread.sleep(4000);
		//log.debug("Announcement Page is closed");
	}
	
	public void AnnouncementCreation() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(CreateButton));
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys(" Today and Tommorow Holidays Declered for the Ugadi festival");
		Thread.sleep(2000);
		
	}
	public void AnnouncementCreation1() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(CreateButton));
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle1.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(2000);
		EnterDescription.sendKeys(" Today and Tommorow Holidays Declered for the Ugadi festival");
		Thread.sleep(2000);
		
	}
	public void VerifyPopUp() throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement messagElement = driver.findElement(By.xpath("//div[@class='ant-notification-notice-content']"));
		String act = messagElement.getText();
		System.out.println("The actual text is:" + act);
		Thread.sleep(2000);
	}
	public void AnnouncementforAll() throws InterruptedException
	{
		Thread.sleep(1000);
		SelectTarget.click();
		Thread.sleep(2000);
		TargetAll.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		VerifyPopUp();
	}
	public void AnnouncementforTeacher() throws InterruptedException
	{
		Thread.sleep(1000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetTeacher.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		VerifyPopUp();
	}
	
	public void AnnouncementforStudent() throws InterruptedException
	{
		Thread.sleep(1000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetStudent.click();
	    Thread.sleep(2000);
	    StudentClassSelector1.click();
		Thread.sleep(2000);
		StudentClass.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		VerifyPopUp();
	}
	public void AnnouncementforDataOperator() throws InterruptedException
	{
		Thread.sleep(1000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetDataOperator.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		VerifyPopUp();
	}
	public void AnnouncementforOperation() throws InterruptedException
	{
		Thread.sleep(2000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetOperation.click();
	    Thread.sleep(2000);
		AnnounceBtn.click();
		Thread.sleep(2000);
		VerifyPopUp();
	}
	public void SaveAsDraftCreation() throws InterruptedException
	{
		Thread.sleep(1000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetAll.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
		VerifyPopUp();
	}
	public void SaveAsDraftforTeacher() throws InterruptedException
	{
		Thread.sleep(1000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetTeacher.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
	    VerifyPopUp();
	}
	public void SaveAsDraftforStudent() throws InterruptedException
	{
		Thread.sleep(1000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetStudent.click();
	    Thread.sleep(2000);
	    StudentClassSelector1.click();
		Thread.sleep(2000);
		StudentClass.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
	    VerifyPopUp();
	}
	public void SaveAsDraftforDataOperator() throws InterruptedException 
	{
	    wait(3000);
		SelectTarget1.click();
		wait(3000);
		TargetDataOperator.click();
		wait(3000);
	    SaveAsDraftbtn.click();
	    VerifyPopUp();
	    
	}
	
	public void SaveAsDraftforOperation() throws InterruptedException
	{
		Thread.sleep(2000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetOperation.click();
	    Thread.sleep(2000);
	    SaveAsDraftbtn.click();
		Thread.sleep(2000);
		VerifyPopUp();
	}
	
	public void EditDraftAnnouncement(String name, String des) throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(Draft));
		Draft.click();
		Thread.sleep(2000);
		Draft1.click();
		Thread.sleep(2000);
		WebElement ele=EnterTitle1;
		ele.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		ele.sendKeys(Keys.DELETE);
		ele.sendKeys(name);
		Thread.sleep(2000);
		WebElement element=EnterDescription;
		element.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		element.sendKeys(Keys.DELETE);
		element.sendKeys(des);
		Thread.sleep(3000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetAll.click();
		Thread.sleep(2000);
		AnounceNowDraft.click();
		Thread.sleep(2000);	
		VerifyPopUp();
		

	}
	public void EditSaveasDraftAnnouncement(String name, String des) throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(Draft));
		Draft.click();
		Thread.sleep(2000);
		Draft1.click();
		Thread.sleep(2000);
		WebElement ele=EnterTitle1;
		ele.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		ele.sendKeys(Keys.DELETE);
		ele.sendKeys(name);
		Thread.sleep(2000);
		WebElement element=EnterDescription;
		element.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		element.sendKeys(Keys.DELETE);
		element.sendKeys(des);
		Thread.sleep(3000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetAll.click();
		Thread.sleep(2000);
		SaveAsDraft.click();
		Thread.sleep(2000);	
		VerifyPopUp();

	}
	public void DeleteAnnouncement() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(Draft));
		Draft.click();
		Thread.sleep(2000);
		Draft1.click();
		Thread.sleep(2000);
		DeleteDraft.click();
		Thread.sleep(2000);
		VerifyPopUp();

	}

	public void OpenAnnouncedAnnouncement() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(Announced));
		Announced.click();
		Thread.sleep(2000);
		anyoneAnnouncement.click();
		Thread.sleep(2000);
		CloseButton.click();
	}
	public void SearchDraftAnnouncement(String search) throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(Draft));
		Draft.click();
		Thread.sleep(2000);
		DraftEnterSearch.sendKeys(search);
		Thread.sleep(2000);
		DraftSearch.click();
		Thread.sleep(2000);	

	}
	
	public void SearchAnnouncement(String search) throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(Announce));
		Announce.click();
		Thread.sleep(2000);
		AnnounceEnterSearch.sendKeys(search);
		Thread.sleep(2000);
		AnnounceSearch.click();
		Thread.sleep(2000);	


	}
	public void DraftFilter() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(Draft));
		Draft.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterAll.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterTeacher.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterStudent.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterDataOperator.click();
		Thread.sleep(2000);
		DraftFilter.click();
		Thread.sleep(2000);
		DraftFilterOperation.click();
		Thread.sleep(2000);
	}
	public void AnnouncedFilters() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(Announce));
		Announce.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterAll.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterTeacher.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterStudent.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterDataOperator.click();
		Thread.sleep(2000);
		AnnounceFilter.click();
		Thread.sleep(2000);
		AnnounceFilterOperation.click();
		Thread.sleep(2000);
		
	
	}
	
	public void validateAnnouncementDescription(String name,String des) throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(CreateButton));
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle1.sendKeys(name);
		Thread.sleep(2000);
		EnterDescription.sendKeys(des);
		Thread.sleep(2000);
		SelectHeading.click();
		Thread.sleep(2000);
		Heading1.click();
		Thread.sleep(2000);
		Bold.click();
		Thread.sleep(2000);
		EnterDescription.sendKeys("This is a");
		Thread.sleep(2000);
		Italic.click();
		EnterDescription.sendKeys("This is a");
		Thread.sleep(2000);
		Underline.click();
		Thread.sleep(2000);
		EnterDescription.sendKeys("This is a");
		Thread.sleep(2000);
		Numbers.click();
		Thread.sleep(2000);
		SelectTarget1.click();
		Thread.sleep(2000);
		TargetAll.click();
		Thread.sleep(2000);
		AnnounceBtn .click();
		Thread.sleep(4000);
		VerifyPopUp();
	}
     
}
	
	
	
   

