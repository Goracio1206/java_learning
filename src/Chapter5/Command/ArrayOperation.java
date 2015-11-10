package Chapter5.Command;

/**
 * Created by Vitalii.Nedzelskyi on 10.11.2015.
 */
public class ArrayOperation {
    private int[] array;

    public ArrayOperation(int[] array) {
        this.array = array;
    }

    public void sum() {
        int sum = 0;
        for (int i : array){
            sum += i;
        }
        System.out.println(sum);
    }

    public void product() {
        int mult = 1;
        for (int i : array)
            mult *= i;
        System.out.println(mult);
    }

}
