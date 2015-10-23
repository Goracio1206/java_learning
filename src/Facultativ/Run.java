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


        Student st1 = new Student("John", "Black");
        Student st2 = new Student("Den", "Jonson");
        Student st3 = new Student("Mark", "Herrit");
        Student st4 = new Student("Stiv", "Viliams");
        Student st5 = new Student("Chack", "Cooper");
        Student st6 = new Student("Bruce", "Vilson");
        Student st7 = new Student("Gregory", "House");
        st1.startStudy(teacher1, "Economy", st1);
        st1.startStudy(teacher1, "Biology", st2);
        st1.startStudy(teacher1, "Economy", st3);
        st1.startStudy(teacher1, "Economy", st4);
        st1.startStudy(teacher1, "Economy", st5);
        st1.startStudy(teacher1, "Biology", st6);
        st1.startStudy(teacher1, "Biology", st7);

        //teacher1.prinClasses();
        //st1.startStudy(teacher1, "IT", st1);


        teacher1.setPoint(st1, 3);
        teacher1.setPoint(st2, 2);
        teacher1.setPoint(st3, 5);
        teacher1.setPoint(st4, 2);
        teacher1.setPoint(st5, 4);
        teacher1.setPoint(st6, 3);
        teacher1.setPoint(st7, 4);


        System.out.println();
        teacher1.prinClasses();
    }
}
