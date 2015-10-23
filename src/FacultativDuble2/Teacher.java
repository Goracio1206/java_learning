package FacultativDuble2;

/**
 * Created by Vitalii.Nedzelskyi on 23.10.2015.
 */
public class Teacher extends People {
    private String spec;

    public Teacher() {}
    public Teacher(String fName, String lName, String spec) {
        super(fName, lName, true);
        this.spec = spec;
    }



}
