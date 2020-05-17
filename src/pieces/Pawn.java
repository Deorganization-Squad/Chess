package pieces;
public class Pawn extends Piece {
    public Pawn(int x){
      setup(x);
    }
    public Boolean moveCheck(int x){
        Boolean occupied;
        return true;
    }
    public void setup(int x){
        if (x < 50){
            this.setColor(Color.WHITE);
        } else {
            this.setColor(Color.BLACK);
        }
        int position = x;
        this.setMortality(Mortality.ALIVE);
    }
}
