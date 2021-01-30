package kuznichenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DurationBetweenLecturesTest {
    @Test
    public void checkDurationBetweenLectures(){
        DurationBetweenLectures durationBetweenLectures = new DurationBetweenLectures();
        String actualResult = durationBetweenLectures.durationBetween();
        String expectedResult = String.format("120%s7200%s"," минут; "," секунд длится лекция.");
        Assertions.assertEquals(expectedResult, actualResult);
    }
}

