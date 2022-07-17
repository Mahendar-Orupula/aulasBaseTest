package CoursesTest;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.AnnouncementPage;
import Pages.CoursePage;
import Pages.HomePage1;
import Pages.LoginClass;



public class DataOperatorAdminCoursesTest extends BaseTest {
	
	LoginClass LC;
    HomePage1 HP;
	CoursePage CP;
	AnnouncementPage AP;
	
	public DataOperatorAdminCoursesTest() {
		super();
	}
	@BeforeSuite
	public void setup() throws InterruptedException
	{
		initilization();
	
		
		CP=new CoursePage();
		
		AP=new AnnouncementPage();

		LC = new LoginClass();
		
		HP = LC.MobileRegister(prop.getProperty("DataOperatorAdmin"), prop.getProperty("DefaultOTP"));
		
	}	
	
	@Test(priority=1,groups="DataOperatorAdmin Courses Module")
	public void CourseCreations() throws InterruptedException{
		CP.ClickonCourse();
		Thread.sleep(2000);
		CP.CancelCourse();
		Thread.sleep(2000);
		CP.CourseCreation("CourseCreationForDays");
		Thread.sleep(2000);
		CP.CourseCreation("CourseCreationForMonths");
		Thread.sleep(2000);
		CP.CourseCreation("CourseCreationForYears");
		Thread.sleep(2000);
	}

	@Test(priority=2,groups="DataOperatorAdmin Courses Module")
	public void CourseUpdate() throws InterruptedException{
		Thread.sleep(2000);
		CP.CourseUpdate();
		Thread.sleep(2000);
	}
	@Test(priority=3,groups="DataOperatorAdmin Courses Module")
	public void CourseDelete() throws InterruptedException{
		Thread.sleep(2000);
		CP.CourseDelete();
		Thread.sleep(2000);
	}
	@Test(priority=4,groups="DataOperatorAdmin Courses Module")
	public void SearchCourse() throws InterruptedException{
		Thread.sleep(2000);
		CP.SearchCourse();
		Thread.sleep(2000);
	}

	@AfterSuite
	public void taerDown() {
		driver.quit();
	}
	
}
	
	

