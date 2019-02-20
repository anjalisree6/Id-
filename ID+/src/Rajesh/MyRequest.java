package Rajesh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyRequest {
	public WebDriver d1;

	@Test 
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d1.manage().window().maximize();
		d1.get("https://milkyway.idaasnext.com/identityplus/#/sessions/signin");
		Thread.sleep(5000);
		d1.findElement(By.xpath("//input[@id='username']")).sendKeys("rrayachoti@milkyway.com");
		d1.findElement(By.xpath("//input[@id='password']")).sendKeys("RR425686rr@$");
		d1.findElement(By.xpath("/html/body/app-root/app-auth-layout/div/app-signin/div/div/mat-card/mat-card-content/form/div[2]/button/span")).click();

		Actions act =new Actions(d1);
		WebElement raj=d1.findElement(By.xpath("//ul[@class='menu p-r-0 full-width ng-star-inserted']//li[2]//div[1]//div[1]//a[1]//mat-icon[2]"));
		act.moveToElement(raj).build().perform();
		Thread.sleep(3000);
		WebElement raj1=d1.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/app-header-top[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
		//raj1 is a sub button
		Thread.sleep(3000);
		act.moveToElement(raj1).click().build().perform();
		act.click(raj1).build().perform();
		Thread.sleep(3000);
		
		d1.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-admin-layout[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[1]/div[1]/app-view-my-request[1]/div[1]")).click();
		d1.findElement(By.xpath("//input[@id='mat-input-30']")).sendKeys("rrayachoti@milkyway.com");
		d1.findElement(By.xpath("//textarea[@id='mat-input-31']")).sendKeys("test");
		d1.findElement(By.xpath("//div[@id='cdk-step-content-5-0']//div[@fxflex='auto']//button[3]")).click();
		
		d1.findElement(By.xpath("//*[@id=\"mat-tab-content-4-0\"]/div/div/mat-card/mat-card-content/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper/datatable-body-row/div[2]/datatable-body-cell[1]/div/a/span")).click();
		




	}


}
