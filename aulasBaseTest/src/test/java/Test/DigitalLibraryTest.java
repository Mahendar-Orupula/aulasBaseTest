package Test;


import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.ClassroomPage;
import Pages.DigitalLibrary;
import Pages.HomePage1;
import Pages.LoginClass;

public class DigitalLibraryTest extends BaseTest {

	LoginClass LC;
	
    HomePage1 HP;
	
    DigitalLibrary  DL;
    
	ClassroomPage CR;
	public DigitalLibraryTest() {
		super();
		
	}
	@BeforeSuite
	public void setup() throws InterruptedException{
		initilization();
		CR=new ClassroomPage();

		LC = new LoginClass();
		
		DL = new  DigitalLibrary();
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
	
	}
	
	@Test(priority=1)
	public void ValidateDigitalLibraryPage() throws InterruptedException{
			WaitTil(2000);
			DL.ValidateDigitalLibraryPage();
			WaitTil(2000);
			DL.GetMoreStorage("SuperAdmin","");
	}
	@Test(priority=2)
	public void UploadLectureNotes() throws InterruptedException, IOException{

			WaitTil(2000);
			DL.UploadLectureNotes();
	}
	@Test(priority=3)
	public void UploadLocalDeviceVideos() throws InterruptedException, IOException{

			WaitTil(2000);
			DL.UploadLocalDeviceRecordedVideos();
			
	}
	@Test(priority=4)
	public void UploadLocalDeviceDownloadedVideos() throws InterruptedException, IOException{
            WaitTil(2000);
			DL.UploadLocalDeviceDownloadedVideos();
	}
	@Test(priority=5)
	public void UploadYouTubeVideos() throws InterruptedException, IOException{

			WaitTil(2000);
			DL.UploadYouTubeLinkVideos("https://www.youtube.com/watch?v=eIrMbAQSU34");
	}
	@Test(priority=6)
	public void UploadQuestionBanks() throws InterruptedException, IOException{

			WaitTil(2000);
			DL.UploadQuestionBanks();
	}
	@Test(priority = 7)
	public void ValidateSectionDetailsPage() throws InterruptedException {
		WaitTil(2000);
		DL.Section();
		WaitTil(2000);
		DL.ValidateSectionDetailsPage();
		WaitTil(2000);
		DL.BackButton();
		
	}
	@Test(priority = 8)
	public void SectionUploadLectureNotes() throws InterruptedException, IOException {
		WaitTil(2000);
		DL.Section();
		WaitTil(2000);
		DL.SectionUploadLectureNotes();
		WaitTil(2000);
		DL.BackButton();
	}

	@Test(priority = 9)
	public void SectionUploadLocalDeviceVideos() throws InterruptedException, IOException {
		WaitTil(2000);
		DL.Section();
		WaitTil(2000);
		DL.SectionUploadLocalDeviceRecordedVideos();
		WaitTil(2000);
		DL.SectionUploadLocalDeviceDownloadedVideos();
		WaitTil(2000);
		DL.BackButton();
	}

	@Test(priority = 10)
	public void SectionUploadYouTubeVideos() throws InterruptedException, IOException {
		WaitTil(2000);
		DL.Section();
		WaitTil(2000);
		DL.SectionUploadYouTubeLinkVideos("https://www.youtube.com/watch?v=eIrMbAQSU34");
		WaitTil(2000);
		DL.BackButton();
	}

	@Test(priority = 11)
	public void SectionUploadQuestionBanks() throws InterruptedException, IOException {
		WaitTil(2000);
		DL.Section();
		WaitTil(2000);
		DL.SectionUploadQuestionBanks();
		WaitTil(2000);
		DL.BackButton();
	}
	
	@Test(priority = 12)
	public void ValidateSubjectDetailsPage() throws InterruptedException, IOException {
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
	@Test(priority=13)
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
	@Test(priority =14)
	public void SuperAdminLogOut() throws InterruptedException
	{
		WaitTil(1000);
		LC.LogOut();
	}
	
	
		


}
