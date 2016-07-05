package Model;

/**
 * Created by Alex on 05.07.16.
 */

import java.util.Date;
import java.util.List;

public class User {

    private long userID;

    private String name;
    private String lastname;
    private Date birthDate;
    private Sex sex;

    private ContactInfo contactInfo;
    private String avatarUrl;
    private List<User> friends;
    private Wall wall;
    private List<Group> groupsID;

    public User() {
    }

    public User(long userID, String name, String lastname, Date birthDate, Sex sex, String country, String city, ContactInfo contactInfo, String avatarUrl, List<Long> friends, Wall wall, List<Long> groupsID) {
        this.userID = userID;
        this.name = name;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.sex = sex;
        this.contactInfo = contactInfo;
        this.avatarUrl = avatarUrl;
        this.wall = wall;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }


    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public List<Group> getGroupsID() {
        return groupsID;
    }

    public void setGroupsID(List<Group> groupsID) {
        this.groupsID = groupsID;
    }


}