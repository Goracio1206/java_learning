package Facultativ;

/**
 * Created by Vitalii.Nedzelskyi on 23.10.2015.
 */
public class Run {
    public static void main(String[] args){
        Teacher teacher1 = new Teacher("Michael", "Dow" , true , "Biology");
        System.out.println(teacher1);
        teacher1.openClasses("Biology");
        teacher1.prinClasses();
    }
}
