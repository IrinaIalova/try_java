package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoAddPage();
        app.getContactHelper().fillContactForm(new ContactData("irina", "ivanovna", "ialova", "iriska",
                "produkt", "15","testNew"), true);
        app.getContactHelper().submitContactForm();
    }

}
