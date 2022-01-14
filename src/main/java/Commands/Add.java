package Commands;

import collection.utils.CollectionManager;
import collection.utils.MusicBandFactory;

public class Add implements Command{
    private CollectionManager collecManager;

    public Add(CollectionManager collMan){
        collecManager = collMan;
    }

    @Override
    public void execute() {
        collecManager.insertBand();
    }

    @Override
    public String getdescription() {
        String descr = "добавить новый элемент в коллекцию";
        return descr;
    }
}
