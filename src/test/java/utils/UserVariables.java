package utils;

import static utils.FakerUtils.*;

public class UserVariables {


    public static String
            userFirstName = getFirstName(),
            userLastName = getLastName(),
            userEmail = getUserEmail(),
            userGender = getUserGender(),
            userBirthdayMonth = getUserBirthMonth(),
            userBirthdayYear = getUserBirthYear(),
            userBirthDay = getUserBirthDay(userBirthdayMonth, userBirthdayYear),
            userNumber = getUserNumber(),
            userSubject = getUserSubject(),
            userHobby = getUserHobby(),
            userAddress = getUserAddress(),
            userState = getUserState(),
            userCity = getUserCity(userState),
            userFile = getUserFile();


}
