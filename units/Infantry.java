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
        if (HealthLevel == 0) return;
        BasicHero nearestEnemy = findNearEnemy(enemies);

        if (this.place.calcDistance(nearestEnemy.place) < 2) {
            nearestEnemy.getDamage(this.baseAttack);
            return;
        }

        Coordinates temp = new Coordinates(place.x, place.y);
        if (Math.abs(this.place.x - nearestEnemy.place.x) > Math.abs(this.place.y - nearestEnemy.place.y)) {
            if (this.place.x <= nearestEnemy.place.x) {
                temp.x += 1;
            } else {
                temp.x -= 1;
            }
        } else {
            if (this.place.y <= nearestEnemy.place.y) {
                temp.y += 1;
            } else {
                temp.y -= 1;
            }
        }

        boolean flag = false;
        for (BasicHero item : ours){
            if(item.place.x == temp.x & item.place.y == temp.y & item.HealthLevel > 0) flag = true;
        }
        if(flag) return;
        this.place.x = temp.x;
        this.place.y = temp.y;
    }
}
