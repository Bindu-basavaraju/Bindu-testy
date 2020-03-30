import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Insta_search {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "/Users/B/Downloads/chromedrive" );



        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.get( "https://www.google.com" );
        driver.findElement( By.xpath( "//input[@title='Search']" ) ).sendKeys( "https://www.instawork.com" );

        List<WebElement> instawork = driver.findElements( By.xpath( "//ul[@role='listbox']" ) );
        Thread.sleep( 1000 );
        for (WebElement list : instawork) {
            String stg = list.getText();
            System.out.println( list.getText() );
            String[] words = stg.split( "\n" );

              if( instawork.get( 0 ).getText().equalsIgnoreCase( "https://www.instawork.com"  )) {
                  System.out.println( "https://www.instawork.com appears in first  postion in google search suggestion" );}
              else {
                  System.out.println( "ihttps://www.instawork.com is not in  first  position in google search suggestion" );
              }

                for (int j = 0; j <= words.length - 1; j++) {
//				if(words[i].equalsIgnoreCase("https://www.instawork.com"))
//					System.out.println("instawork appears in " +i+1+"postion in our site");
                    if (words[j].equalsIgnoreCase( "https://www.instawork.com" ))
                        System.out.println( "https://www.instawork.com appears " + (j + 1) + "th postion in google search suggestion" );


                }
            }
        }
}

