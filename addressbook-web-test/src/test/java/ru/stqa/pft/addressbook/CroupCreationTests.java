package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class CroupCreationTests extends TestBase{

    @Test
    public void testCroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("testNew", "lalala", "I like it"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
