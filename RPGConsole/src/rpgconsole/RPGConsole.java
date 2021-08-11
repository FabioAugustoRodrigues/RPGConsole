package rpgconsole;

import java.util.Scanner;
import java.util.Stack;
import rpgconsole.character.Player;
import rpgconsole.map.MapAbstract;
import rpgconsole.menu.MenuAbstract;
import rpgconsole.menu.MenuFactory;

public class RPGConsole {

    public static Player player;
    public static MapAbstract currentMap;
    public static String error = new String();
    public static MenuAbstract currentMenu;
    public static Stack<MenuAbstract> stackMenu = new Stack();
    public static boolean isGameOver = false;
    
    public static RPGConsole engine;
    
    public static void clear(){
        for (int i = 0; i < 100; i++){
            System.out.println("\n");
        }
    }
    
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
                System.out.println(RPGConsole.error);
                RPGConsole.error = "";
                System.out.println();
                engine.displayMenu();
                System.out.print("-> ");
                RPGConsole.currentMenu.choose(scanner.nextInt());
                RPGConsole.clear();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }   
}