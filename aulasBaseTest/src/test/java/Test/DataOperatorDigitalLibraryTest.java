package Test;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.ClassroomPage;
import Pages.DigitalLibrary;
import Pages.HomePage1;
import Pages.LoginClass;

public class DataOperatorDigitalLibraryTest extends BaseTest {

	LoginClass LC;
	
    HomePage1 HP;
	
    DigitalLibrary  DL;
    
	ClassroomPage CR;
	public DataOperatorDigitalLibraryTest() {
		super();
		
	}
	@BeforeSuite
	public void setup() throws InterruptedException{
		initilization();
		CR=new ClassroomPage();

		LC = new LoginClass();
		
		DL = new  DigitalLibrary();
		HP = LC.MobileRegister(prop.getProperty("DataOperator"),prop.getProperty("DefaultOTP"));
	
		
	}
	@Test(priority=1)
	public void ValidateDataOperatorDigitalLibraryPage() throws InterruptedException{
		
			WaitTil(2000);
			DL.ValidateDigitalLibraryPage();
			WaitTil(2000);
			DL.GetMoreStorage("DataOperatorAndAdmin", "Please upgrade your subscription plan.");
			
	}
	
	@Test(priority=2)
	public void DataOperatorUploadLectureNotes() throws InterruptedException, IOException{
		
			WaitTil(2000);
			DL.UploadLectureNotes();
	}
	
	@Test(priority=3)
	public void DataOperatorUploadLocalDeviceVideos() throws InterruptedException, IOException{
		
			WaitTil(2000);
			DL.UploadLocalDeviceRecordedVideos();
	}
	@Test(priority=4)
	public void DataOperatorUploadYouTubeVideos() throws InterruptedException, IOException{
		    WaitTil(2000);
		    DL.validateDigitalLibraryText();
		 
			DL.UploadYouTubeLinkVideos("https://www.youtube.com/watch?v=eIrMbAQSU34");
			//DL.UploadLocalDeviceDownloadedVideos();
			
	}

	@Test(priority=5)
	public void DataOperatorUploadQuestionBanks() throws InterruptedException, IOException{
		
			WaitTil(2000);
			DL.UploadQuestionBanks();
	}
	
	@Test(priority=6)
	public void DataOperatorValidateSectionDetailsPage() throws InterruptedException {
		WaitTil(2000);
		DL.Section();
		WaitTil(2000);
		DL.ValidateSectionDetailsPage();
		WaitTil(2000);
		DL.BackButton();
		
	}
	
	@Test(priority=7)
	public void DataOperatorSectionUploadLectureNotes() throws InterruptedException, IOException {
		WaitTil(2000);
		DL.Section();
		WaitTil(2000);
		DL.SectionUploadLectureNotes();
		WaitTil(2000);
		DL.BackButton();
	}

	@Test(priority=8)
	public void DataOperatorSectionUploadLocalDeviceVideos() throws InterruptedException, IOException {
		WaitTil(2000);
		DL.Section();
		WaitTil(2000);
		DL.SectionUploadLocalDeviceRecordedVideos();
		//WaitTil(2000);
		//DL.SectionUploadLocalDeviceDownloadedVideos();
		WaitTil(2000);
		DL.BackButton();
	}

	@Test(priority=9)
	public void DataOperatorSectionUploadYouTubeVideos() throws InterruptedException, IOException {
		WaitTil(2000);
		DL.Section();
		WaitTil(2000);
		DL.SectionUploadYouTubeLinkVideos("https://www.youtube.com/watch?v=eIrMbAQSU34");
		WaitTil(2000);
		DL.BackButton();
	}

	@Test(priority=10)
	public void DataOperatorSectionUploadQuestionBanks() throws InterruptedException, IOException {
		
		WaitTil(2000);
		DL.Section();
		WaitTil(2000);
		DL.SectionUploadQuestionBanks();
		WaitTil(2000);
		DL.BackButton();
	}
	
	@Test(priority=11)
	public void DataOperatorValidateSubjectDetailsPage() throws InterruptedException, IOException {
		WaitTil(2000);
		DL.validateDigitalLibraryText();
		WaitTil(2000);
		DL.Section();
		WaitTil(2000);
		DL.ValidateSubjectTopicDetailsPage("https://www.youtube.com/watch?v=eIrMbAQSU34","Content");
		for(int i=0;i<4;i++)
		{
		WaitTil(2000);
		DL.BackButton();
		}	
	}
	@Test(priority=12)
	public void DataOperatorAddATeacher() throws InterruptedException{
		WaitTil(2000);
		DL.Section();
		WaitTil(2000);
		DL.AssignTeachers();
		for(int i=0;i<2;i++)
		{
		WaitTil(2000);
		DL.BackButton();
		WaitTil(2000);
		}	
	}
	@Test(priority=13)
	public void DataOperatorLogOut() throws InterruptedException
	{
		WaitTil(1000);
		LC.LogOut();
	}
}
