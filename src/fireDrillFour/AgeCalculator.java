package fireDrillFour;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {

    public int calculateAge(String dobString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dob = LocalDate.parse(dobString, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dob, currentDate);
        return period.getYears();
    }

    public int calculateAge2(String dobString) {
        String[] parts = dobString.split("/");
        int birthMonth = Integer.parseInt(parts[0]);
        int birthDay = Integer.parseInt(parts[1]);
        int birthYear = Integer.parseInt(parts[2]);

        int currentYear = java.time.Year.now().getValue();
        int currentMonth = java.time.MonthDay.now().getMonthValue();
        int currentDay = java.time.MonthDay.now().getDayOfMonth();
        int age = currentYear - birthYear;
        if (birthMonth > currentMonth || (birthMonth == currentMonth && birthDay > currentDay)) {
            age--;
        }
        return age;
    }
    
}
