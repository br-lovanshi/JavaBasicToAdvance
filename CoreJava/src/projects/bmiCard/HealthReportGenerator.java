package projects.bmiCard;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class HealthReportGenerator {

    private static String dobFormat = "dd-MM-yyyy";

    public static void main(String[] args) {
        HealthReportGenerator reportGenerator = new HealthReportGenerator();
        int weight = 67;
        String dob = "25-05-2001";
        String name = "User";
        double height = 1.72;
        String gender = "M";
        Map<String, String> healthKart = reportGenerator.healthReportGenerator(name, weight, dob, height, gender);
        System.out.println("\n");
        for(Map.Entry<String, String> map : healthKart.entrySet()){
            System.out.print(map.getKey() + " : ");
            System.out.print(map.getValue());
        }
        System.out.println("\n");
    }

    private Map<String, String> healthReportGenerator(String name, int weight, String dob, double height, String gender) {

        if (dob == null) {
            throw new NullPointerException("Please provide dob");
        }

        Map<String, Integer> ageMap = findCurrentAge(dob);
        int age = ageMap.get("years");
        int bmi = calculateBmi(weight, height);
        String weightResult = null;
        String overAllHealth = null;
        String suggestion = "Keep focus on your health.";

        if (gender.equals(Gender.MALE)) {
            if ((age >= 18 || age <= 34) && (bmi >= 23 || bmi <= 26)) {
                weightResult = BMIResultEnum.NORMAL_WEIGHT.toString();
                overAllHealth = "Good";
                suggestion = "You are healty, keep focus on diet and exercise.";
            } else if ((age >= 18 || age <= 34) && bmi < 23) {
                weightResult = BMIResultEnum.UNDERWEIGHT.toString();
                overAllHealth = "Weight is low";
                suggestion = "Please consume more calories, keep focus on diet and exercise.";
            } else if ((age >= 18 || age <= 34) && bmi > 26) {
                weightResult = BMIResultEnum.OVER_WEIGHT.toString();
                overAllHealth = "Not good";
                suggestion = "Please consume less calories till normal weight, keep focus on diet and exercise.";

            }
        } else if (gender.equals(Gender.FEMALE)) {
            if ((age >= 18 || age <= 34) && (bmi >= 15 || bmi <= 25)) {
                weightResult = BMIResultEnum.NORMAL_WEIGHT.toString();
                overAllHealth = "Good";
                suggestion = "You are healty, keep focus on diet and exercise.";
            } else if ((age >= 18 || age <= 34) && bmi < 15) {
                weightResult = BMIResultEnum.UNDERWEIGHT.toString();
                overAllHealth = "Weight is low";
                suggestion = "Please consume more calories, keep focus on diet and exercise.";
            } else if ((age >= 18 || age <= 34) && bmi > 25) {
                weightResult = BMIResultEnum.OVER_WEIGHT.toString();
                overAllHealth = "Not good";
                suggestion = "Please consume less calories till normal weight, keep focus on diet and exercise.";

            }
        }
        String currentAge =  age + " year " + ageMap.get("months") + " Months " + ageMap.get("days") + " days ";
        Map<String, String> healthKart = new HashMap<>();
        healthKart.put("greeting", "Dear " + name + " please find your health info ");
        healthKart.put("age", currentAge);
        healthKart.put("BMI", bmi + "");
        healthKart.put("weightResult",weightResult);
        healthKart.put("overAllHealth", overAllHealth);
        healthKart.put("suggestion", suggestion);

        return healthKart;

    }

    private int calculateBmi(int weight, double height) {
        return (int) ((int) weight /Math.pow(height, 2));
    }

    private Map<String, Integer> findCurrentAge(String dob) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern(dobFormat);
        LocalDate birthDate = LocalDate.parse(dob, pattern);
        LocalDate currentDate = LocalDate.now();

        int years = Period.between(birthDate, currentDate).getYears();
        int months = Period.between(birthDate, currentDate).getMonths();
        int days = Period.between(birthDate, currentDate).getDays();
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("years", years);
        ageMap.put("months", months);
        ageMap.put("days", days);
        return ageMap;
    }
}
