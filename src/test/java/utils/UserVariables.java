package utils;

public class UserVariables {

    FakerUtils faker = new FakerUtils();



    public String
            firstName = faker.getFirstName(),
            lastName = faker.getLastName(),
            email = faker.getUserEmail(),
            gender = faker.getUserGender(),
            birthMonth = faker.getUserBirthMonth(),
            birthYear = faker.getUserBirthYear(),
            birthDay = faker.getUserBirthDay(birthYear,birthMonth),
            number = faker.getUserNumber(),
            subject = faker.getUserSubject(),
            hobby = faker.getUserHobby(),
            address = faker.getUserAddress(),
            state = faker.getUserState(),
            city = faker.getUserCity(state),
            file = faker.getUserFile();


}
