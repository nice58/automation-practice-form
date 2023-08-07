package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;


public class RegistrationTestsWithPageObjects extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {

        registrationPage.openPage()
                .setFirstName("Sofy")
                .setLastName("Chan")
                .setUserEmail("schan@email.com")
                .setGender("Female")
                .setUserNumber("8000000001")
                .setBirthDate("04", "July", "2008")
                .setSubjects("Computer Science")
                .setHobby("Music")
                .setPicture("text.txt")
                .setAddres("Address")
                .setState("Rajasthan")
                .setCity("Jaiselmer")
                .setSubmit();

        registrationPage.checkHeader()
                .checkText("Student Name", "Sofy Chan")
                .checkText("Student Email", "schan@email.com")
                .checkText("Gender", "Female")
                .checkText("Mobile", "8000000001")
                .checkText("Date of Birth", "04 July,2008")
                .checkText("Subjects", "Computer Science")
                .checkText("Hobbies", "Music")
                .checkText("Picture", "text.txt")
                .checkText("Address", "Address")
                .checkText("State and City", "Rajasthan Jaiselmer");
    }
}
