package startGame;
import pieces.*;
import Board.*;

import java.util.Scanner;
import java.util.Scanner.*;

public class Game {
    public static void main(String[] args){
        int [][] b = new int[7][7];
        Scanner console = new Scanner(System.in);
        System.out.println("would you like to start the game?");
        piecesSetup();
        System.out.println(b);
    }
    public static void piecesSetup(){
                                            // Black Side
        Pawn pawn21 = new Pawn(10);
        Pawn pawn22 = new Pawn(11);
        Pawn pawn23 = new Pawn(12);
        Pawn pawn24 = new Pawn(13);
        Pawn pawn25 = new Pawn(14);
        Pawn pawn26 = new Pawn(15);
        Pawn pawn27 = new Pawn(16);
        Pawn pawn28 = new Pawn(17);
        Rook rook11 = new Rook(0);
        Bishop bishop12 = new Bishop(1);
        Knight knight13 = new Knight(2);
        King king14 = new King(3);
        Queen queen15 = new Queen(4);
        Knight knight16 = new Knight(5);
        Bishop bishop17 = new Bishop(6);
        Rook rook18 = new Rook(7);

                                            // White Side
        Pawn pawn71 = new Pawn(60);
        Pawn pawn72 = new Pawn(61);
        Pawn pawn73 = new Pawn(62);
        Pawn pawn74 = new Pawn(63);
        Pawn pawn75 = new Pawn(64);
        Pawn pawn76 = new Pawn(65);
        Pawn pawn77 = new Pawn(66);
        Pawn pawn78 = new Pawn(67);
        Rook rook81 = new Rook(60);
        Bishop bishop82 = new Bishop(71);
        Knight knight83 = new Knight(72);
        King king84 = new King(73);
        Queen queen85 = new Queen(74);
        Knight knight86 = new Knight(75);
        Bishop bishop87 = new Bishop(76);
        Rook rook88 = new Rook(77);
    }
}
