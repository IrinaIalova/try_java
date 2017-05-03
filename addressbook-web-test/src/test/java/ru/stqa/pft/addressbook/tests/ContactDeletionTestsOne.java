package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by iriska on 5/3/17.
 */
public class ContactDeletionTestsOne extends TestBase {
    @Test
    public void testContactdeletionOne() {
    app.getContactHelper().gotoAdressBook();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContactFromForm();
    }
}

