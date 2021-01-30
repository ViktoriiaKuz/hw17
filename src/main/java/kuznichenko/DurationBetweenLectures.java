package kuznichenko;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


// @author: Viktoriia Kuznichenko
// @version: 0.1.1

    public class DurationBetweenLectures {
        static LocalDateTime mondayStart;
        static LocalDateTime mondayEnd;

        public static String durationBetween() {


            mondayStart = LocalDateTime.of(LocalDate.of(2021, 1, 11), LocalTime.of(20, 0));
            mondayEnd = LocalDateTime.of(LocalDate.of(2021, 1, 11), LocalTime.of(22, 0));

            Duration duration = Duration.between(mondayEnd, mondayStart);
            long diffMinutes1 = Math.abs(duration.toMinutes());
            long diffSeconds = Math.abs(duration.toSeconds());

            return (diffMinutes1 + " минут; " + diffSeconds + " секунд" + " длится лекция.");
        }
    }

