package oldtests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Hooks;

import java.util.List;

public class AdvancedCommandTest extends Hooks {


    @Test
    public void verifyeFindElementsOldSchool()
    {
        for(int i=1;i<=10;i++) {
            if (Hooks.driver.findElement(By.xpath("//div[@class='ad-item row']["+i+"]")).isDisplayed()) {
                System.out.println(i+" item available");
            }
        }
    }

    @Test
    public void verifyeFindElementsNewSchool()
    {
        //will get bunch of titles
        List<WebElement> elements= Hooks.driver.findElements(By.className("item-title"));

        for(WebElement element:elements)
        {
            System.out.println(element.getText());
        }

        Assert.assertEquals(10,elements.size());
    }

    @Test
    public void verifyTochekifelementpresetn()
    {
//        driver.findElement(By.className("item-titsdsdsdle"));
        //will get bunch of titles
        List<WebElement> elements= Hooks.driver.findElements(By.className("item-titsdsdsdle"));

        Assert.assertEquals(0,elements.size());
    }

    @Test
    public void verifySelect()
    {
        Hooks.driver.get("https://www.amazon.co.uk/");
        WebElement dropdownBox = Hooks.driver.findElement(By.id("searchDropdownBox"));
        Select amazonCategory = new Select(dropdownBox);
        amazonCategory.selectByVisibleText("Grocery");
        Hooks.driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Non sense");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement selectedItem = amazonCategory.getFirstSelectedOption();
        System.out.println(selectedItem.getText());

    }
}
