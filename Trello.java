package git;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://trello.com/");
		String actualhomepagetitle = driver.getTitle();
		System.out.println("actualhomepagetitle = " + actualhomepagetitle);
		String expectedhomepagetitlecontains = "Trello";
		System.out.println("expectedhomepagetitlecontains = " + expectedhomepagetitlecontains);
		String actualhomepageurl = driver.getCurrentUrl();
		System.out.println("actualhomepageurl = " + actualhomepageurl);
		String expectedhomepageurl = "https://trello.com/";
		System.out.println("expectedhomepageurl = " + expectedhomepageurl);
		if(actualhomepagetitle.contains(expectedhomepagetitlecontains)) {
			System.out.println("pass : home page title is found correct and its verified");
			if(actualhomepageurl.equals(expectedhomepageurl)) {
				System.out.println("pass : home page url is found correct and its verified");
				WebElement loginbutton = driver.findElement(By.xpath("//a[text()='Log in']"));
				loginbutton.click();
				String actualloginpagetitle = driver.getTitle();
				System.out.println("actualloginpagetitle = " + actualloginpagetitle);
				String expectedloginpagetitle = "Log in to Trello";
				System.out.println("expectedloginpagetitle = " + expectedloginpagetitle);
				String actualloginpageurl = driver.getCurrentUrl();
				System.out.println("actualloginpageurl = " + actualloginpageurl);
				String expectedloginpageurl = "https://trello.com/login";
				System.out.println("expectedloginpageurl = " + expectedloginpageurl);
				if(actualloginpagetitle.equals(expectedloginpagetitle)) {
					System.out.println("pass : login page title is found correct and its verified");
					if(actualloginpageurl.equals(expectedloginpageurl)) {
						System.out.println("pass : login page url is found correct and its verified");
						WebElement emailtextfield = driver.findElement(By.id("user"));
						emailtextfield.sendKeys("chethanlad777@gmail.com");
						WebElement continuebutton = driver.findElement(By.id("login"));
						continuebutton.click();
						if(wait.until(ExpectedConditions.titleContains("Log in with Atlassian account"))) {
							String actualatlassianidpagetitle = driver.getTitle();
							System.out.println("actualatlassianidpagetitle = " + actualatlassianidpagetitle);
							String expectedatlassianidpagetitlecontains = "Log in with Atlassian account";
							System.out.println("pass : atlassian id page title is found correct and its verified");
							if(wait.until(ExpectedConditions.urlContains("https://id.atlassian.com/"))) {
							    String actualatlassianidpageurl = driver.getCurrentUrl();
								System.out.println("actualatlassianidpageurl = " + actualatlassianidpageurl);
								String expectedatlassianidpageurlcontains = "https://id.atlassian.com/";
								System.out.println("pass : atlassian id page url is found correct and its verified");
								WebElement passwordtextfield = driver.findElement(By.id("password"));
								passwordtextfield.sendKeys("cHethan@1");
								WebElement atlassianidloginbutton = driver.findElement(By.id("login-submit"));
								atlassianidloginbutton.click();									
								WebElement visibilityofaccountoption = driver.findElement(By.xpath("//span[@title='ChethanSp (chethanlad777)']"));
								if(wait.until(ExpectedConditions.titleIs("Boards | Trello"))) {
									String actualboardstrellopagetitle = driver.getTitle();
									System.out.println("actualboardstrellopagetitle = " + actualboardstrellopagetitle);
									String expectedboardstrellopagetitle = "Boards | Trello";	
									System.out.println("pass : boards trello page title is found correct and its verified");
									if(wait.until(ExpectedConditions.urlToBe("https://trello.com/u/chethanlad777/boards"))) {
										String actualboardstrellopageurl = driver.getCurrentUrl();
										System.out.println("actualboardstrellopageurl = " + actualboardstrellopageurl);
										String expectedboardstrellopageurl = "https://trello.com/u/chethanlad777/boards";
										System.out.println("pass : boards trello page url is found correct and its verified");
										if(visibilityofaccountoption.isDisplayed()) {
									        System.out.println("pass : account option is visible and its verified");
									        WebElement createboardbutton = driver.findElement(By.xpath("//span[text()='Create new board']"));
									        createboardbutton.click();
									        WebElement visibilityofcreateboardnavbar = driver.findElement(By.xpath("//h2[text()='Create board']"));
									        if(visibilityofcreateboardnavbar.isDisplayed()) {
									        	System.out.println("pass : create board nav bar is visible and its verified");
									        	WebElement boardtitletextfield = driver.findElement(By.xpath("//input[@type='text']"));
									        	boardtitletextfield.sendKeys("selenium");
									        	WebElement createbutton = driver.findElement(By.xpath("//button[text()='Create']"));
									        	createbutton.click();
									        	if(wait.until(ExpectedConditions.titleIs("Boards | Trello"))) {
									        		String actualseleniumpagetitle = driver.getTitle();
										        	System.out.println("actualseleniumpagetitle =  " + actualseleniumpagetitle);
										        	String expectedseleniumpagetitle = "selenium | Trello";
									        		System.out.println("pass : selenium page title is found correct and its verified");
									        		if(wait.until(ExpectedConditions.urlContains("selenium"))) {
									        			String actualseleniumpageurl = driver.getCurrentUrl();
											        	System.out.println("actualseleniumpageurl = " + actualseleniumpageurl);
											        	String expectedseleniumpageurlcontains = "selenium";
									        			System.out.println("pass : selenium page url is found correct and its verified");
									        			WebElement seleniumbutton = driver.findElement(By.xpath("//div[@class='sLVneYnOOVFi45']/descendant::a[text()='selenium']"));
									        			seleniumbutton.click();
									        			WebElement seleniummenubutton = seleniumbutton.findElement(By.xpath("//button[@aria-label='Board actions menu']"));
									        			seleniummenubutton.click();
									        			WebElement closeboardbutton = driver.findElement(By.xpath("//section[@class='rX4pAv5sWHFNjp js-react-root']/descendant::button[@type='button']"));
									        			closeboardbutton.click();
									        			WebElement closeboard = driver.findElement(By.xpath("//section/descendant::button[text()='Close']"));
									        			closeboard.click();
									        			WebElement deleteboardbutton = driver.findElement(By.xpath("//button[text()='Permanently delete board']"));
									        			deleteboardbutton.click();
									        			WebElement deletebutton = driver.findElement(By.xpath("//section/descendant::button[text()='Delete']"));
									        			deletebutton.click();	
														WebElement visibilityofaccountoptionafterdelete = driver.findElement(By.xpath("//span[@title='ChethanSp (chethanlad777)']"));
														if(wait.until(ExpectedConditions.titleIs("Boards | Trello"))) {
															String actualboardstrellopagetitleafterdelete = driver.getTitle();
															System.out.println("actualboardstrellopagetitleafterdelete = " + actualboardstrellopagetitleafterdelete);
															String expectedboardstrellopagetitleafterdelete = "Boards | Trello";
															System.out.println("pass : boards trello page title is found correct after delete and its verified");
															if(wait.until(ExpectedConditions.urlToBe("https://trello.com/u/chethan777/boards"))) {
																String actualboardstrellopageurlafterdelete = driver.getCurrentUrl();
																System.out.println("actualboardstrellopageurlafterdelete = " + actualboardstrellopageurlafterdelete);
																String expectedboardstrellopageurlafterdelete = "https://trello.com/u/chethan777/boards";
																System.out.println("pass : boards trello page url is found correct after delete and its verified");
																if(visibilityofaccountoptionafterdelete.isDisplayed()) {
															       System.out.println("pass : account option is visible after delete and its verified");
									        		         	   WebElement accountbuttonafterdelete = driver.findElement(By.xpath("//button/descendant::span[@title='ChethanSp (chethanlad777)']"));
									        		         	   accountbuttonafterdelete.click();
									        		         	   WebElement logoutbutton = driver.findElement(By.xpath("//div/descendant::span[text()='Log out']"));
									        		         	   logoutbutton.click();
									        		         	   if(wait.until(ExpectedConditions.titleContains("Log out of your Atlassian account"))) {
									        		         		  String actuallogoutpagetitle = driver.getTitle();
										        		         	  System.out.println("actuallogoutpagetitle = " + actuallogoutpagetitle);
										        		         	  String expectedlogoutpagetitlecontains = "Log out of your Atlassian account";
									        		         		  System.out.println("pass : logout page title is found correct and its verified");
									        		         		  if(wait.until(ExpectedConditions.urlContains("https://id.atlassian.com/logout?"))) {
									        		         			 String actuallogoutpageurl = driver.getCurrentUrl();
											        		         	 System.out.println("actuallogoutpageurl = " + actuallogoutpageurl);
											        		         	 String expectedlogoutpageurlcontains = "https://id.atlassian.com/logout?";
									        		         			 System.out.println("pass : logout page url is found correct and its verified");
									        		         			 WebElement logoutbutton1 = driver.findElement(By.xpath("//span[text()='Log out']"));
									        		         			 logoutbutton1.click();
									        		         			 if(wait.until(ExpectedConditions.titleContains("Trello"))) {
									        		         				String actualhomepagetitleafterlogout = driver.getTitle();
										        		         			System.out.println("actualhomepagetitleafterlogout = " + actualhomepagetitleafterlogout);
										        		         			String expectedhomepagetitlecontainsafterlogout = "Trello";
									        		         				System.out.println("pass : home page title is found correct after logout and its verified");
									        		         				if(wait.until(ExpectedConditions.urlToBe("https://trello.com/home"))) {
									        		         					String actualhomepageurlafterlogout = driver.getCurrentUrl();
											        		         			System.out.println("actualhomepageurlafterlogout = " + actualhomepageurlafterlogout);
											        		         			String expectedhomepageurlafterlogout = "https://trello.com/home";
									        		         					System.out.println("pass : home page url is found correct after logout and its verified");
									        		         		        }
									        		         				else {
									        		         					System.out.println("fail : home page url is found incorrect after logout and its verified");
									        		         				}
									        		         			}
									        		         			else {
									        		         				System.out.println("fail : home page title is found incorrect after logout and its verified");
									        		         			}
									        		         		}
									        		         		else {
									        		         			System.out.println("fail : logout page url is found incorrect and its verified");
									        		         		}
									        		         	}
									        		         	else {
									        		         		System.out.println("fail : logout page title is found incorrect and its verified");	
									        		         	}
									        		            }
																else {
																	System.out.println("fail : account option is notvisible and its verified");
																}
															}
															else {
																System.out.println("fail : boards trello page url is found incorrect and its verified");
															}
														}
														else {
															System.out.println("fail : boards trello page title is found incorrect and its verified");	
														}
									        		}
									        		else {
									        			System.out.println("fail : selenium page url is found incorrect and its verified");
									        		}
									        	}
									        	else {
									        		System.out.println("fail : selenium page title is found incorrect and its verified");
									        	}
									        }
									        else {
									        	System.out.println("fail : create board nav bar is not visible and its verified");
									        }
										}
										else {
											System.out.println("fail : account option is notvisible and its verified");
										}
									}
									else {
										System.out.println("fail : boards trello page url is found incorrect and its verified");
									}
								}
								else {
									System.out.println("fail : boards trello page title is found incorrect and its verified");	
								}
							}
							else {
								System.out.println("fail : atlassian id page url is found incorrect and its verified");
							}
						}else {
							System.out.println("fail : atlassian id page title is found incorrect and its verified");
						}
					}
					else {
						System.out.println("fail : login page url is found incorrect and its verified");
					}
				}
				else {
					System.out.println("fail : login page title is found incorrect and its verified");
				}
			}
			else {
				System.out.println("fail : home page url is found incorrect and its verified");
			}
		}
		else {
			System.out.println("fail : home page title is found incorrect and its verified");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}

