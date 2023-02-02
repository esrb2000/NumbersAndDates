package practice;

import javax.xml.crypto.Data;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Birthdays {
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 1990;
        System.out.println(collectBirthdays(year, month, day));
    }
    public static String collectBirthdays(int year, int month, int day) {
        int birthdayNumber = 0;
        String collectionDate = "";
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //formatter.format(birthday);

        if (birthday.isAfter(today)) {
            String error = "Введена некоректная дата";
            return error;
        } else {
            for (LocalDate i = birthday.plusYears(0); i.isBefore(today); i = i.plusYears(1)) {
                collectionDate = collectionDate + birthdayNumber + " - " + i + " - " + i.getDayOfWeek() + System.lineSeparator();
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
