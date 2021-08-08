package rpgconsole.menu;

import java.util.ArrayList;
import rpgconsole.RPGConsole;
import rpgconsole.menu.option.OptionAbstract;

public abstract class MenuAbstract {
    protected String name;
    protected ArrayList<OptionAbstract> options = new ArrayList();
    
    public MenuAbstract(){
        this.initOptions();
    }
    
    public abstract void display();
    public abstract void initOptions();
    
    public void choose(int valueOption){
        if (valueOption <= this.options.size()){
            this.options.get(valueOption-1).execute();
        }else{
            RPGConsole.error = "Invalid option";
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<OptionAbstract> getOptions() {
        return options;
    }
}
