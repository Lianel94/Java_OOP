public abstract class Wizard extends BasicHero {

    public Wizard(int id, String name, String heroType, int healthLevel, int initiative, int manaLevel) {
        super(id, name, heroType, healthLevel, initiative);
        this.manaLevel = manaLevel;
    }

    int manaLevel;

    @Override
    public String toString() {
        return ("ID: " + id + ", "
                + "Name: " + name + ", "
                + "Type: " + heroType + ", "
                + "Health: " + HealthLevel + ", "
                + "Initiative: " + initiative + ", "
                + "Mana: " + manaLevel);
    }

}
