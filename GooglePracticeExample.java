

public class GooglePracticeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\nepol\\OneDrive\\Desktop\\selenium jars\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("www.google.com");
			WebElement searchBar=driver.findElement(By.xpath("//*[@id=\'tsf\']/div[1]/div[1]/div[3]/div[2]/div/div[2]/input"));
			searchBar.sendKeys("youtube");
		
		
		
		
	}

}
