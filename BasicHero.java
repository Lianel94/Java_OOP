public abstract class BasicHero {
        int id;
        String name;
        String heroType;
        int HealthLevel;
        int baseAttack;
        int initiative;

        public BasicHero(int id, String name, String heroType, int healthLevel, int baseAttack, int initiative) {
                this.id = id;
                this.name = name;
                this.heroType = heroType;
                HealthLevel = healthLevel;
                this.baseAttack = baseAttack;
                this.initiative = initiative;
        }
}
