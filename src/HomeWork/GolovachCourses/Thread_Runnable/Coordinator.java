package HomeWork.GolovachCourses.Thread_Runnable;

/**
 * Created by Vitalii.Nedzelskyi on 18.11.2015.
 */
class Coordinator implements Runnable {

    public void run() {
        try {
            test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void test() throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            Thread threadA = new Thread(new PrintRunnable("A .", 98));
            Thread threadB = new Thread(new PrintRunnable(". B", 99));
            Thread threadC = new Thread(new PrintRunnable(" C ", 100));

            startThread(threadA, threadB);
            threadJoin(threadA, threadB);

            System.out.println("--------------");

            startThread(threadC);
            threadJoin(threadC);

            System.out.println("--------------");
            //System.out.println(threadC.getName());
        }
    }

    private void startThread(Thread... args) {
        for (int i = 0; i <args.length ; i++) {
            args[i].start();
        }
    }

    private void threadJoin(Thread... args) throws InterruptedException {
        for (int i = 0; i <args.length ; i++) {
            args[i].join();
        }
    }

}
