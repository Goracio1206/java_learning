package HomeWork.Chapter8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Vitalii.Nedzelskyi on 27.11.2015.
 */
public class DEmoDateFormat {
    public static void main(String[] args) throws ParseException {
        DateFormat dfDE = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("DE"));
        DateFormat dfBY = DateFormat.getDateInstance(DateFormat.FULL, new Locale("BY"));

        SimpleDateFormat format = new SimpleDateFormat("dd-YYYY-MM & hh:mm:ss");

        String DE = dfDE.format(new Date());
        String BY = dfBY.format(new Date());



        System.out.println(DE);
        System.out.println(BY);

        System.out.println(dfBY.parse(BY));
        System.out.println(dfDE.parse(DE));

        String str = format.format(new Date());

        System.out.println(str);

    }
}
