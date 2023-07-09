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

    @Override
    public String getInfo() {
        return ("ID: " + id + ", "
                + "Name: " + name + ", "
                + "Type: " + heroType + ", "
                + "Health: " + HealthLevel + ", "
                + "Initiative: " + initiative);
    }

    protected BasicHero findNearEnemy(ArrayList<BasicHero> enemies) {
        double min = 10000;
        int count = 0;
        for (int i = 0; i < enemies.size(); i++) {
            if (place.calcDistance(enemies.get(i).place) < min) {
                min = place.calcDistance(enemies.get(i).place);
                count = i;
            }
        }
        return enemies.get(count);
    }
}
