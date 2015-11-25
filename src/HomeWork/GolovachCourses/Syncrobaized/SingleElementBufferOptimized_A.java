package HomeWork.GolovachCourses.Syncrobaized;

public class SingleElementBufferOptimized_A {
    private int waitedProducers = 0;
    private int waitedConsumers = 0;
    private Integer elem = null;

    public synchronized void put(Integer newElem) throws InterruptedException {
        while (elem != null) {
            waitedProducers++;
            this.wait();
            waitedProducers--;
        }
        this.elem = newElem;
        if (waitedConsumers > 0) {
            this.notify();
        }
    }

    public synchronized Integer get() throws InterruptedException {
        while (elem == null) {
            waitedConsumers++;
            this.wait();
            waitedConsumers--;
        }
        int result = this.elem;
        this.elem = null;
        if (waitedProducers > 0) {
            this.notify();
        }
        return result;
    }

    public static void main(String[] args) throws InterruptedException {
        SingleElementBufferOptimized_A test = new SingleElementBufferOptimized_A();

        test.put(2);
        //test.get();
        System.out.println(test.get());
    }
}