package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by iriska on 5/3/17.
 */
public class ContactModificationTests extends TestBase {
    @Test
    public void ContactModification(){
        app.getContactHelper().gotoAdressBook();
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("lena", "ivanovna", "ialova", "iriska","produkt", "15"));
        app.getContactHelper().editContactForm();
    }
}
