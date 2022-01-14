package collection.utils;

import collection.music.Album;
import collection.music.Coordinates;
import collection.music.MusicGenre;
import services.IOutil;

import java.util.Date;
import java.util.Locale;

public class asker {
    static IOutil io;

    private static String getNonEmpty(){
       String str;
       str = io.readLine().trim();
       while(str.equals("")){
           io.printError("обязательно поле");
           str = io.readLine();
       }
       return str;
    }

    private static void printGenres(){
        io.printText("список жанров:");

    }

    public static String askName(){
        io.printText("Введите название группы");
        String bandName;
        bandName = io.readLine().trim();
        while (bandName.equals("")){
            io.printError("Название группы не может быть пустой строкой");
            bandName = io.readLine().trim();
        }
        return bandName;
    }

    public static Coordinates askCoordinates(){
        boolean xvalid = false;
        boolean yvalid = false;
        double x = 0;
        int y = 0;
        Coordinates bandCoordinates = new Coordinates();
        io.printText("Введите координаты:");
        io.printText("Координата X (вещественное число)");
        while(!xvalid){
            try {
                x = Double.parseDouble(getNonEmpty());
                xvalid = true;
            } catch (NumberFormatException e){
                io.printError("Неправильный формат вещественного числа");
            }
        }
        io.printText("Координата Y (целое число)");
        while(!yvalid){
            try {
                y = Integer.parseInt(getNonEmpty());
                yvalid = true;
            } catch (NumberFormatException e){
                io.printError("Неправильный формат целого числа");
            }
        }
        bandCoordinates.setX(x);
        bandCoordinates.setY(y);
        return bandCoordinates;
    }

    public static Date askDate(){
        boolean dayvalid = false;
        boolean monthvalid = false;
        boolean yearvalid = false;
        int day=1;
        int month=2;
        int year=1970;
        Date creationDate = new Date();
        io.printText("Введите дату создания группы:");
        io.printText("год (целое число 0-2022)");
        while(!yearvalid){
            try{
                year = Integer.parseInt(getNonEmpty());
                yearvalid = true;
            } catch (NumberFormatException e){
                io.printError("Неправильный формат целого числа");
            }
        }
        io.printText("месяц (целое число 1-12)");
        while(!monthvalid){
            try{
                month = Integer.parseInt(getNonEmpty());
                monthvalid = true;
            } catch (NumberFormatException e){
                io.printError("Неправильный формат целого числа");
            }
        }
        io.printText("день (целое число 1-31)");
        while(!dayvalid){
            try{
                day = Integer.parseInt(getNonEmpty());
                dayvalid = true;
            } catch (NumberFormatException e){
                io.printError("Неправильный формат целого числа");
            }
        }
        creationDate.setYear(year);
        creationDate.setMonth(month);
        creationDate.setDate(day);
        return creationDate;
    }

    public static long askParticipants(){
        long participantsNumber = 0;
        boolean valid = false;
        io.printText("Введите количество участников");
        while(!valid){
            try {
                participantsNumber = Long.parseLong(getNonEmpty());
                valid = true;
            } catch (NumberFormatException e){
                io.printError("Неправильный формат целого числа (long)");
            }
        }
        return participantsNumber;
    }

    public static int askAlbums(){
        int albumsNumber = 0;
        boolean valid = false;
        io.printText("Введите количество записанных альбомов");
        while(!valid){
            try{
                albumsNumber = Integer.parseInt(getNonEmpty());
                valid = true;
            } catch (NumberFormatException e){
                io.printError("Неправильный формат целого числа");
            }
        }
        return albumsNumber;
    }

    public static String askDescription(){
        String bandDescription = "";
        io.printText("Введите описание");
        bandDescription = getNonEmpty();
        return bandDescription;
    }

    public static MusicGenre askGenre(){
        io.printText("Введите музыкальный жанр");
        io.printText("доступные жанры:");
        printGenres();
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
