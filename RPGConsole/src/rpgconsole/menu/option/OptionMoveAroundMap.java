package rpgconsole.menu.option;

import java.util.Scanner;
import rpgconsole.RPGConsole;

public class OptionMoveAroundMap extends OptionAbstract{

    public OptionMoveAroundMap(){
        this.name = "moveAroundMap";
        this.label = "Move around the map";
    }
    
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        
        RPGConsole.currentMap.moveToPosition(0, 0, 0, 0);
        boolean loop = true;
        
        while (loop){
            System.out.println("[W] UP | [A] LEFT | [S] DOWN | [D] RIGHT | [0] EXIT");
            System.out.print("-> ");
            char direction = scanner.next().toUpperCase().charAt(0);
            
            switch (direction){
                case 'W':
                    if (RPGConsole.currentMap.checkPosition(RPGConsole.player.pos_x, RPGConsole.player.pos_y-1)){
                        RPGConsole.currentMap.moveToPosition(RPGConsole.player.pos_x, RPGConsole.player.pos_y, RPGConsole.player.pos_x, --RPGConsole.player.pos_y);
                    }
                    break;
                case 'A':
                    if (RPGConsole.currentMap.checkPosition(RPGConsole.player.pos_x-1, RPGConsole.player.pos_y)){
                        RPGConsole.currentMap.moveToPosition(RPGConsole.player.pos_x, RPGConsole.player.pos_y, --RPGConsole.player.pos_x, RPGConsole.player.pos_y);
                    }
                    break;
                case 'S':
                    if (RPGConsole.currentMap.checkPosition(RPGConsole.player.pos_x, RPGConsole.player.pos_y+1)){
                        RPGConsole.currentMap.moveToPosition(RPGConsole.player.pos_x, RPGConsole.player.pos_y, RPGConsole.player.pos_x, ++RPGConsole.player.pos_y);
                    }
                    break;
                case 'D':
                    if (RPGConsole.currentMap.checkPosition(RPGConsole.player.pos_x+1, RPGConsole.player.pos_y)){
                        RPGConsole.currentMap.moveToPosition(RPGConsole.player.pos_x, RPGConsole.player.pos_y, ++RPGConsole.player.pos_x, RPGConsole.player.pos_y);
                    }
                    break;
                case '0':
                    loop = false;
            }
            
            if (!loop){break;}
            
            RPGConsole.clear();
            RPGConsole.currentMap.show();
        }
    }   
}