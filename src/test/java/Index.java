
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class Index {

    WebDriver wd;


    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/marii/Downloads/21.index.html");
    }


    @Test
    public void tableTest() {
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3)>td:last-child"));
        WebElement canada1 = wd.findElement(By.xpath("//*[text()='Canada']"));
        Assert.assertEquals(canada.getText(), "Canada");
        Assert.assertEquals(canada1.getText(), "Canada");

    }


    @Test
    public void cssLocators() {
        //by tagName

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));


        //by class

        WebElement el = wd.findElement(By.className("container"));
        WebElement el1 = wd.findElement(By.cssSelector(".container"));

        List<WebElement> navlist = wd.findElements(By.className("nav-item"));
        List<WebElement> navlist1 = wd.findElements(By.cssSelector(".nav-item"));

        //by id
        WebElement el2 = wd.findElement(By.id("nav"));
        WebElement el3 = wd.findElement(By.cssSelector("#nav"));


        //by attribute
        WebElement input = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement input1 = wd.findElement(By.xpath("//*[@placeholder='Type your name']"));

        //start
        WebElement inp = wd.findElement(By.cssSelector("[placeholder^='Type']"));
        WebElement inp3 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Type')]"));

        //end
        WebElement inp1 = wd.findElement(By.cssSelector("[placeholder$='name']"));
        WebElement inp5 = wd.findElement(By.xpath("//*[contains(@placeholder,'name')]"));

        //contains
        WebElement inp2 = wd.findElement(By.cssSelector("[placeholder*='your']"));
        WebElement inp4 = wd.findElement(By.cssSelector("//*[contains(@placeholder,'your')]"));


        //by name
        WebElement inputS = wd.findElement(By.cssSelector("[name = 'surename']"));
        WebElement inputS1 = wd.findElement(By.name("surename"));


        //By.linkText & By.partialLinkText

        WebElement a = wd.findElement(By.linkText("Item 2"));
        WebElement a1 = wd.findElement(By.partialLinkText("m 2"));
    }

}
