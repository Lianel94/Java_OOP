package units;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero {
    public Infantry(int id, String name, String heroType, int healthLevel, int initiative, int baseAttack, int x, int y) {
        super(id, name, heroType, healthLevel, initiative, x, y);
        this.baseAttack = baseAttack;
    }

    int baseAttack;

    @Override
    public String getInfo() {
        return (name + ", "
                + heroType + ", "
                + "♥" + HealthLevel + ", "
                + "In: " + initiative + ", "
                + "\u2694" + baseAttack);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {

    }
}
