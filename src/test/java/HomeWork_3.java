import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork_3 {

    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();

    }

    @Test
    public void loginPhonebook() throws InterruptedException {
        wd.navigate().to("https://telranedu.web.app/");
        wd.findElement(By.cssSelector("[href = '/login'")).click();
        WebElement email = wd.findElement(By.cssSelector("[placeholder='Email']"));
        email.click();
        email.clear();
        email.sendKeys("rehovot15@mail.ru");
        WebElement password = wd.findElement(By.cssSelector("[placeholder='Password']"));
        password.click();
        password.clear();
        password.sendKeys("Remember15@");
        //wd.findElement(By.cssSelector("[name$='registration']")).click();
        wd.findElement(By.cssSelector("[type$='submit']")).click();
        //WebElement bar = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        Thread.sleep(2000);
        WebElement bar1 = wd.findElement(By.cssSelector(".navbar-logged_nav__2Hx7M"));
        wd.findElement(By.cssSelector("body button")).click();




    }


}
