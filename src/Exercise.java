
//package domain;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise {
    public static long Calculate(LocalDate startDate, LocalDate endDate) {
        long days = 0;
        LocalDate currenDate = startDate;

        while (!currenDate.isAfter(endDate)) { // перевірка днів у проміжку
            if (currenDate.getDayOfWeek() != DayOfWeek.SATURDAY && currenDate.getDayOfWeek() != DayOfWeek.SUNDAY) { // якщо
                                                                                                                    // днем
                                                                                                                    // не
                                                                                                                    // являється
                                                                                                                    // субота
                                                                                                                    // чи
                                                                                                                    // неділя,
                                                                                                                    // то
                                                                                                                    // збільшується
                                                                                                                    // кількість
                                                                                                                    // робочих
                                                                                                                    // днів
                days++;
            }

            currenDate = currenDate.plusDays(1); // перехід до наступного дня
        }

        return days;
    }
}
