package kuznichenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParserDateTimeTest {
    @Test
    public void checkParseDateTime(){
        ParserDateTime parserDateTime = new ParserDateTime();
        String actualResult = parserDateTime.parserMethod();
        String expectedResult = "23:56 2001/01/01";
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
