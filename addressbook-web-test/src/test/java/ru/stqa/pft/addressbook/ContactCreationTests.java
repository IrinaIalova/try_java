package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
        gotoAddPage();
        fillContactForm(new ContactData("irina", "ivanovna", "ialova", "iriska", "produkt", "15"));
        submitContactForm();
    }

}
