package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by iriska on 5/1/17.
 */
public class NavigationHelper {
    private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void gotoAddPage() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }
}
