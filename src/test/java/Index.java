import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;
    @BeforeMethod
    public void tabIndex (){
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/eduar/Downloads/index.html");
        wd.manage().window().maximize();
    }
    @Test
    public void findElement(){
        wd.findElement(By.cssSelector("#nav"));
        List<WebElement> rows = wd.findElements(By.cssSelector("tr"));
        System.out.println("Number rows = " +rows.size());
        Assert.assertEquals(rows.size(),4);

        WebElement lastRow = wd.findElement(By.cssSelector("tr:last-child"));
        String text = lastRow.getText();
        System.out.printf(text );
        Assert.assertTrue(text.contains("Mexico"));

        WebElement lastCell = wd.findElement(By.cssSelector("tr:last-child td:last-child"));
        String text1 = lastCell.getText();
        Assert.assertTrue(text1.contains("Mexico"));
    }
}
