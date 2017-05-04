package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by iriska on 5/3/17.
 */
public class ContactDeletionTestsTwo extends TestBase {

    @Test
    public void testContactDeletionTestsTwo(){
        app.getContactHelper().gotoAdressBook();
        app.getContactHelper().markContact();
        app.getContactHelper().deleteContactFromList();
        app.getNavigationHelper().closeAlert();
    }
}
