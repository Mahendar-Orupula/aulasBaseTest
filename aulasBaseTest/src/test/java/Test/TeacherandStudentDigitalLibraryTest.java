package Test;



import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.ClassroomPage;
import Pages.DigitalLibrary;
import Pages.HomePage1;
import Pages.LoginClass;

public class TeacherandStudentDigitalLibraryTest extends BaseTest {

	LoginClass LC;
	
    HomePage1 HP;
	
    DigitalLibrary  DL;
    
	ClassroomPage CR;
	public TeacherandStudentDigitalLibraryTest() {
		super();
		
	}
	@BeforeSuite
	public void setup() throws InterruptedException{
		initilization();
		CR=new ClassroomPage();

		LC = new LoginClass();
		
		DL = new  DigitalLibrary();
		HP = LC.MobileRegister(prop.getProperty("Teacher"),prop.getProperty("DefaultOTP"));
		
	
	}
	
	@Test(priority=1)
	public void ValidateTeacherDigitalLibraryPage() throws InterruptedException{
	
			WaitTil(4000);
			DL.DigitalLibraryPageValidation();
			
	}
	@Test(priority=2)
	public void ValidateTeacherSectionDetailsPage() throws InterruptedException{
		    WaitTil(2000);
			DL.Section();
			WaitTil(4000);
			DL.ValidateSectionDetailsPage();
			WaitTil(2000);
			DL.BackButton();
			
	}
	@Test(priority=3)
	public void ValidateTeacherSubjectTopicDetailsPage() throws InterruptedException{
		    WaitTil(2000);
			DL.Section();
			WaitTil(4000);
			DL.ValidateSubjectTopicPage("Content");
			for(int i=0;i<4;i++)
			{
				DL.BackButton();	
			}
			
	}
	@Test(priority=4)
	public void TeacherLogOut() throws InterruptedException{
		    WaitTil(2000);
		    LC.LogOut();
				
	}
	
	@Test(priority=5)
	public void StudentLogIn() throws InterruptedException{
		    WaitTil(2000);
		    HP = LC.MobileRegister(prop.getProperty("Student"),prop.getProperty("DefaultOTP"));
				
	}
    
	@Test(priority=6)
	public void ValidateStudentDigitalLibraryPage() throws InterruptedException{
		    
			WaitTil(2000);
			DL.DigitalLibraryPageValidation();
			
	}
	@Test(priority=7)
	public void ValidateStudentSubjectTopicDetailsPage() throws InterruptedException{
		  
			WaitTil(4000);
			DL.ValidateSubjectTopicPage("Content");
			for(int i=0;i<3;i++)
			{
				DL.BackButton();	
			}
			
	}
	
	
}