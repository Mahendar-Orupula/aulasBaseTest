package Test;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.AnnouncementPage;
import Pages.HomePage1;
import Pages.LoginClass;

public class AnnouncementTest extends BaseTest{
	LoginClass LC;
	
    HomePage1 HP;
	
	AnnouncementPage AP;

	
	public AnnouncementTest() {
		super();
	}
	
	@BeforeSuite
	public void setup()throws InterruptedException{
		initilization();
		

		AP=new AnnouncementPage();

		LC = new LoginClass();
		
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
		
	
		
	}
	
	@Test(priority=1,groups="Announcement Module")
	public void AnnouncementClose() throws InterruptedException{
		Thread.sleep(1000);
		AP.AnnouncementClick();
		Thread.sleep(2000);
		AP.AnnouncementClose();
		Thread.sleep(2000);
		
	}
	@Test(priority=2,groups="Announcement Module")
	public void AnnouncementCreation() throws InterruptedException{
		Thread.sleep(1000);
		AP.AnnouncementCreation();
		Thread.sleep(1000);
		AP.AnnouncementforAll();
		Thread.sleep(1000);
	}
	@Test(priority=3,groups="Announcement Module")
	public void AnnouncementforTeacher() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementCreation1();
		Thread.sleep(2000);
		AP.AnnouncementforTeacher();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=4,groups="Announcement Module")
	public void AnnouncementforStudent() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementCreation1();
		Thread.sleep(2000);
		AP.AnnouncementforStudent();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=5,groups="Announcement Module")
	public void AnnouncementforDataOperator() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementCreation1();
		Thread.sleep(2000);
		AP.AnnouncementforDataOperator();
		Thread.sleep(2000);
		
	}
	@Test(priority=6,groups="Announcement Module")
	public void AnnouncementforOperation() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementCreation1();
		Thread.sleep(2000);
		AP.AnnouncementforOperation();
		Thread.sleep(2000);
		
	}
	@Test(priority=7,groups="Announcement Module")
	public void SaveAsDraftCreation() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementCreation1();
		Thread.sleep(2000);
		AP.SaveAsDraftCreation();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=8,groups="Announcement Module")
	public void SaveAsDraftforTeacher() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementCreation1();
		Thread.sleep(2000);
		AP.SaveAsDraftforTeacher();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=9,groups="Announcement Module")
	public void SaveAsDraftforStudent() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementCreation1();
		Thread.sleep(2000);
		AP.SaveAsDraftforStudent();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=10,groups="Announcement Module")
	public void SaveAsDraftforDataOperator() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementCreation1();
		Thread.sleep(2000);
		AP.SaveAsDraftforDataOperator();
		Thread.sleep(2000);
		
	}
	@Test(priority=11,groups="Announcement Module")
	public void SaveAsDraftforOperation() throws InterruptedException{
		Thread.sleep(2000);
		AP.AnnouncementCreation1();
		Thread.sleep(2000);
		AP.SaveAsDraftforOperation();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=12,groups="Announcement Module")
	public void validateAnnouncementDescription() throws InterruptedException{
	
		Thread.sleep(2000);
		AP.validateAnnouncementDescription("Testing Department","This is a Testing Department. \r\n"
				+ "This is a Testing.\r\n"
				+ "﻿This is a Aulas.");
		Thread.sleep(2000);
	} 
	@Test(priority=13,groups="Announcement Module")
	public void EditDraftAnnouncement() throws InterruptedException{
		Thread.sleep(2000);
		AP.EditDraftAnnouncement("Testing Department","This is a Testing Department");
		Thread.sleep(2000);
		
	}
	@Test(priority=14,groups="Announcement Module")
	public void EditSaveasDraftAnnouncement() throws InterruptedException{
		Thread.sleep(2000);
		AP.EditSaveasDraftAnnouncement("Testing Department","This is a Testing Department");
		Thread.sleep(2000);
		
	}
	@Test(priority=15,groups="Announcement Module")
	public void DeleteAnnouncement() throws InterruptedException{
		Thread.sleep(2000);
		AP.DeleteAnnouncement();
		Thread.sleep(2000);
		
	}
	@Test(priority=16,groups="Announcement Module")
	public void OpenAnnouncedAnnouncement() throws InterruptedException{
		Thread.sleep(2000);
		AP.OpenAnnouncedAnnouncement();
		Thread.sleep(2000);
		
	}
	@Test(priority=17,groups="Announcement Module")
	public void DraftFilter() throws InterruptedException{
		Thread.sleep(2000);
		AP.DraftFilter();
		Thread.sleep(2000);
		
	}

	@Test(priority=18,groups="Announcement Module")
	public void AnnouncedFilters() throws InterruptedException{
	
		Thread.sleep(2000);
		AP.AnnouncedFilters();
		Thread.sleep(2000);
	} 
	
	@Test(priority=19,groups="Announcement Module")
	public void SearchDraftAnnouncement() throws InterruptedException{
		Thread.sleep(2000);
		AP.SearchDraftAnnouncement("Testing Department");
		Thread.sleep(2000);
		
	}
	@Test(priority=20,groups="Announcement Module")
	public void SearchAnnouncedAnnouncement() throws InterruptedException{
		Thread.sleep(2000);
		AP.SearchAnnouncement("Testing Department");
		Thread.sleep(2000);
		
	} 
	
	
}