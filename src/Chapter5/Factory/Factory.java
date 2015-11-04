package Chapter5.Factory;

/**
 * Created by Vitalii.Nedzelskyi on 04.11.2015.
 */
public class Factory {
    private enum Signs {STUDENT, TEACHER};
    public static Base getClassFromFactory(String id) {
        Signs sign = Signs.valueOf(id.toUpperCase());
        switch (sign) {
            case STUDENT : return new Student();
            case TEACHER : return new Teacher();
            default: throw new EnumConstantNotPresentException(Signs.class , sign.name());
        }
    }
}
