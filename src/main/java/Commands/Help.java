package Commands;

import services.IOutil;

import java.util.HashMap;
import java.util.Map;

public class Help implements Command{
    private HashMap<String, Command> commandsList;
    private IOutil io;

    public Help(HashMap<String, Command> commandsList, IOutil io) {
        this.commandsList = commandsList;
        this.io = io;
    }

    @Override
    public void execute() {
       for(Map.Entry<String, Command> command: commandsList.entrySet()){
          //io.printText(command.getKey() + " - " + command.getValue().getdescription());
          io.printCommand(command.getKey(), command.getValue().getdescription());
       }
    }

    @Override
    public String getdescription() {
        String descr = "вывести справку по доступным командам";
        return descr;
    }
}
