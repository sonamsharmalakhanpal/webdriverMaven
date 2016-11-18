package GTACAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WSL_LOGIN {
    String baseURL="https://gmail.com/";
	private WebDriver driver;
    
    @Parameters({ "browser" })
    @BeforeTest    
    public void setup(String browser){
     try {
    	 if(browser.equalsIgnoreCase("Firefox")){
    		  driver= new FirefoxDriver();
    		
    	}else if(browser.equalsIgnoreCase("IE")){
    		System.setProperty("webdriver.IE.driver", "C:\\Users\\meetg\\Downloads\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
    		 driver= new InternetExplorerDriver();
    	}else if(browser.equalsIgnoreCase("chrome")){
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meetg\\Downloads\\chromedriver.exe");
    		 driver= new ChromeDriver();
    	}
    	
    	 driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
    
    }

    @Test
    public void LoginTestcase(){	
	driver.navigate().to(baseURL);
	System.out.println("jai Mata di Jai Maa Parwati ji to help me in Maven");
	}
    
    @Test
    public void login(){
    	System.out.println("jai Maa Parwati ji");
    }


	}

