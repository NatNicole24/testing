package com.qualitysteam;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChoucairTestEmpleos {
	
	private WebDriver driver;
	By empleoLinkLocator = By.linkText("Empleos");
	By empleoPageLocator = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/elementor/thumbs/serchazuleMesa-de-trabajo-1-nzblz88m4p4bxdbhw303dezvce7f6561j2nbdlusiw.png']");
	
	By keyWordLocator = By.id("search_keywords");
	By locationLocator = By.id("search_location");
	By searchJobBtnLocator = By.cssSelector("input[ value='Buscar trabajos']");
	
	By jobListLocator = By.className("company_logo");
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}//fin setup

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}// fin TearDown

	@Test
	public void testJobs() throws InterruptedException {
		driver.findElement(empleoLinkLocator).click();
		Thread.sleep(2000);
		//Valida que encuentre despliegue el resultado de la busqueda
		if(driver.findElement(empleoPageLocator).isDisplayed()) {
			driver.findElement(keyWordLocator).sendKeys("pruebas");
			driver.findElement(locationLocator).sendKeys("Panama");
			
			driver.findElement(searchJobBtnLocator).click();
			Thread.sleep(2000);
			driver.findElement(jobListLocator).getClass();
			
		}else {
			System.out.print("Jobs list was not found");
		}
		
		
	}//fin testGooglePage


		
	}


