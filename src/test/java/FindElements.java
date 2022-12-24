import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindElements {

    WebDriver wd;
    @BeforeMethod
    public void preCondition (){
        wd = new ChromeDriver();
        wd.navigate().to("https://telranedu.web.app/");
        wd.findElement(By.cssSelector("[href = '/login']")).click();

    }
    @Test
    public void find (){
        wd.findElement(By.cssSelector("[placeholder = 'Password'")).click();
        wd.navigate().refresh();
        wd.findElement(By.cssSelector("[placeholder ^= 'Pass'")).click();
        wd.navigate().refresh();
        wd.findElement(By.cssSelector("[placeholder *= 'ass'")).click();
        wd.navigate().refresh();
        wd.findElement(By.cssSelector("[placeholder $= 'word'")).click();
    }
    @Test
    public void findIntegration(){
        wd.findElement(By.cssSelector("div#root.container"));
        wd.findElement(By.cssSelector("a[href = '/login']"));
        wd.findElement(By.cssSelector("input[name = 'email']"));
        wd.findElement(By.cssSelector("button[name = 'login']"));
        wd.findElement(By.cssSelector("button:nth-child(5)")).click();

    }

}
