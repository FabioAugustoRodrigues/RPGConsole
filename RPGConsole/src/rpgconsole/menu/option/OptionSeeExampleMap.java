package rpgconsole.menu.option;

import java.util.Scanner;
import rpgconsole.RPGConsole;
import rpgconsole.character.Player;
import rpgconsole.map.ExampleMap;
import rpgconsole.menu.MenuMap;
import rpgconsole.menu.MenuStandard;

public class OptionSeeExampleMap extends OptionAbstract {

    public OptionSeeExampleMap(){
        this.name = "seeExampleMap";
        this.label = "See example map";
    }
    
    @Override
    public void execute() {
        try {
            RPGConsole.currentMap = new ExampleMap();
            RPGConsole.currentMap.create();
            
            RPGConsole.stackMenu.push(RPGConsole.currentMenu);
            RPGConsole.currentMenu = new MenuMap();
        } catch (Exception ex) {
            RPGConsole.error = ex.getMessage();
        }
    }
}