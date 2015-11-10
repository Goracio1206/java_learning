package Chapter5.Strategy;

/**
 * Created by Vitalii.Nedzelskyi on 10.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Sorting sort1 = new Sorting(1);
        Sorting sort2 = new Sorting(2);
        int[] array  = {1,3,4,6,77,2,1,4,67,37,2345,1,6,68,24,5,34,21,12354,23};

        sort1.sorting(array);
        sort2.sorting(array);

    }
}
