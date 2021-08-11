package rpgconsole.menu;

import rpgconsole.menu.option.OptionFactory;
import rpgconsole.RPGConsole;

public class MenuStandard extends MenuAbstract{

    public MenuStandard(){
        this.name = "standard";
    }
    
    @Override
    public void display() {
        System.out.println("--------------------------------------------");
        System.out.println(RPGConsole.player.getName());
        System.out.print("HP: " + RPGConsole.player.getHp());
        System.out.println(" | (" + RPGConsole.player.pos_x + ", " + RPGConsole.player.pos_y + ") global coordinates");
        System.out.println("--------------------------------------------");
    }

    @Override
    public void initOptions() {
        OptionFactory optionFactory = new OptionFactory();
        this.options.add(optionFactory.getOption("seeExampleMap"));
        this.options.add(optionFactory.getOption("exit"));
    }
}