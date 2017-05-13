package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by iriska on 5/3/17.
 */
public class ContactDeletionTestsTwo extends TestBase {

    @Test
    public void testContactDeletionTestsTwo(){
        app.getNavigationHelper().gotoAdressBook();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("irina", "ivanovna",
                    "ialova", "iriska","produkt", "15","testNew"), true);
        }
        //модифицирую позже, лучше в конце создания контакта переходить на домашнюю страницу по ссылке home
        app.getNavigationHelper().gotoAdressBook();
        app.getContactHelper().markContact();
        app.getContactHelper().deleteContactFromList();
        app.getNavigationHelper().closeAlert();
    }
}
