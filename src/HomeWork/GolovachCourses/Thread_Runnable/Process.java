package HomeWork.GolovachCourses.Thread_Runnable;

/**
 * Created by Vitalii.Nedzelskyi on 18.11.2015.
 */
public class Process {
    public static void main(String[] args) {
        Thread threadCoordinator = new Thread(new Coordinator());
        threadCoordinator.start();
        System.out.println(threadCoordinator.getName() +  " " + threadCoordinator.getId());
    }
}
