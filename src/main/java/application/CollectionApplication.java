package application;

import collection.utils.CollectionManager;
import commands.CommandsManager;
import utils.IOutil;

public class CollectionApplication {
    private IOutil io;
    private CommandsManager commandsManager;
    private CollectionManager collectionManager;

    public CollectionApplication(){
        io = new IOutil();
        collectionManager = new CollectionManager(io);
        commandsManager =  new CommandsManager(io, collectionManager);
    }

    public void start(){
        collectionManager.readXML();
        executeCommands();
    }

    public void executeCommands(){
        while(true){
            System.out.print("> ");
            String newCommand = io.readLine();
            commandsManager.executeCommand(newCommand);
        }
    }
}
