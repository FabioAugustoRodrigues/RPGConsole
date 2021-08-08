package rpgconsole.character;

public class Character {

    private String name;
    private double hp;
    
    public Character(String name, double hp){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
}
