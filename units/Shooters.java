package units;

import java.util.ArrayList;

public abstract class Shooters extends BasicHero {
    public Shooters(int id, String name, String heroType, int healthLevel, int initiative, int baseAttack, int shoots, int x, int y) {
        super(id, name, heroType, healthLevel, initiative, x, y);
        this.baseAttack = baseAttack;
        this.shoots = shoots;
    }

    public int baseAttack;
    protected int shoots;

    @Override
    public String getInfo() {
        return ("ID: " + id + ", "
                + "Name: " + name + ", "
                + "Type: " + heroType + ", "
                + "Health: " + HealthLevel + ", "
                + "Initiative: " + initiative + ", "
                + "Attack: " + baseAttack+ ", "
                + "Shoots: " + shoots+ ", "
                + "X: " + place.x + ", "
                + "Y: " + place.y);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {
        if (this.HealthLevel == 0 || this.shoots == 0) return;
        if (this.shoots == 0) return;
        
        BasicHero temp = findNearEnemy(enemies);
        temp.HealthLevel = temp.HealthLevel - this.baseAttack;

        for(BasicHero item : ours){
            if (item.heroType.contains("Peasant")) return;
        }
        this.shoots--;
    }
}
