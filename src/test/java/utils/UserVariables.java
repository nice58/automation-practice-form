package utils;

public class UserVariables {

    public String
            firstName = FakerUtils.getFirstName(),
            lastName = FakerUtils.getLastName(),
            email = FakerUtils.getUserEmail(),
            gender = FakerUtils.getUserGender(),
            birthMonth = FakerUtils.getUserBirthMonth(),
            birthYear = FakerUtils.getUserBirthYear(),
            birthDay = FakerUtils.getUserBirthDay(birthYear,birthMonth),
            number = FakerUtils.getUserNumber(),
            subject = FakerUtils.getUserSubject(),
            hobby = FakerUtils.getUserHobby(),
            address = FakerUtils.getUserAddress(),
            state = FakerUtils.getUserState(),
            city = FakerUtils.getUserCity(state),
            file = FakerUtils.getUserFile();
}
