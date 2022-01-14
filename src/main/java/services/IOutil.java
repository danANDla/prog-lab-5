package services;

import java.util.Scanner;

public class IOutil {
    private boolean errsInOut = false;
    private final Scanner scanner;

    public IOutil(){
        scanner = new Scanner(System.in);
    }

    public void setErrsInOut(boolean errsInOut) {
        this.errsInOut = errsInOut;
    }

    public void printText(String text){
        System.out.println(text);
    }
    public void printWarning(String text){
        System.out.println( "\u001B[33m" + text + "\u001B[0m");
    }
    public void printCommand(String commandName, String commandDescription){
        System.out.printf("  %-10s %-90s \n", commandName, commandDescription);
    }
    public void printError(String text){
        if(errsInOut) System.out.println("\u001B[31m" + "Error: " + text + "\u001B[0m");
        System.err.println(text);
    }
    public String readLine(){
        return scanner.nextLine();
    }
}
