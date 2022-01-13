package collection.utils;

import collection.music.MusicBand;

import java.util.LinkedHashSet;

import static java.lang.Math.min;

public class CollectionManager {
    private Integer bandId = 0;
    private LinkedHashSet<MusicBand> bandsList;

    public void insertBand(MusicBand newBand){
        bandId+=1;
        if(idTaken(bandId) || (bandId > bandsList.size()*2)){
            bandId = findNewId(bandId);
        }
        newBand.setId(bandId);
        bandsList.add(newBand);
    }

    public LinkedHashSet<MusicBand> getBandsList() {
        return bandsList;
    }

    private boolean idTaken(Integer checkId){
        for(MusicBand band: bandsList){
            if(band.getId() == checkId) return true;
        }
        return false;
    }

    private Integer findNewId(Integer badId){
        badId = 1;
        while(idTaken(badId)){
            badId+=1;
        }
        return badId;
    }

    public boolean removeBand(Integer idRemove){
        boolean found = false;
        for(MusicBand band: bandsList){
            if(idRemove == band.getId()){
                found = true;
                bandsList.remove(band);
                bandId = idRemove;
            }
        }
        return found;
    }
}
