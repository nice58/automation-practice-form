package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.RegistrationPageModal;
import static utils.UserVariables.*;


public class RegistrationTestsWithPageObjectsWithFaker extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationPageModal registrationPageModal = new RegistrationPageModal();


    @Test
    void fillFormTest() {

        registrationPage.openPage()
                .remove()
                .setFirstName(userFirstName)
                .setLastName(userLastName)
                .setUserEmail(userEmail)
                .setGender(userGender)
                .setMobileNumber(userNumber)
                .setBirthDate(userBirthDay, userBirthdayMonth, userBirthdayYear)
                .setSubjects(userSubject)
                .setHobby(userHobby)
                .setPicture(userFile)
                .setAddress(userAddress)
                .setState(userState)
                .setCity(userCity)
                .setSubmit();

        registrationPageModal.checkHeader()
                .checkText("Student Name", userFirstName + " " + userLastName)
                .checkText("Student Email", userEmail)
                .checkText("Gender", userGender)
                .checkText("Mobile", userNumber)
                .checkText("Date of Birth", userBirthDay + " " + userBirthdayMonth + "," + userBirthdayYear)
                .checkText("Subjects", userSubject)
                .checkText("Hobbies", userHobby)
                .checkText("Picture", userFile)
                .checkText("Address", userAddress)
                .checkText("State and City", userState + " " + userCity);
    }
}
