package collection.utils;

import collection.music.Album;
import collection.music.Coordinates;
import collection.music.MusicGenre;

import java.util.Date;

public interface asker {
    public static String askName(){
        String bandName;
        bandName = ""; // todo ask name
        return bandName;
    }

    public static Coordinates askCoordinates(){
        Coordinates bandCoordinates = new Coordinates();
        double x = 0; // todo ask for coordinates
        int y = 0;
        bandCoordinates.setX(x);
        bandCoordinates.setY(y);
        return bandCoordinates;
    }

    public static Date askDate(){
        int day=1;
        int month=2;
        int year=1970;
        Date creationDate = new Date();
        creationDate.setYear(year); // todo ask for Date
        creationDate.setMonth(month);
        creationDate.setDate(day);
        return creationDate;
    }

    public static long askParticipants(){
        long participantsNumber = 0; // todo ask for participants number
        return participantsNumber;
    }

    public static int askAlbums(){
        int albumsNumber = 0; // todo ask for albums number
        return albumsNumber;
    }

    public static String askDescription(){
        String bandDescription = ""; // todo ask for description
        return bandDescription;
    }

    public static MusicGenre askGenre(){
        MusicGenre bandGenre = MusicGenre.BLUES; // todo ask for genre
        return bandGenre;
    }

    public static Album askBest(){
        String albumName = "Piano"; // todo ask for best album
        int tracksNumber = 2;
        Integer albumLength = null;
        double albumSales = 2.3;
        Album bestAlbum = new Album(albumName, tracksNumber, albumLength, albumSales);
        return bestAlbum;
    }
}
