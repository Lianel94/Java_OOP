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
    public void step(ArrayList<BasicHero> enemies) {
        int[] temp = findNearEnemy(enemies);
        System.out.println("The distance: " + temp[0] + " The enemy's name: " + enemies.get(temp[1]).name);
    }
}
