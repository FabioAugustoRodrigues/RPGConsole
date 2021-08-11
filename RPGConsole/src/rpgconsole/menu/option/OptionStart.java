package rpgconsole.menu.option;

import java.util.Scanner;
import rpgconsole.RPGConsole;
import rpgconsole.character.Player;
import rpgconsole.menu.MenuStandard;

public class OptionStart extends OptionAbstract {

    public OptionStart(){
        this.name = "start";
        this.label = "Start game";
    }
    
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a name: ");
        name = scanner.next();
        
        RPGConsole.player = new Player(name);
        RPGConsole.currentMenu = new MenuStandard();
    }   
}