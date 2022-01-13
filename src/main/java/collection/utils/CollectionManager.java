package collection.utils;

import collection.music.Album;
import collection.music.Coordinates;
import collection.music.MusicBand;
import collection.music.MusicGenre;
import exceptions.InvalidIdException;

import java.util.Date;
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

    private MusicBand getBandById(Integer id) throws InvalidIdException{
        boolean found = false;
        for(MusicBand band: bandsList){
            if(band.getId() == id){
                return band;
            }
        }
        if(!found) throw new InvalidIdException();
        return null;
    }

    public boolean updateBand(Integer idUpdate, String field){
        field = field.toUpperCase();
        try {
            MusicBand foundBand = getBandById(idUpdate);
            String newName = asker.askName();
            if(foundBand!=null) foundBand.setName(newName);
        }
        catch (InvalidIdException e){
            return false;
        }
        switch (field){
            case "NAME":{ // todo check for askers
                try {
                    MusicBand foundBand = getBandById(idUpdate);
                    String newName = asker.askName();
                    if(foundBand!=null) foundBand.setName(newName);
                    return true;
                }
                catch (InvalidIdException e){
                    return false; // todo messgae invalid id
                }
            }
            case "COORDINATES":{
                try {
                    MusicBand foundBand = getBandById(idUpdate);
                    Coordinates newCoordinates = asker.askCoordinates();
                    if(foundBand!=null) foundBand.setCoordinates(newCoordinates);
                    return true;
                }
                catch (InvalidIdException e){
                    return false; // todo messgae invalid id
                }
            }
            case "CREATION_DATE":{
                try {
                    MusicBand foundBand = getBandById(idUpdate);
                    Date newDate = asker.askDate();
                    if(foundBand!=null) foundBand.setCreationDate(newDate);
                    return true;
                }
                catch (InvalidIdException e){
                    return false; // todo messgae invalid id
                }
            }
            case "PARTICIPANTS_NUM":{
                try {
                    MusicBand foundBand = getBandById(idUpdate);
                    long newParticipants = asker.askParticipants();
                    if(foundBand!=null) foundBand.setNumberOfParticipants(newParticipants);
                    return true;
                }
                catch (InvalidIdException e){
                    return false; // todo messgae invalid id
                }
            }
            case "ALBUMS_COUNT":{
                try {
                    MusicBand foundBand = getBandById(idUpdate);
                    int newAlbums = asker.askAlbums();
                    if(foundBand!=null) foundBand.setAlbumsCount(newAlbums);
                    return true;
                }
                catch (InvalidIdException e){
                    return false; // todo messgae invalid id
                }
            }
            case "DESCRIPTION":{
                try {
                    MusicBand foundBand = getBandById(idUpdate);
                    String newDescription = asker.askDescription();
                    if(foundBand!=null) foundBand.setDescription(newDescription);
                    return true;
                }
                catch (InvalidIdException e){
                    return false; // todo messgae invalid id
                }

            }
            case "GENRE":{
                try {
                    MusicBand foundBand = getBandById(idUpdate);
                    MusicGenre newGenre = asker.askGenre();
                    if(foundBand!=null) foundBand.setGenre(newGenre);
                    return true;
                }
                catch (InvalidIdException e){
                    return false; // todo messgae invalid id
                }

            }
            case "BEST_ALBUM":{
                try {
                    MusicBand foundBand = getBandById(idUpdate);
                    Album newBest = asker.askBest();
                    if(foundBand!=null) foundBand.setBestAlbum(newBest);
                    return true;
                }
                catch (InvalidIdException e){
                    return false; // todo messgae invalid id
                }

            }
            default:{
                return false; // todo message invalid field
            }
        }
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
