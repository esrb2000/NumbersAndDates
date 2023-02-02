package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {
    public static void main(String[] args) {
        int day = 02;
        int month = 02;
        int year = 2023;
        System.out.println(collectBirthdays(year, month, day));
    }
    public static String collectBirthdays(int year, int month, int day) {
        int birthdayNumber = 0;
        String collectionDate = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E").localizedBy(new Locale("us"));
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);


        if (birthday.isAfter(today)) {
            String error = " ";
            return error;
        } else {
            for (LocalDate i = birthday.plusYears(0); (i.isBefore(today)) || (i.isEqual(today)); i = i.plusYears(1)) {
                String formatBirthday = formatter.format(i);
                collectionDate = collectionDate + birthdayNumber + " - " + formatBirthday + System.lineSeparator();
                birthdayNumber = birthdayNumber + 1;
            }
        }
        return collectionDate;
        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
        //return "";

    }
}
