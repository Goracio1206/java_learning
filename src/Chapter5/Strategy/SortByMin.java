package Chapter5.Strategy;

/**
 * Created by Vitalii.Nedzelskyi on 10.11.2015.
 */
public class SortByMin  extends Operation{
    public void sort(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            for (int j = i; j <array.length ; j++) {
                if(array[i] < array[j]){
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
        for (int elem : array){
            System.out.print(elem + " ");
        }
        System.out.println(" ");
    }
}
