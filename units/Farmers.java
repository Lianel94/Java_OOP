package units;

import java.util.ArrayList;

public abstract class Farmers extends BasicHero {
    public Farmers(int id, String name, String heroType, int healthLevel, int initiative, int baseAttack, int x, int y) {
        super(id, name, heroType, healthLevel, initiative, x, y);
        this.baseAttack = baseAttack;
    }

    int baseAttack;

    @Override
    public String getInfo() {
        return ("ID: " + id + ", "
                + "Name: " + name + ", "
                + "Type: " + heroType + ", "
                + "Health: " + HealthLevel + ", "
                + "Initiative: " + initiative + ", "
                + "Attack: " + baseAttack + ", "
                + "X: " + place.x + ", "
                + "Y: " + place.y);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {

    }
}
