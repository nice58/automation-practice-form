package utils;

public class UserVariables {

    FakerUtils fakerUtils = new FakerUtils();

    public String
            firstName = fakerUtils.getFirstName(),
            lastName = fakerUtils.getLastName(),
            email = fakerUtils.getUserEmail(),
            gender = fakerUtils.getUserGender(),
            birthMonth = fakerUtils.getUserBirthMonth(),
            birthYear = fakerUtils.getUserBirthYear(),
            birthDay = fakerUtils.getUserBirthDay(birthYear,birthMonth),
            number = fakerUtils.getUserNumber(),
            subject = fakerUtils.getUserSubject(),
            hobby = fakerUtils.getUserHobby(),
            address = fakerUtils.getUserAddress(),
            state = fakerUtils.getUserState(),
            city = fakerUtils.getUserCity(state),
            file = fakerUtils.getUserFile();
}
