package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by iriska on 5/1/17.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("middlename"),contactData.getMiddlename());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("nickname"),contactData.getNickname());
        type(By.name("address"),contactData.getAdress());
        type(By.name("home"),contactData.getHome());

    }

    public void submitContactForm() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }


    public void gotoAdressBook() {
        click(By.id("logo"));
    }

    public void editContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[4]/td[8]/a/img"));
    }

    public void editContactForm() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }

}
