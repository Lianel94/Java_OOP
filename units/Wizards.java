package units;

import java.util.ArrayList;

public abstract class Wizards extends BasicHero {

    public Wizards(int id, String name, String heroType, int healthLevel, int initiative, int manaLevel, int x, int y) {
        super(id, name, heroType, healthLevel, initiative, x, y);
        this.manaLevel = manaLevel;
    }

    int manaLevel;

    @Override
    public String getInfo() {
        return ("ID: " + id + ", "
                + "Name: " + name + ", "
                + "Type: " + heroType + ", "
                + "Health: " + HealthLevel + ", "
                + "Initiative: " + initiative + ", "
                + "Mana: " + manaLevel+ ", "
                + "X: " + place.x + ", "
                + "Y: " + place.y);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {

    }
}
