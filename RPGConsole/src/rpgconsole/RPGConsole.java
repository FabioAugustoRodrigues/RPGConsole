package rpgconsole;

import java.util.Scanner;
import rpgconsole.character.Player;
import rpgconsole.map.MapAbstract;
import rpgconsole.menu.MenuAbstract;
import rpgconsole.menu.MenuFactory;

public class RPGConsole {

    public static Player player;
    public static MapAbstract currentMap;
    public static String error = new String();
    public static MenuAbstract currentMenu;
    public static boolean isGameOver = false;
    
    public static RPGConsole engine;
    
    public void displayMenu(){
        currentMenu.display();
        for (int i = 0; i < currentMenu.getOptions().size(); i++){
            System.out.println("[" + (i + 1) + "] " + currentMenu.getOptions().get(i).getLabel());
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RPGConsole.engine = new RPGConsole();
        MenuFactory menuFactory = new MenuFactory();
        RPGConsole.currentMenu = menuFactory.getMenu("start");
        
        try{
            while (!RPGConsole.isGameOver){
                System.out.println(engine.error);
                System.out.println();
                engine.displayMenu();
                RPGConsole.currentMenu.choose(scanner.nextInt());
                
                for (int i = 0; i < 100; i++){
                    System.out.println("\n");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}