package Piece;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;

public abstract class Piece {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a position code(11-88)");
        position(input.nextInt());
    }

    static String position(int x) {
        int xten = x / 10;

        String pos = "";

        /*switch(x/10){
            case 1: pos = "A";
            case 2: pos = "B";
            case 3: pos = "C";
            case 4: pos = "D";
            case 5: pos = "E";
            case 6: pos = "F";
            case 7: pos = "G";
            case 8: pos = "H";
        } */

        if (xten == 1) {
            pos = "A";
        } else if (xten == 2) {
            pos = "B";
        } else if (xten == 3) {
            pos = "C";
        } else if (xten == 4) {
            pos = "D";
        } else if (xten == 5) {
            pos = "E";
        } else if (xten == 6) {
            pos = "F";
        } else if (xten == 7) {
            pos = "G";
        } else if (xten == 8) {
            pos = "H";
        }
        int y = x % 10;
        String posint = pos + y;
        // System.out.println(x/10);
        System.out.println(posint);
        return (posint);
    }
    static int move(int x){
        int y = 0;  //TODO finish this method
        return(y);
    }
    static void createPosFile(){
        try{
            File posFile = new File("PiecesPos.txt");
            if(posFile.createNewFile()){
                System.out.println("File created: " + posFile.getName());
            }else {
                System.out.println("File already exists.");
            }
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    static void findPos(){


    }
}