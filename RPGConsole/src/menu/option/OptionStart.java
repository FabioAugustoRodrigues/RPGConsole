package rpgconsole.menu.option;

import java.util.Scanner;
import rpgconsole.RPGConsole;
import rpgconsole.character.Player;

public class OptionStart extends OptionAbstract {

    public OptionStart(){
        this.name = "start";
        this.label = "Start game";
    }
    
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What are your name? ");
        name = scanner.next();
        
        RPGConsole.player = new Player(name);   
    }
    
}
