package pieces;

public abstract class Piece {
    public Color color;
    public Mortality mortality;

    public enum Mortality{
        DEAD,
        ALIVE
    }

    public enum Color{
        WHITE,
        BLACK
    }

    public static int[][] b = new int[8][8];
    public static String positionconv(int x) {
        int xten = x/ 10;
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

   /*static void createPosFile(){
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
    */
    static void findPos(){

    }

    public void setup(int x){
        int y = x/10;
        int z = x%10;
        if (x > 50){
            this.setColor(Color.WHITE);
        } else {
            this.setColor(Color.BLACK);
        }
        int position = x;
        this.setMortality(Mortality.ALIVE);
        b[y][z] = 1; 
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMortality(Mortality mortality) {
        this.mortality = mortality;
    }

    public Mortality getMortality() {
        return mortality;
    }

    public Color getColor() {
        return color;
    }
}
