package rpgconsole.menu;

import rpgconsole.menu.option.OptionFactory;

public class MenuMap extends MenuAbstract{

    public MenuMap(){
        this.name = "map";
    }
    
    @Override
    public void display() {
        System.out.println("MENU MAP");
    }

    @Override
    public void initOptions() {
        OptionFactory optionFactory = new OptionFactory();
        this.options.add(optionFactory.getOption("moveAroundMap"));
        this.options.add(optionFactory.getOption("back"));
    }
    
}