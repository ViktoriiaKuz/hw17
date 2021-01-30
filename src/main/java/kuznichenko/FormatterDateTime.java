package kuznichenko;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


// @author: Viktoriia Kuznichenko
// @version: 0.1.1

    public class FormatterDateTime {

        public static String formatterMethod(){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd hh:mm:ss a", Locale.US);
            String a = "1999/Jun/18 07:34:56 PM";

            LocalDateTime date = LocalDateTime.parse(a, formatter);
            return ("Date: " + date);
        }

    }

