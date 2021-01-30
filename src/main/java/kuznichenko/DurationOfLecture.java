package kuznichenko;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// @author: Viktoriia Kuznichenko
// @version: 0.1.1

    public class DurationOfLecture {
       static LocalDateTime mondayStart;
       static LocalDateTime thursdayEnd;


public static String durationOf(){
    mondayStart = LocalDateTime.of(LocalDate.of(2021,1,11), LocalTime.of(20,0));
    thursdayEnd = LocalDateTime.of(LocalDate.of(2021,1,14), LocalTime.of(22,0));

            int days = thursdayEnd.getDayOfMonth() - mondayStart.getDayOfMonth();

            int hours = thursdayEnd.getHour() - mondayStart.getHour();

            int minutes = thursdayEnd.getMinute() - mondayStart.getMinute();
            return ("Дней: 0" + days + ", часов: 0" + hours + ", минут: 0" + minutes);


        }


}
