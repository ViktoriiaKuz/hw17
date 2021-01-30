package kuznichenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormatterDateTimeTest {
    @Test
    public void checkFormatterDateTime(){
        FormatterDateTime formatterDateTime = new FormatterDateTime();
        String actualResult = formatterDateTime.formatterMethod();
        String expectedResult = "Date: 1999-06-18T19:34:56";
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
