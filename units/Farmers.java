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
        return (name + ", "
                + heroType + ", "
                + "♥" + HealthLevel + ", "
                + "In: " + initiative + ", "
                + "\u2694" + baseAttack);
    }

    public boolean busy = false;

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {
        if(this.HealthLevel > 0) this.busy = false;
    }
}
