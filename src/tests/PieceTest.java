package tests;

import pieces.Pawn;
import pieces.Piece;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @org.junit.jupiter.api.Test
    void mainTest() {
    }

    @org.junit.jupiter.api.Test
    void positionTest() {
        assertEquals("H1",Piece.positionconv(81));
    }

    @org.junit.jupiter.api.Test
    void moveTest() {
    }

    @org.junit.jupiter.api.Test
    void createPosFileTest() {
    }

    @org.junit.jupiter.api.Test
    void findPosTest() {
    }

    @org.junit.jupiter.api.Test
    void boardtest() {
        Pawn pawn = new Pawn(10);
        assertEquals(8, Piece.b.length);
        assertEquals(8, Piece.b[0].length);

    }
}