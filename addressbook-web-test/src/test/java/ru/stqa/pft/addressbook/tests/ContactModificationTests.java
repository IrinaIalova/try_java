package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by iriska on 5/3/17.
 */
public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification(){
        app.getNavigationHelper().gotoAdressBook();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("irina", "ivanovna",
                    "ialova", "iriska","produkt", "56","testNew"), true);
        }
        //модифицирую позже, лучше в конце создания контакта переходить на домашнюю страницу по ссылке home
        app.getNavigationHelper().gotoAdressBook();
        app.getContactHelper().selectContact();
        app.getContactHelper().fillContactForm(new ContactData("lena", "ivanovna",
                "ialova", "iriska","produkt", "10", null), false);
        app.getContactHelper().editContactForm();
    }
}
