package Commands;

import collection.utils.CollectionManager;
import collection.utils.MusicBandFactory;
import services.IOutil;

import java.util.HashMap;
import java.util.Locale;

public class CommandsManager {
    private HashMap<String, Command> commandsList;
    private IOutil io;
    CollectionManager collectionManager;

    public CommandsManager(IOutil ioutil){
        io = ioutil;
        collectionManager = new CollectionManager(io);
        fillList();
    }

    public void fillList(){
        commandsList = new HashMap<String, Command>();
        commandsList.put("ADD", new Add(collectionManager));
    }

    public void executeCommand(String command){
        command = command.trim().toUpperCase(Locale.ROOT);
        if(commandsList.containsKey(command)){
            Command newCommand = commandsList.get(command);
            newCommand.execute();
        }
        else{
            io.printError("Такой команды не найдено");
        }

    }
}
