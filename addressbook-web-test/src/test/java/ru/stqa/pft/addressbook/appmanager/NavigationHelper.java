package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by iriska on 5/1/17.
 */
public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoAddPage() {
        click(By.linkText("add new"));
    }

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    public void closeAlert() { wd.switchTo().alert().accept(); }

}
