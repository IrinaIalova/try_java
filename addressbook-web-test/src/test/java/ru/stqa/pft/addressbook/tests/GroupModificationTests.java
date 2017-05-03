package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by iriska on 5/3/17.
 */
public class GroupModificationTests extends TestBase {

    @Test
    public void GroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("testNew", "lalala", "I like it"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
}
}

