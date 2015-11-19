package HomeWork.GolovachCourses.Thread_Runnable;

/**
 * Created by Vitalii.Nedzelskyi on 18.11.2015.
 */
public class RapidAtak  {
    public static void main(String[] args) {
        Thread thread = new Thread(new RapidFactory(1000));
        thread.start();
    }
}

class RapidFactory implements Runnable {

    private long sleep;

    public RapidFactory(long sleep) {
        this.sleep = sleep;
    }

    public void run() {
       while (true) {
           creator();
       }
    }

    private void creator() {
        for (int i = 0; i <2 ; i++) {
            try {
                Thread thread = new Thread(new RapidFactory(sleep));
                thread.start();
                Thread.sleep(sleep);
                System.out.println("hi!" + "  " + thread.getId() + " " + thread.getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}



