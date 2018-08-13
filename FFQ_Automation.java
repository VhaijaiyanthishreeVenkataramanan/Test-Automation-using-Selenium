package ffq;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ffq_Auto_New {
	

	public static void main(String[] args) throws InterruptedException {
		
		// initialize Chrome WedDriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\usw38n0\\Documents\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        
        // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        
        WebDriverWait wait = new WebDriverWait(driver, 30);

		String appUrl = "https://csstr.farmers.com/REGquote/ffq/landingpage.jsf";
		
		System.out.println("URL is : " + appUrl + " " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) );
		
		// launch the browser and open the application url 
		driver.get(appUrl);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.className("BtnNew")));
		
		System.out.println("New selection " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) );
		
		driver.findElement(By.id("landing:quoteType")).sendKeys("Auto Insurance");
		driver.findElement(By.id("landing:zipCode")).sendKeys("91364");
		driver.findElement(By.className("BtnNew")).click();
		// Thread.sleep(5000);
		
		System.out.println("Your Information " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) );
		
		// YOUR INFO
		wait.until(ExpectedConditions.elementToBeClickable(By.id("FFQAuto_Yourinfo_startQuoteBtn")));
		
		driver.findElement(By.id("FFQAuto_Yourinfo_firstName")).sendKeys("VJ");
		driver.findElement(By.id("FFQAuto_Yourinfo_lastName")).sendKeys("Raggy");
				
		// WebElement BirthDate= driver.findElement(By.id("FFQAuto_Yourinfo_Dob"));
		
		Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("FFQAuto_Yourinfo_Dob")));
        actions.click();
        actions.sendKeys("02011965");
        actions.build().perform();
        		
		// WebElement gender;
		WebElement gender1;
		
		// gender = driver.findElement(By.id("FFQAuto_Yourinfo_gender"));
		gender1 = driver.findElement(By.id("FFQAuto_Yourinfo_gender1"));
			
		gender1.click();
				
		driver.findElement(By.id("FFQAuto_Yourinfo_ResedentialAddress")).sendKeys("6301 Owensmouth Ave");
		driver.findElement(By.id("FFQAuto_Yourinfo_Apartment")).sendKeys("Suite 101");
		driver.findElement(By.id("FFQAuto_Yourinfo_City")).sendKeys("Woodland Hills");
		driver.findElement(By.id("FFQAuto_Yourinfo_question")).click();
		// driver.findElement(By.id("FFQAuto_Yourinfo_question1")).click();
		// Thread.sleep(2000);
		
		driver.findElement(By.id("FFQAuto_Yourinfo_startQuoteBtn")).click();
		
		System.out.println("Vehicles " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) );
		
		// VEHICLES
		wait.until(ExpectedConditions.elementToBeClickable(By.id("FFQAuto_Vehicle_vehicleYearMakeModelbtn")));
				
		driver.findElement(By.id("FFQAuto_Vehicle_vehicleYear")).sendKeys("1994");
		Thread.sleep(3000);
		driver.findElement(By.id("FFQAuto_Vehicle_vehicleMake")).sendKeys("OLDSMOBILE");
		Thread.sleep(3000);
		driver.findElement(By.id("FFQAuto_Vehicle_vehicleModel")).sendKeys("CIERA 4D CIERA S");
		Thread.sleep(1000);
		driver.findElement(By.id("FFQAuto_Vehicle_vehicleYearMakeModelbtn")).click();
		
		//
		wait.until(ExpectedConditions.elementToBeClickable(By.id("FFQAuto_Vehicle_vehicleTypebtn")));
		
		driver.findElement(By.id("FFQAuto_Vehicle_vehicleTypeSelection")).sendKeys("Sedan");
		driver.findElement(By.id("FFQAuto_Vehicle_vehicleTypebtn")).click();
		Thread.sleep(2000);
		
		//

		driver.findElement(By.xpath("//*[@id=\"FFQAuto_Vehicle_vehicleOn_RO_Wrap\"]/label/span[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("d_expiry_button")).click();
		Thread.sleep(2000);
		// 
		
		driver.findElement(By.xpath("//*[@id=\"FFQAuto_Vehicle_vehicleUsedFor_PLS_Wrap\"]/label/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FFQAuto_Vehicle_milesDrivePerYear")).sendKeys("5600");
		Thread.sleep(1000);
		driver.findElement(By.id("FFQAuto_Vehicle_VehicleCAbtn")).click();
		Thread.sleep(3000);
		
		// 
		
		driver.findElement(By.xpath("//*[@id=\"FFQAuto_Vehicle_rideShare_2_Wrap\"]/label/span[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("FFQAuto_Vehicle_vehicleFeaturesbtn")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//*[@id=\"FFQAuto_Vehicle_VehicleAnother_2_Wrap\"]/label/span[2]")).click();
		Thread.sleep(2000);
		
		System.out.println("Your Information 2 " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) );
		
		driver.findElement(By.xpath("//*[@id=\"FFQAuto_Driver_maritalStatus_S_Wrap\"]/label/span[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"FFQAuto_Driver_occupation_GV_Wrap\"]/label/span[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("FFQAuto_Driver_ageLicensed")).sendKeys("16");
		driver.findElement(By.id("FFQAuto_Driver_licenseUSA_button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("FFQAuto_Driver_emailAddress")).sendKeys("vj.raggy@gmail.com");
		driver.findElement(By.id("FFQAuto_Driver_phoneNumber")).sendKeys("3238487322");
		driver.findElement(By.id("FFQAuto_Driver_addDetailsConbtn")).click();
		Thread.sleep(3000);
		
		System.out.println("Additional Details " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) );
		
		driver.findElement(By.xpath("//*[@id=\"FFQAuto_Driver_accidents_sc2_Wrap\"]/label/span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FFQAuto_Driver_incidentAddContbtn")).click();
		Thread.sleep(8000);

		// Do you want to add another driver - NO
		driver.findElement(By.xpath("//*[@id=\"FFQAuto_Driver_moredriver_sc2_Wrap\"]/label/span[2]")).click();
		Thread.sleep(1000);
		
		// When would you like your new policy to start ? DEFAULT
		wait.until(ExpectedConditions.elementToBeClickable(By.id("d_expiry_button")));
		driver.findElement(By.id("d_expiry_button")).click();
		Thread.sleep(1000);
		
		// Select what you'd like to bundle with auto insurance - CONTINUE/SKIP
		wait.until(ExpectedConditions.elementToBeClickable(By.id("FFQ_Auto-bundlechk_continue-button")));
		driver.findElement(By.id("FFQ_Auto-bundlechk_continue-button")).click();
		Thread.sleep(1000);
		
		
		//
		wait.until(ExpectedConditions.elementToBeClickable(By.id("FFQAuto_Quote_quoteBtn")));
		
		
		driver.findElement(By.id("FFQAuto_Quote_quoteBtn")).click();
		// Thread.sleep(10000);
		
		System.out.println("VIN and Vehicle Info " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) );
		
		
		// Additional Information
		wait.until(ExpectedConditions.elementToBeClickable(By.id("additionalInfo:nextDiscount")));
		
		driver.findElement(By.id("additionalInfo:vehInfo:0:VINValue")).sendKeys("1G3AG55M4R6365946");
		driver.findElement(By.id("additionalInfo:vehInfo:0:currentMileage")).sendKeys("23000");
		driver.findElement(By.id("additionalInfo:drvInfo:0:licNum")).sendKeys("A7522222");
		driver.findElement(By.id("additionalInfo:drvInfo:0:licCountryCd")).sendKeys("United States");
		driver.findElement(By.id("additionalInfo:drvInfo:0:licState")).sendKeys("California");
		driver.findElement(By.xpath("//*[@id=\"additionalInfo:drvInfo:0:raceOrigin:1\"]")).click();
		Thread.sleep(1000);
		
		String MainWindow = driver.getWindowHandle();
				
		driver.findElement(By.id("additionalInfo:nextDiscount")).click();
		Thread.sleep(1000);
		
		/*
		for (String activeHandle : driver.getWindowHandles()) {
		    	
		    	System.out.println("inside for, Active Handle is: " + activeHandle);
		    	
		         if (!activeHandle.equals(MainWindow)) {
		             driver.switchTo().window(activeHandle);
		     }
		}
		
		System.out.println("After for");
		*/
		
		System.out.println("Financial Information " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) );
				
		//
		wait.until(ExpectedConditions.elementToBeClickable(By.id("payment:performCardNext")));
		
		driver.findElement(By.id("payment:accountTypeEc:1")).click();
		driver.findElement(By.id("payment:holderNameEC")).sendKeys("VJ Raggy");
		driver.findElement(By.id("payment:routingNumberEC")).sendKeys("125000024");
		driver.findElement(By.id("payment:frontEndBankAccountNumberEc")).sendKeys("12341234");
		driver.findElement(By.id("payment:duplicateBankAccNumEc")).sendKeys("12341234");
		
		// Credit Card Number
		driver.findElement(By.id("payment:chargeTypeEft:0")).click();
		driver.findElement(By.id("payment:cardTypeEft")).sendKeys("MasterCard");
		driver.findElement(By.id("payment:cardHolderNameEft")).sendKeys("VJ Raggy");
		driver.findElement(By.id("payment:creditCardNumEft")).sendKeys("5555555555554444");
		driver.findElement(By.id("payment:expireMonthEft")).sendKeys("January");
		driver.findElement(By.id("payment:expireYearEft")).sendKeys("2020");
		driver.findElement(By.id("payment:zipCdEft")).sendKeys("91367");
		driver.findElement(By.id("payment:paymentCfChkBox")).click();
		
		System.out.println("Final Selection " + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) );
	
		
	}

}
