package day1;

import org.openqa.selenium.By;

public class Add_List extends Clist{

public void Contact()
{
	d.findElement(By.id("add-contact")).click();
	
}
	
public static void main(String[] args) {

	Add_List a1=new Add_List();
a1.Opening_browser();
a1.title();
a1.url();
a1.Contact();

			
	}

}
