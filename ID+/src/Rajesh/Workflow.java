package Rajesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Workflow {
	public WebDriver d1;

	@Test 
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-infobars");
		WebDriver d1=new ChromeDriver(Options);
		d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d1.manage().window().maximize();
		d1.get("https://milkyway.idaasnext.com/identityplus/#/sessions/signin");
		Thread.sleep(5000);
		d1.findElement(By.xpath("//input[@id='username']")).sendKeys("vSingireddy@milkyway.com");
		d1.findElement(By.xpath("//input[@id='password']")).sendKeys("AJlnr3WP");
		d1.findElement(By.xpath("/html/body/app-root/app-auth-layout/div/app-signin/div/div/mat-card/mat-card-content/form/div[2]/button/span")).click();

		//mouse over actions

		Thread.sleep(3000);
		Actions act =new Actions(d1);
		WebElement raj=d1.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/app-header-top/div/div/div/div/ul[2]/li/div/a/mat-icon"));
		act.moveToElement(raj).build().perform();
		Thread.sleep(3000);
		WebElement raj1=d1.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/app-header-top/div/div/div/div/ul[2]/li/div/div/ul/li[2]/a"));
		//raj1 is a sub button
		Thread.sleep(3000);
		act.moveToElement(raj1).click().build().perform();
		act.click(raj1).build().perform();
		Thread.sleep(3000);

		//Create workflow
		WebElement wf=d1.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/app-header-top/div/div/div/div/ul[1]/li[3]/div/div/a"));
		act.moveToElement(wf).build().perform();
		Thread.sleep(3000);
		WebElement wf1=d1.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/app-header-top/div/div/div/div/ul[1]/li[3]/div/div/ul/li/a"));
		//raj1 is a sub button
		Thread.sleep(3000);
		act.moveToElement(wf1).click().build().perform();
		act.click(wf1).build().perform();
		Thread.sleep(3000);

		//click on Add newworkflow

		d1.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/mat-sidenav-container/mat-sidenav-content/div[1]/div[1]/app-view-acces-request/div[1]/button/span")).click();
		d1.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("A_Test");
		d1.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys("Qa");
		d1.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/mat-sidenav-container/mat-sidenav-content/div[1]/div[1]/app-create-acces-request/div/mat-card/mat-card-content/mat-horizontal-stepper/div[2]/div[1]/form/div[1]/div[2]/section[2]/mat-checkbox[1]/label/div")).click();
		d1.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/mat-sidenav-container/mat-sidenav-content/div[1]/div[1]/app-create-acces-request/div/mat-card/mat-card-content/mat-horizontal-stepper/div[2]/div[1]/form/div[2]/div/button[3]/span")).click();
// Select assets
		d1.findElement(By.xpath("//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();

		d1.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/form/div/div[2]/button[3]/span")).click();

		Select dropdown=new Select(d1.findElement(By.xpath("//*[@id=\"mat-select-22\"]/div/div[2]")));
		dropdown.selectByValue("Test");

		Select dropdown1=new Select(d1.findElement(By.xpath("//*[@id=\"mat-select-22\"]/div/div[2]")));
		dropdown1.selectByValue("Manager");

		d1.findElement(By.xpath("//*[@id=\"cdk-step-content-6-2\"]/div[2]/div[2]/button[3]/span")).click();
	}

}
