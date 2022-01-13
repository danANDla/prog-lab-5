package Commands;

import collection.utils.CollectionManager;
import collection.utils.MusicBandFactory;

public class Add implements Command{
    private MusicBandFactory bandFactory;
    private CollectionManager collecManager;

    @Override
    public void execute() {
        collecManager.insertBand(bandFactory.makeBand());
    }

    @Override
    public String getdescription() {
        return null; // todo description
    }
}
