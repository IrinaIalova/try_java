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

    //Переход на главную страницу со списком контактов
    public void gotoAdressBook() {
        click(By.id("logo"));
    }

    public void gotoGroupPage() {
        if (isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                &&isElementPresent(By.name("new"))){
            return;
        }
        click(By.linkText("groups"));
    }

    public void closeAlert() { wd.switchTo().alert().accept(); }
}
