package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by iriska on 5/1/17.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("middlename"),contactData.getMiddlename());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("nickname"),contactData.getNickname());
        type(By.name("address"),contactData.getAdress());
        type(By.name("home"),contactData.getHome());


        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void submitContactForm() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void gotoAddNew () {
        click(By.linkText("add new"));
    }

    public void selectContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[4]/td[8]/a/img"));
    }

    public void editContactForm() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }

    public void deleteContactFromForm() {
        click(By.xpath("//div[@id='content']/form[2]/input[2]"));
    }

    public void markContact() {
        click(By.name("selected[]"));
    }

    public void deleteContactFromList() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    //Будет падать, если нет группы с названием testNew
    public void createContact(ContactData contact, boolean bla) {
        gotoAddNew();
        fillContactForm(contact, bla);
        submitContactForm();
    }
}
