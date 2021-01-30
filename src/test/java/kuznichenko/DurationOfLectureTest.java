package kuznichenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DurationOfLectureTest {

    @Test
    public void checkLectureDuration(){
    DurationOfLecture durationOfLecture = new DurationOfLecture();
    String actualResult = durationOfLecture.durationOf();
    String expectedResult = "Дней: 03, часов: 02, минут: 00";
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
