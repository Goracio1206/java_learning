package Facultativ;

/**
 * Created by Vitalii.Nedzelskyi on 23.10.2015.
 */
public class Run {
    public static void main(String[] args){
        Teacher teacher1 = new Teacher("Michael", "Dow" , "Biology");
        System.out.println(teacher1);
        teacher1.openClasses("Biology");
        teacher1.openClasses("Economy");
        //teacher1.prinClasses();

        Student st1 = new Student("John", "Black");
        st1.startStudy(teacher1, "Economy", st1);

        teacher1.prinClasses();
        st1.startStudy(teacher1, "IT", st1);
    }
}
