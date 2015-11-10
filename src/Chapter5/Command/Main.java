package Chapter5.Command;

/**
 * Created by Vitalii.Nedzelskyi on 10.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,78};
        ArrayOperation oper = new ArrayOperation(array);

        Command mult = new MultCommand(oper);
        Command mult2 = new AddCommand(oper);

        ManagerCommands manager = new ManagerCommands(mult);
        manager.exec();
        manager.setManager(mult2);
        manager.exec();
    }
}
