package Chapter5.AbstractFactory;

/**
 * Created by Vitalii.Nedzelskyi on 04.11.2015.
 */
public class AbstractFactory {
    enum Color {WHITE, BLACK};
    public static BaseFactory getFactory(String data) {
        Color my = Color.valueOf(data.toUpperCase());
        switch(my) {
            case WHITE : return new WhiteFactory();
            case BLACK : return new BlackFactory();
            default : throw new EnumConstantNotPresentException(Color.class , my.name());
        }
    }
}
