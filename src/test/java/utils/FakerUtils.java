package utils;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;


public class FakerUtils {
    Faker faker = new Faker();

    public int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public String getFirstName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getUserEmail() {
        return faker.internet().emailAddress();
    }

    public String getUserGender() {
        String[] gender = {"Male", "Female", "Other"};
        return faker.options().option(gender);
    }

    public String getUserNumber() {
        return faker.numerify("##########");
    }

    public String getUserSubject() {
        String[] subject = {"Hindi", "English", "Maths", "Physics", "Chemistry",
                "Biology", "Computer Science", "Commerce",
                "Accounting", "Economics", "Arts", "Social Studies", "History", "Civics"};
        return faker.options().option(subject);
    }

    public String getUserHobby() {
        String[] hobby = {"Sports", "Reading", "Music"};
        return faker.options().option(hobby);
    }

    public String getUserAddress() {
        return faker.address().fullAddress();
    }

    public String getUserState() {
        String[] userState = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return faker.options().option(userState);
    }

    public String getUserCity(String stateName) {
        switch (stateName) {
            case "NCR" -> {
                String[] city = {"Delhi", "Gurgaon", "Noida"};
                return faker.options().option(city);
            }
            case "Uttar Pradesh" -> {
                String[] city = {"Agra", "Lucknow", "Merrut"};
                return faker.options().option(city);
            }
            case "Haryana" -> {
                String[] city = {"Karnal", "Panipat"};
                return faker.options().option(city);
            }
            case "Rajasthan" -> {
                String[] city = {"Jaipur", "Jaiselmer"};
                return faker.options().option(city);
            }
        }
        return null;
    }

    public String getUserBirthDay(String year, String month) {
        int day = getRandomInt(1, 31);
        Set<String> set = new HashSet<>(Arrays.asList("March", "April", "June", "September", "November"));
        if (day < 10) {
            return "0" + day;
        } else if (Integer.parseInt(year) % 4 != 0 & month.equals("February") & day > 29) {
            return "29";
        } else if (Integer.parseInt(year) % 4 == 0 & month.equals("February") & day > 28) {
            return "28";
        } else if (set.contains(month) & day > 30) {
            return "30";
        }
        return Integer.toString(day);
    }

    public String getUserBirthMonth() {
        String[] userMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return faker.options().option(userMonth);
    }

    public String getUserBirthYear() {
        int year = getRandomInt(1900, 2100);
        return Integer.toString(year);
    }

    public String getUserFile() {
        String[] files = {"cat.jpg", "text.txt"};
        return faker.options().option(files);
    }




}