package units;

import java.util.ArrayList;

public abstract class Wizards extends BasicHero {

    public Wizards(int id, String name, String heroType, int healthLevel, int initiative, int manaLevel, int heal, int x, int y) {
        super(id, name, heroType, healthLevel, initiative, x, y);
        this.manaLevel = manaLevel;
        this.heal = heal;
    }

    int manaLevel;
    int heal;

    @Override
    public String getInfo() {
        return (name + ", "
                + heroType + ", "
                + "♥" + HealthLevel + ", "
                + "In: " + initiative + ", "
                + "Mana: " + manaLevel + ", "
                + "\u1F64F" + heal);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {
        if (this.HealthLevel > 0) {
            for (BasicHero item : ours) {
                if (item.HealthLevel < 100) {
                    item.HealthLevel += this.heal;
//                    System.out.println("Healed: " + item.name);
                    return;
                }
            }

            BasicHero nearestEnemy = findNearEnemy(enemies);
            nearestEnemy.HealthLevel -= this.heal;
//            System.out.println("Attacked: " + nearestEnemy.name);
        }
    }
}
