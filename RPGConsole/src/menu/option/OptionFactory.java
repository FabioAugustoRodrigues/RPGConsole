package rpgconsole.menu.option;

import java.util.ArrayList;

public class OptionFactory {
    
    private ArrayList<OptionAbstract> options = new ArrayList();
    
    public OptionFactory(){
        options.add(new OptionStart());
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
