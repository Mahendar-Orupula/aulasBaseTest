package ClassroomsTest;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.ClassroomPage;
import Pages.HomePage1;
import Pages.LoginClass;

public class ClassroomsTest extends BaseTest {
	LoginClass LC;
	
    HomePage1 HP;
	
	ClassroomPage CR;
	public ClassroomsTest() {
		super();
		
	}
	@BeforeSuite
	public void setup() throws InterruptedException{
		initilization();
		CR=new ClassroomPage();

		LC = new LoginClass();
		
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
		
	}

	@Test(priority=1, groups="Super Admin Classrooms Module")
	public void ClassroomsOverview() throws InterruptedException{
		CR.ClickonClassrooms();
		WaitTil(2000);
		CR.Overview();
		WaitTil(2000);
		
	}
	
	@Test(priority=2, groups="Super Admin Classrooms Module")
	public void CreateaNewClass() throws InterruptedException{
		CR.ClickonClassrooms();
		WaitTil(2000);
		CR.CreateaNewClass();
		WaitTil(2000);
		CR.UpdateSectionDetails();
		WaitTil(2000);
	}

	@Test(priority=3, groups="Super Admin Classrooms Module")
	public void EditCurriculum() throws InterruptedException{
		CR.ClickonClassrooms();
		WaitTil(2000);
		CR.EditCurriculum();
		Thread.sleep(2000);
	}
	
	
	
	@Test(priority=4, groups="Super Admin Classrooms Module")
	public void ValidateStudentViewDetails() throws InterruptedException {
		WaitTil(2000);
		CR.ClickonClassrooms();
		WaitTil(2000);
		CR.ValidateStudentViewDetails();
	}
	
	@Test(priority=5, groups="Super Admin Classrooms Module")
	public void AddASection() throws InterruptedException{
		WaitTil(2000);
		CR.ClickonClassrooms();
		WaitTil(2000);
		CR.AddASection();
		WaitTil(2000);
		
	}
	@Test(priority=6, groups="Super Admin Classrooms Module")
	public void EditClassDetails() throws InterruptedException{
		WaitTil(2000);
		CR.ClickonClassrooms();
		WaitTil(2000);
		CR.EditClassDetails();
		WaitTil(2000);
		CR.ClassEditTransferIcon();
		WaitTil(2000);
		CR.ClassDelete();
		
	}
	

	@AfterSuite
	public void taerDown() {
		driver.quit();
	}
	
}
