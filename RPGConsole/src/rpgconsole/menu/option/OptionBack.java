package rpgconsole.menu.option;

import rpgconsole.RPGConsole;

public class OptionBack extends OptionAbstract{
    
    public OptionBack(){
        this.name = "back";
        this.label = "Back";
    }
    
    @Override
    public void execute() {
        RPGConsole.currentMenu = RPGConsole.stackMenu.pop();
    }
    
}