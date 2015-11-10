package Chapter5.Strategy;

/**
 * Created by Vitalii.Nedzelskyi on 10.11.2015.
 */
public class Sorting {
    private Operation oper = null;

    public Sorting(int operation ) {
        switch (operation) {
            case 1: this.oper = new SortByMax();
                break;
            case 2: this.oper = new SortByMin();
                break;
            default:
                System.out.println("This operation is missing!");
        }
    }

    public void sorting(int[] array) {
        if (array != null)
            oper.sort(array);
        else return;
    }

}
