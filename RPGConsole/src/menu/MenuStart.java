package rpgconsole.menu;

import rpgconsole.menu.option.OptionFactory;

public class MenuStart extends MenuAbstract{

    public MenuStart(){
        this.name = "start";
    }
    
    @Override
    public void display() {
        System.out.println("WELCOME TO RPGCONSOLE");
    }

    @Override
    public void initOptions() {
        OptionFactory optionFactory = new OptionFactory();
        this.options.add(optionFactory.getOption("start"));
    }
    
}
