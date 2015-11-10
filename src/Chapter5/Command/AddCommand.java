package Chapter5.Command;

/**
 * Created by Vitalii.Nedzelskyi on 10.11.2015.
 */
public class AddCommand extends Command {
    private ArrayOperation ao;

    public AddCommand(ArrayOperation ao) {
        this.ao = ao;
    }

    public void execute() {
        this.ao.sum();
    }
}
