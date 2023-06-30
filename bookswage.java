package git;
 import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class bookswage {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.bookswagon.com/");
		WebElement book = driver.findElement(By.xpath("//span[text()='My Account']"));
		book.click();
		String actualloginpageurl = driver.getCurrentUrl();
		System.out.println("actualloginpageurl" +actualloginpageurl);
		String expectedloginpageurl="https://www.bookswagon.com/login";
		if(actualloginpageurl.contains(expectedloginpageurl)){
			System.out.println("The Login page is displayed and it is verified");
		WebElement emailtextfields = driver.findElement(By.xpath("//input[@placeholder='Mobile/Email']"));
		emailtextfields.sendKeys("8884855537");
		WebElement passwordTextfield = driver.findElement(By.xpath("//input[@name='ctl00$phBody$SignIn$txtPassword']"));
		passwordTextfield.sendKeys("cHethan@1");
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		login.click();
		WebElement clickonArrivs = driver.findElement(By.xpath("//a[text()='New Arrivals']"));
		clickonArrivs.click();
		WebElement clickonbook = driver.findElement(By.xpath("//img[@alt='Service with Guru Nanak']"));
		clickonbook.click();
		WebElement Addtowish = driver.findElement(By.xpath("//input[@value='Add to Wishlist']"));
		Addtowish.click();
		WebElement clickonwisList = driver.findElement(By.xpath("//li[@class='list-inline-item position-relative']//span[@class='itemcount']"));
		clickonwisList.click();
		WebElement removeList = driver.findElement(By.xpath("//a[text()='REMOVE']"));
		removeList.click();
		WebElement profileicon = driver.findElement(By.xpath("//span[@class='text-white accountred']"));
		profileicon.click();
		Thread.sleep(2);
	   WebElement Logout = driver.findElement(By.xpath("//a[text()='Log out']"));
		Logout.click();
		driver.quit();
		
		
		}
	}
}
