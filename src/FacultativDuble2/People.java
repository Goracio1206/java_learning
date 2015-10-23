package FacultativDuble2;

/**
 * Created by Vitalii.Nedzelskyi on 23.10.2015.
 */
public class People {
    private String fName;
    private String lName;
    private boolean state = false;

    public People(String fName, String lName, boolean state) {
        this.fName = fName;
        this.lName = lName;
        this.state = state;
    }

    public People() {}

    @Override
    public String toString() {
        if(state){
            return "Professor: " + this.fName + " " + this.lName;
        }
        else {
            return"Student: " + this.fName + " " + this.lName;
        }
    }
}
