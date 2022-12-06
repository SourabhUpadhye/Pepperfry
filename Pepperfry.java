package Project;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Lists;

// import testNG annotations

public class Pepperfry 
{
	@Test
	public void peff()
	{
		String browser;
		
		WebDriver driver = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n User enter the browser name:       ");
		 browser = sc.nextLine();
		 
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium 2022\\FirstseleniumProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium 2022\\FirstseleniumProject\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium 2022\\FirstseleniumProject\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		// open online shopping website
		driver.get("https://www.pepperfry.com/");		
		
		// maximize window
		driver.manage().window().maximize();

		//implicitly wait
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		//validate Title
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Online Furniture Shopping Store: Shop Online in India for Furniture, Home Decor, Homeware Products @ Pepperfry");

		// select furniture
	    WebElement el = driver.findElement(By.xpath("//a[@href='https://www.pepperfry.com/furniture.html?type=hover-furniture']"));
	
		
		//click on seating
		WebElement el1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/ul/li[2]/a"));
		el1.click();	
		
		//click on benches
		WebElement el2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/div[1]/ul/li[3]/a"));
		el2.click();
		
		System.out.println("==================================================================");
		System.out.println("  Types of 6 Benches:  ");
		System.out.println("==================================================================");
		
	//	Click on Modern benches
		WebElement el3 = driver.findElement(By.xpath("//*[@id=\"page-wrapper-content\"]/div[2]/div/div/div[2]/div/ul/li[1]/a/div/div[2]/h5"));
		el3.click();
		
	// Modern Benches & Options 	
         List <WebElement> links	= driver.findElements(By.cssSelector("#page-wrapper-content > div.clipTopContainer.container > div > div > div.clip-sticky-header > div > ul > li:nth-child(1) > a > div > div.cat-wrap-ttl"));			
         for(WebElement e: links ) {
        	 System.out.println("A. "+e.getText());
         }
         
         System.out.println("------------------------------------------------------------------------------------------------------------------");
     
     // Product Name    
        List <WebElement> Nameofbench = driver.findElements(By.linkText("Patron Solid Wood Bench In Rustic Teak Finish"));
        for(WebElement e: Nameofbench) {
        	System.out.println("1."+e.getText());
        }
        // Product Price
        List <WebElement> price = driver.findElements(By.xpath("//*[@id=\"p_1_1_1886225\"]/div/div[2]/div[3]/span[1]"));
        for(WebElement e: price) {
        	System.out.println(e.getText());
        }
        
        List <WebElement> Nameofbench2 = driver.findElements(By.linkText("Sutlej Solid Wood Dining Bench in Brown Colour"));
        for(WebElement e: Nameofbench2) {
        	System.out.println("2."+e.getText());
        }
        List <WebElement> price2 = driver.findElements(By.xpath("//*[@id=\"p_2_1_1512519\"]/div/div[2]/div[2]/span[1]"));
        for(WebElement e: price2) {
        	System.out.println(e.getText());
        }
        
        List <WebElement> Nameofbench3 = driver.findElements(By.linkText("Patron Solid Wood Bench In Provincial Teak Finish"));
        for(WebElement e: Nameofbench3) {
        	System.out.println("3."+e.getText());
        }
        List <WebElement> price3 = driver.findElements(By.xpath("//*[@id=\"p_3_1_1886226\"]/div/div[2]/div[3]/span[1]"));
        for(WebElement e: price3) {
        	System.out.println(e.getText());
        }
        
     	System.out.println("==================================================================");
     	
     //	Click on Mid - century benches
     	WebElement el4 = driver.findElement(By.xpath("//*[@id=\"page-wrapper-content\"]/div[2]/div/div/div[2]/div/ul/li[2]/a/div/div[2]/h5"));
     	el4.click();
     	
     	// Mid - century modern benches & items
     	
         List<WebElement> links2 = driver.findElements(By.cssSelector("#page-wrapper-content > div.clipTopContainer.container > div > div > div.clip-sticky-header > div > ul > li:nth-child(2) > a > div > div.cat-wrap-ttl"));
         for(WebElement e: links2) {
        	 System.out.println(" B. "+e.getText());
         }
	
 	System.out.println("----------------------------------------------------------------------------------------------------------------------"); 
	
    List <WebElement> Nameofbench4 = driver.findElements(By.linkText("Reed Bench In Provincial Teak Finish"));
    for(WebElement e: Nameofbench4) {
    	System.out.println("4."+e.getText());
    }
    List <WebElement> price4 = driver.findElements(By.xpath("//*[@id=\"p_1_1_1750570\"]/div/div[2]/div[2]/span[1]"));
    for(WebElement e: price4) {
    	System.out.println(e.getText());
    }
    
    List <WebElement> Nameofbench5 = driver.findElements(By.linkText("Edina Upholstered Bench In Teal Colour"));
    for(WebElement e: Nameofbench5) {
    	System.out.println("5."+e.getText());
    }
    List <WebElement> price5 = driver.findElements(By.xpath("//*[@id=\"p_2_1_1811985\"]/div/div[2]/div[2]/span[1]"));
    for(WebElement e: price5) {
    	System.out.println(e.getText());
    }
    
    List <WebElement> Nameofbench6 = driver.findElements(By.linkText("Archer Mango Wood Bench In Golden Finish"));
    for(WebElement e: Nameofbench6) {
    	System.out.println("6."+e.getText());
    }
    List <WebElement> price6 = driver.findElements(By.xpath("//*[@id=\"p_3_1_1858299\"]/div/div[2]/div[2]/span[1]"));
    for(WebElement e: price6) {
    	System.out.println(e.getText());
    }
    
    System.out.println("==================================================================");
    
    // Click on contemporary Benches
    WebElement el5 = driver.findElement(By.xpath("//*[@id=\"page-wrapper-content\"]/div[2]/div/div/div[2]/div/ul/li[3]/a/div/div[2]/h5"));
    el5.click();
    
    // Contemporary Benches 
    
     	List<WebElement> links3 = driver.findElements(By.cssSelector("#page-wrapper-content > div.clipTopContainer.container > div > div > div.clip-sticky-header > div > ul > li:nth-child(3) > a > div > div.cat-wrap-ttl"));
     	for(WebElement e: links3) {
     		System.out.println(" C. "+e.getText());
     	}
	
     	System.out.println("----------------------------------------------------------------------------------------------------------------------");
     	
     	List <WebElement> Nameofbench7 = driver.findElements(By.linkText("Rafael Bench In Provincial Teak Finish"));
        for(WebElement e: Nameofbench7) {
        	System.out.println("7."+e.getText());
        }
     	List <WebElement> price7 = driver.findElements(By.xpath("//*[@id=\"p_1_1_1750565\"]/div/div[2]/div[2]/span[1]"));
        for(WebElement e: price7) {
        	System.out.println(e.getText());
        }
        
        List <WebElement> Nameofbench8 = driver.findElements(By.linkText("Soho Bench In Maroon Color"));
        for(WebElement e: Nameofbench8) {
        	System.out.println("8."+e.getText());
        }
        List <WebElement> price8 = driver.findElements(By.xpath("//*[@id=\"p_2_1_2030550\"]/div/div[2]/div[4]/span[1]"));
        for(WebElement e: price8) {
        	System.out.println(e.getText());
        }
        
        List <WebElement> Nameofbench9 = driver.findElements(By.linkText("Miso Bench With Storage In Light Grey Colour"));
        for(WebElement e: Nameofbench9) {
        	System.out.println("9."+e.getText());
        }
        List <WebElement> price9 = driver.findElements(By.xpath("//*[@id=\"p_3_1_2037779\"]/div/div[2]/div[4]/span[1]"));
        for(WebElement e: price9) {
        	System.out.println(e.getText());
        }
        
    	System.out.println("=================================================================="); 
    	
       // Click on Transitional Benches
    	WebElement el6 = driver.findElement(By.xpath("//*[@id=\"page-wrapper-content\"]/div[2]/div/div/div[2]/div/ul/li[4]/a/div/div[2]/h5"));
    	el6.click();
    	
        // Transitional Benches
    	List<WebElement> links4 = driver.findElements(By.cssSelector("#page-wrapper-content > div.clipTopContainer.container > div > div > div.clip-sticky-header > div > ul > li:nth-child(4) > a > div > div.cat-wrap-ttl"));
    	for(WebElement e: links4) {
    	System.out.println("D. "+e.getText());
    	}
    	
    	System.out.println("----------------------------------------------------------------------------------------------------------------------");
	
        List <WebElement> Nameofbench10 = driver.findElements(By.xpath("//*[@id=\"p_1_1_1859050\"]/div/div[2]/h2/a"));
        for(WebElement e: Nameofbench10) {
        	System.out.println("10."+e.getText());
        }
        List <WebElement> price10 = driver.findElements(By.xpath("//*[@id=\"p_1_1_1859050\"]/div/div[2]/div[3]/span[1]"));
        for(WebElement e: price10) {
        	System.out.println(e.getText());
        }
        
        List <WebElement> Nameofbench11 = driver.findElements(By.xpath("//*[@id=\"p_2_1_1918752\"]/div/div[2]/h2/a"));
        for(WebElement e: Nameofbench11) {
        	System.out.println("11."+e.getText());
        }
        List <WebElement> price11 = driver.findElements(By.xpath("//*[@id=\"p_2_1_1918752\"]/div/div[2]/div[3]/span[1]"));
        for(WebElement e: price11) {
        	System.out.println(e.getText());
        }
        
        List <WebElement> Nameofbench12 = driver.findElements(By.xpath("//*[@id=\"p_3_1_1918751\"]/div/div[2]/h2/a"));
        for(WebElement e: Nameofbench12) {
        	System.out.println("12."+e.getText());
        }
        List <WebElement> price12 = driver.findElements(By.xpath("//*[@id=\"p_3_1_1918751\"]/div/div[2]/div[3]/span[1]"));
        for(WebElement e: price12) {
        	System.out.println(e.getText());
        }
    	
    	System.out.println("=================================================================="); 
    	
    //	Click on Traditional Benches
    	WebElement ele7 = driver.findElement(By.xpath("//*[@id=\"page-wrapper-content\"]/div[2]/div/div/div[2]/div/ul/li[5]/a/div/div[2]/h5"));
    	ele7.click();
    	
    	// Traditional Benches
    	List<WebElement> links5 = driver.findElements(By.cssSelector("#page-wrapper-content > div.clipTopContainer.container > div > div > div.clip-sticky-header > div > ul > li:nth-child(5) > a > div > div.cat-wrap-ttl"));
	    for(WebElement e: links5) {
		System.out.println(" E. "+e.getText());
	}
	    
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		
	    List <WebElement> Nameofbench13 = driver.findElements(By.xpath("//*[@id=\"p_1_1_1654978\"]/div/div[2]/h2/a"));
        for(WebElement e: Nameofbench13) {
        	System.out.println("13."+e.getText());
        }
        List <WebElement> price13 = driver.findElements(By.xpath("//*[@id=\"p_1_1_1654978\"]/div/div[2]/div[3]/span[1]"));
        for(WebElement e: price13) {
        	System.out.println(e.getText());
        }
        
        List <WebElement> Nameofbench14 = driver.findElements(By.xpath("//*[@id=\"p_2_1_1618574\"]/div/div[2]/h2/a"));
        for(WebElement e: Nameofbench14) {
        	System.out.println("14."+e.getText());
        }
        List <WebElement> price14 = driver.findElements(By.xpath("//*[@id=\"p_2_1_1618574\"]/div/div[2]/div[2]/span[1]"));
        for(WebElement e: price14) {
        	System.out.println(e.getText());
        }
        
        List <WebElement> Nameofbench15 = driver.findElements(By.xpath("//*[@id=\"p_3_1_1886211\"]/div/div[2]/h2/a"));
        for(WebElement e: Nameofbench15) {
        	System.out.println("15."+e.getText());
        }
        List <WebElement> price15 = driver.findElements(By.xpath("//*[@id=\"p_3_1_1886211\"]/div/div[2]/div[3]/span[1]"));
        for(WebElement e: price15) {
        	System.out.println(e.getText());
        }
        
   	System.out.println("========================================================================"); 
   		
   //	Click on Industrial Benches
   		WebElement ele8 = driver.findElement(By.xpath("//*[@id=\"page-wrapper-content\"]/div[2]/div/div/div[2]/div/ul/li[6]/a/div/div[2]/h5"));
   		ele8.click();
   	
   	// Industrial Benches
    	List <WebElement> links6 = driver.findElements(By.cssSelector("#page-wrapper-content > div.clipTopContainer.container > div > div > div.clip-sticky-header > div > ul > li:nth-child(6) > a > div > div.cat-wrap-ttl"));
    	for(WebElement e: links6) {
    		System.out.println(" F. "+e.getText());
    	}
    	
    	System.out.println("----------------------------------------------------------------------------------------------------------------------");
    	
    	 List <WebElement> Nameofbench16 = driver.findElements(By.xpath("//*[@id=\"p_1_1_1914457\"]/div/div[2]/h2/a"));
         for(WebElement e: Nameofbench16) {
         	System.out.println("16."+e.getText());
         }
         List <WebElement> price16 = driver.findElements(By.xpath("//*[@id=\"p_1_1_1914457\"]/div/div[2]/div[3]/span[1]"));
         for(WebElement e: price16) {
         	System.out.println(e.getText());
         }
         
         List <WebElement> Nameofbench17 = driver.findElements(By.xpath("//*[@id=\"p_2_1_1870939\"]/div/div[2]/h2/a"));
         for(WebElement e: Nameofbench17) {
         	System.out.println("17."+e.getText());
         }
         List <WebElement> price17 = driver.findElements(By.xpath("//*[@id=\"p_2_1_1870939\"]/div/div[2]/div[2]/span[1]"));
         for(WebElement e: price17) {
         	System.out.println(e.getText());
         }
         
         List <WebElement> Nameofbench18 = driver.findElements(By.xpath("//*[@id=\"p_3_1_1627713\"]/div/div[2]/h2/a"));
         for(WebElement e: Nameofbench18) {
         	System.out.println("18."+e.getText());
         }
         List <WebElement> price18 = driver.findElements(By.xpath("//*[@id=\"p_3_1_1627713\"]/div/div[2]/div[3]/span[1]"));
         for(WebElement e: price18) {
         	System.out.println(e.getText());
         }
         
         //Industrial Benches more than 1 or Not
        String  btext = driver.findElement(By.xpath("//*[@id=\"page-wrapper-content\"]/div[2]/div/div[2]/div[2]/div/ul/li[6]/a/div/div[2]/p")).getText();
        // object creation btext 
        String s[] = btext.split(" ");
        
        if(s[0].equals("14"))
        {
        	System.out.println("\n Industrial benches more than 1");
        }
        else
        {
           	System.out.println("\n Industrial benche only 1");
        }
        
    	System.out.println("----------------------------------------------------------------------------------------------------------------------");
	}
}
