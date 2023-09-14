package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clist {
static WebDriver d; 
	public void Opening_browser()
{
	
System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
d=new ChromeDriver();
d.get("https://thinking-tester-contact-list.herokuapp.com/");
d.manage().window().maximize();
}
public void title()
{
	
System.out.println(d.getTitle());
}
public void url()
{
	
System.out.println(d.getCurrentUrl());
}
public void sign_up()
{
d.findElement(By.id("signup")).click();
d.findElement(By.id("firstName")).sendKeys("balakrishna");
d.findElement(By.id("lastName")).sendKeys("Yeddanapudi");
d.findElement(By.id("email")).sendKeys("yeddanapudi16@gmail.com");
d.findElement(By.id("password")).sendKeys("Sarada_123");
d.findElement(By.id("submit")).click();
}

	
	
	
}


