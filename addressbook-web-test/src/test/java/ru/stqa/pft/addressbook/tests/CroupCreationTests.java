package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class CroupCreationTests extends TestBase{

    @Test
    public void testCroupCreation() {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("testNew", "lalala", "I like it"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
