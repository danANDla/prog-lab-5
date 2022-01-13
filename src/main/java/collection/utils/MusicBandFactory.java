package collection.utils;

import collection.music.Album;
import collection.music.Coordinates;
import collection.music.MusicBand;
import collection.music.MusicGenre;

import java.util.Date;


public class MusicBandFactory {
    private Integer id = 0;

    public MusicBand makeBand(){
        return new MusicBand(
                getId(),
                askName(),
                askCoordinates(),
                askDate(),
                askParticipants(),
                askAlbums(),
                askDescription(),
                askGenre(),
                askBest()
        );
    }

    public Integer getId(){
        id++;
        return id;
    }

    private String askName(){
        String bandName;
        bandName = ""; // todo ask name
        return bandName;
    }

    private Coordinates askCoordinates(){
       Coordinates bandCoordinates = new Coordinates();
       double x = 0; // todo ask for coordinates
       int y = 0;
       bandCoordinates.setX(x);
       bandCoordinates.setY(y);
       return bandCoordinates;
    }

    private Date askDate(){
        int day=1;
        int month=2;
        int year=1970;
        Date creationDate = new Date();
        creationDate.setYear(year); // todo ask for Date
        creationDate.setMonth(month);
        creationDate.setDate(day);
        return creationDate;
    }

    private long askParticipants(){
        long participantsNumber = 0; // todo ask for participants number
        return participantsNumber;
    }

    private int askAlbums(){
        int albumsNumber = 0; // todo ask for albums number
        return albumsNumber;
    }

    private String askDescription(){
        String bandDescription = ""; // todo ask for description
        return bandDescription;
    }

    private MusicGenre askGenre(){
        MusicGenre bandGenre = MusicGenre.BLUES; // todo ask for genre
        return bandGenre;
    }

    private Album askBest(){
        String albumName = "Piano"; // todo ask for best album
        int tracksNumber = 2;
        Integer albumLength = null;
        double albumSales = 2.3;
        Album bestAlbum = new Album(albumName, tracksNumber, albumLength, albumSales);
        return bestAlbum;
    }

}
