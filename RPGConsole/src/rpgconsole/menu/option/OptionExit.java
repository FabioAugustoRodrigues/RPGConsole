package rpgconsole.menu.option;

public class OptionExit extends OptionAbstract {

    public OptionExit(){
        this.name = "exit";
        this.label = "Exit game";
    }
    
    @Override
    public void execute() {
        System.out.println("Bye.");
        System.exit(1);
    }
    
}
