package Chapter5.Command;

/**
 * Created by Vitalii.Nedzelskyi on 10.11.2015.
 */
public class ManagerCommands {

    private Command command;

    public ManagerCommands(Command command) {
        this.command = command;
    }

    public void setManager(Command command) {
        this.command = command;
    }

    public void exec() {
        command.execute();
    }

}
