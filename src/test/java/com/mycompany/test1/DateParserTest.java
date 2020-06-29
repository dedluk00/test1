
package com.mycompany.test1;

import java.util.Calendar;
import java.util.Date;
import junit.framework.TestCase;
/**
 *
 * @author Lukáš
 */
public class DateParserTest extends TestCase {
    
    public void testParse() throws Exception{
        
        DateParser dp=new DateParser();
        Date parsedDate= dp.parse("29. 06. 2020");
        assertNotNull(parsedDate);
        Calendar c= Calendar.getInstance();
        c.setTime(parsedDate);
        assertEquals(29, c.get(Calendar.DAY_OF_MONTH));
        assertEquals(5, c.get(Calendar.MONTH));
        assertEquals(2020, c.get(Calendar.YEAR));
//        try{
//            dp.parse("xxx");
//            fail("Expected exception");
//        }catch(DateFormatException e){
//            //Expected.
//        }
    }
    
}
