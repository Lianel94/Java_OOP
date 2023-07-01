public abstract class Shooters extends BasicHero {
    public Shooters(int id, String name, String heroType, int healthLevel, int initiative, int baseAttack) {
        super(id, name, heroType, healthLevel, initiative);
        this.baseAttack = baseAttack;
    }

    int baseAttack;

    @Override
    public String getInfo() {
        return ("ID: " + id + ", "
                + "Name: " + name + ", "
                + "Type: " + heroType + ", "
                + "Health: " + HealthLevel + ", "
                + "Initiative: " + initiative + ", "
                + "Attack: " + baseAttack);
    }
    @Override
    public void step() {}
}
