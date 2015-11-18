package Chapter7;

import java.util.Formatter;

/**
 * Created by Vitalii.Nedzelskyi on 16.11.2015.
 */
public class SimpleFormatString {

    public static void main(String[] args) {
        Formatter f = new Formatter(); // объявление объекта
        // форматирование текста по формату %S, %c
        f.format("This %s is about %n%S %c", "book","java",'6'); System.out.print(f);
    }
}