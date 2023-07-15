package units;

import java.util.ArrayList;

public abstract class BasicHero implements Actions {
    int id;
    String name;
    String heroType;
    int HealthLevel;
    protected int initiative;

    public int getInitiative(){
        return initiative;
    }

    protected Coordinates place;

    public BasicHero(int id, String name, String heroType, int healthLevel, int initiative, int x, int y) {
        this.id = id;
        this.name = name;
        this.heroType = heroType;
        this.HealthLevel = healthLevel;
        this.initiative = initiative;
        place = new Coordinates(x, y);
    }

    public Coordinates getPlace(){
        return place;
    }

    public int getHealthLevel() {
        return HealthLevel;
    }

    protected void getDamage(float damage){
        this.HealthLevel -= damage;
        if (HealthLevel < 0) HealthLevel = 0;
    }

    protected void getHealed(float heal){
        this.HealthLevel += heal;
        if (HealthLevel > 100) HealthLevel = 100;
    }

    protected BasicHero findNearEnemy(ArrayList<BasicHero> enemies) {
        double min = 10000;
        int count = 0;
        for (int i = 0; i < enemies.size(); i++) {
            if (place.calcDistance(enemies.get(i).place) < min & enemies.get(i).HealthLevel > 0) {
                min = place.calcDistance(enemies.get(i).place);
                count = i;
            }
        }
        return enemies.get(count);
    }

    @Override
    public String toString() {
        return super.getClass().getSimpleName();
    }
}
