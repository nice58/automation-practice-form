package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.RegistrationPageModal;
import utils.UserVariables;


public class RegistrationTestsWithPageObjectsWithFaker extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationPageModal registrationPageModal = new RegistrationPageModal();

    UserVariables user = new UserVariables();


    @Test
    void fillFormTest() {

        registrationPage.openPage()
                .remove()
                .setFirstName(user.firstName)
                .setLastName(user.lastName)
                .setUserEmail(user.email)
                .setGender(user.gender)
                .setMobileNumber(user.number)
                .setBirthDate(user.birthDay, user.birthMonth, user.birthYear)
                .setSubjects(user.subject)
                .setHobby(user.hobby)
                .setPicture(user.file)
                .setAddress(user.address)
                .setState(user.state)
                .setCity(user.city)
                .setSubmit();

        registrationPageModal.checkHeader()
                .checkText("Student Name", user.firstName + " " + user.lastName)
                .checkText("Student Email", user.email)
                .checkText("Gender", user.gender)
                .checkText("Mobile", user.number)
                .checkText("Date of Birth", user.birthDay + " " + user.birthMonth + "," + user.birthYear)
                .checkText("Subjects", user.subject)
                .checkText("Hobbies", user.hobby)
                .checkText("Picture", user.file)
                .checkText("Address", user.address)
                .checkText("State and City", user.state + " " + user.city);
    }
}
