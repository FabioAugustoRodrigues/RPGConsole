package rpgconsole.menu.option;

import java.util.ArrayList;

public class OptionFactory {
    
    private ArrayList<OptionAbstract> options = new ArrayList();
    
    public OptionFactory(){
        options.add(new OptionStart());
        options.add(new OptionExit());
        options.add(new OptionSeeExampleMap());
        options.add(new OptionMoveAroundMap());
        options.add(new OptionBack());
    }
    
    public OptionAbstract getOption(String name){
        for (OptionAbstract option: options){
            if (option.name.equals(name)){
                return option;
            }
        }
        return null;
    }
    
}