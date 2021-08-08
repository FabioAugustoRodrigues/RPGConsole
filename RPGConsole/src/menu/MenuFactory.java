package rpgconsole.menu;

import java.util.ArrayList;

public class MenuFactory {
    
    private ArrayList<MenuAbstract> menu = new ArrayList();
    
    public MenuFactory(){
        menu.add(new MenuStart());
    }
    
    public MenuAbstract getMenu(String name){
        for (MenuAbstract menuAbstract: menu){
            if (menuAbstract.name.equals(name)){
                return menuAbstract;
            }
        }
        return null;
    }
}
