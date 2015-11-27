package HomeWork.Chapter8;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by Vitalii.Nedzelskyi on 27.11.2015.
 */
public class DemoNumberFormat {
    public static void main(String[] args) throws ParseException {
        NumberFormat nfGE = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat nfJPN = NumberFormat.getInstance(Locale.JAPAN);
        NumberFormat nfLocal = NumberFormat.getInstance();

        double GE, JPN, local;
        String str = "1524586,452";
        GE = nfGE.parse(str).doubleValue();
        JPN = nfJPN.parse(str).doubleValue();
        local = nfLocal.parse(str).doubleValue();
        System.out.println(GE);
        System.out.println(JPN);
        System.out.println(local);
    }
}
