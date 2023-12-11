import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
    public static void main(String[] args) {

        String firstData = "2022-11-05";
        String secondData = "2023-11-05";

        LocalDate date1 = LocalDate.parse(firstData);
        LocalDate date2 = LocalDate.parse(secondData);

        long differenceInDays = ChronoUnit.DAYS.between(date1, date2);
        long differenceInMonth = ChronoUnit.MONTHS.between(date1, date2);
        long differenceInYears = ChronoUnit.YEARS.between(date1, date2);

        System.out.println("Разница в днях: " + differenceInDays);
        System.out.println("Разница в месяцах: " + differenceInMonth);
        System.out.println("Разница в годах: " + differenceInYears);
    }

}
