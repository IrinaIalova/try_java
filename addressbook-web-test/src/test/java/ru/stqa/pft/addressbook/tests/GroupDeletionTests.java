package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by iriska on 5/3/17.
 */
public class GroupDeletionTests extends TestBase {
    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        if (!app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("testNew", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getNavigationHelper().gotoGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before - 1);
    }
}
