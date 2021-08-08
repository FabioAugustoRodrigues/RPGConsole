package rpgconsole.menu.option;

public abstract class OptionAbstract {
    
    protected String label;
    protected String name;
    public abstract void execute();

    public String getLabel() {
        return label;
    }

    public String getName() {
        return name;
    }
    
}
