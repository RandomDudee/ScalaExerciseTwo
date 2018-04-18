import org.scalatest._
import org.scalatest.selenium.WebBrowser
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.By
import org.openqa.selenium.Keys

class projectTest extends FlatSpec with WebBrowser {

  implicit val webDriver: WebDriver = new ChromeDriver()

  webDriver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t")

  val reddit = "https://www.reddit.co.uk/"

  "The Project Test" should "Direct you to Reddit" in {
    go to (reddit)
    //textField("q").value = "Reddit"
    // submit()
    Thread.sleep(6000)
    println("Successfully opened the website www.Reddit.com")

  }



    webDriver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t")

    val google = "https://www.google.co.uk/"
    go to(google)

    Thread.sleep(30000)

}
