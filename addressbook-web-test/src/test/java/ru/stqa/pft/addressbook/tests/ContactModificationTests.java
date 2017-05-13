package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by iriska on 5/3/17.
 */
public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification(){
        app.getContactHelper().gotoAddNew();
        app.getContactHelper().selectContact();
        app.getContactHelper().fillContactForm(new ContactData("lena", "ivanovna",
                "ialova", "iriska","produkt", "15", null), false);
        app.getContactHelper().editContactForm();
    }
}
