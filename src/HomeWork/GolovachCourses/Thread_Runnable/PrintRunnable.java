package HomeWork.GolovachCourses.Thread_Runnable;

/**
 * Created by Vitalii.Nedzelskyi on 18.11.2015.
 */
public class PrintRunnable implements Runnable {
    private long sleepMilis;
    private String  msg;

    public PrintRunnable(String msg, long sleepMilis) {
        this.msg = msg;
        this.sleepMilis = sleepMilis;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2 ; i++) {
            try {
                Thread.sleep(sleepMilis);
            } catch(InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(msg);
        }

    }
}
