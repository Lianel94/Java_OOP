public abstract class Wizard extends BasicHero {

    public Wizard(int id, String name, String heroType, int healthLevel, int baseAttack, int initiative, int heal) {
        super(id, name, heroType, healthLevel, baseAttack, initiative);
        this.heal = heal;
    }
    int heal;
}
