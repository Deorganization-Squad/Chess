package startGame;
import pieces.Pawn;
import pieces.Piece;

import java.util.Scanner;
import java.util.Scanner.*;

public class Game {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("would you like to start the game?");

        Pawn pawn = new Pawn(85);
        pawn.getColor();

    }
}
