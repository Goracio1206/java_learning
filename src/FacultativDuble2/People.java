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

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Override
    public String toString() {
        if(state){
            return "Professor: " + this.fName + " " + this.lName;
        }
        else {
            return"Student: " + this.fName + " " + this.lName;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (obj instanceof People){
            People temp = (People) obj;
            return this.fName == temp.fName && this.lName == temp.lName && this.state == temp.state;
        }else {
            return false;
        }
    }
}
