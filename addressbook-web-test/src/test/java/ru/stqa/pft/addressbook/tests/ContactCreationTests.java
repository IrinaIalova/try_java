package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
        app.gotoAddPage();
        app.fillContactForm(new ContactData("irina", "ivanovna", "ialova", "iriska", "produkt", "15"));
        app.submitContactForm();
    }

}
