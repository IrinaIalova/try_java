package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String adress;
    private final String home;
    private String group;

    public ContactData(String firstname, String middlename, String lastname, String nickname, String adress, String home, String group) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.adress = adress;
        this.home = home;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAdress() {
        return adress;
    }

    public String getHome() {
        return home;
    }

    public String getGroup() {
        return group;
    }
}
