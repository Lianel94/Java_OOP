public abstract class BasicHero {
    int id;
    String name;
    String heroType;
    int HealthLevel;
    int initiative;

    public BasicHero(int id, String name, String heroType, int healthLevel, int initiative) {
        this.id = id;
        this.name = name;
        this.heroType = heroType;
        this.HealthLevel = healthLevel;
        this.initiative = initiative;
    }

    @Override
    public String toString() {
        return ("ID: " + id + ", "
                + "Name: " + name + ", "
                + "Type: " + heroType + ", "
                + "Health: " + HealthLevel + ", "
                + "Initiative: " + initiative);
    }

}
