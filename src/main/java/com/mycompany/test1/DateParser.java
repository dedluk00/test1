
package com.mycompany.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {
    /**
     * Parse date.
     * @param input date in Czech format, e.g. 29. 6. 2020.
     * @return parsed Date, never null.
     * @throws DateFormatException if the input is not a valid date.
     * @throws java.text.ParseException
     */
    public Date parse(String input) throws DateFormatException, ParseException{
        SimpleDateFormat formatter= new SimpleDateFormat("dd. MM. yyyy");
        Date date= formatter.parse(input);
        return date;
    }
}
