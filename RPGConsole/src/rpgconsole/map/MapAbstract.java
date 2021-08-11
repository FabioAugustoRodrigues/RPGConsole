package rpgconsole.map;

import rpgconsole.RPGConsole;

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
        for (int y = 0; y < this.Y; y++){
            for (int x = 0; x < this.X; x++){
                System.out.print(this.MAP[x][y] + " ");
            }
            System.out.println();
        }
    }
    
    public void moveToPosition(int pos_x, int pos_y, int newPos_x, int newPos_y){
        this.MAP[pos_x][pos_y] = '*';
        this.MAP[newPos_x][newPos_y] = RPGConsole.player.getName().charAt(0);
    }
    
    public boolean checkPosition(int pos_x, int pos_y){
        return !(pos_x < 0 || pos_x >= this.getX() || pos_y < 0 || pos_y >= this.getY());    
    }
    
    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
}