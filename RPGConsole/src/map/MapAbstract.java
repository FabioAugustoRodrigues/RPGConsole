package rpgconsole.map;

public abstract class MapAbstract {
    
    private final int X;
    private final int Y;
    private final char[][] MAP;
    
    public MapAbstract(int x, int y) throws Exception{
        if (x <= 0 || y <= 0){
            throw new Exception("Invalid parameters");
        }
        
        this.X = x;
        this.Y = y;
        this.MAP = new char[x][y];
    }

    public void create(){
        for (int x = 0; x < this.X; x++){
            for (int y = 0; y < this.Y; y++){
                this.MAP[x][y] = '*';
            }
        }
    }
    
    public void show(){
        for (int x = 0; x < this.X; x++){
            for (int y = 0; y < this.Y; y++){
                System.out.print(this.MAP[x][y] + " ");
            }
            System.out.println("");
        }
    }
    
    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
}
