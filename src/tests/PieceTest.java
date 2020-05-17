package tests;

import pieces.Piece;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @org.junit.jupiter.api.Test
    void mainTest() {
    }

    @org.junit.jupiter.api.Test
    void positionTest() {
        assertEquals("H",Piece.positionconv(81));
    }

    @org.junit.jupiter.api.Test
    void moveTest() {
        assertEquals(0,Piece.move(0));
    }

    @org.junit.jupiter.api.Test
    void createPosFileTest() {
    }

    @org.junit.jupiter.api.Test
    void findPosTest() {
    }
}