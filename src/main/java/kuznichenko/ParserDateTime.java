package kuznichenko;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// @author: Viktoriia Kuznichenko
// @version: 0.1.1

    public class ParserDateTime {

public static String parserMethod(){


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm yyyy/dd/MM");


            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MMM/dd HH:mm:ss");
            LocalDateTime parseDateTime = LocalDateTime.parse("2001/Jan/01 23:56:00", format);
            String finalDateTimeFormat = parseDateTime.format(formatter);
            return finalDateTimeFormat;
        }
    }


