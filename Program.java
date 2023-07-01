public class Program {
    public static void main(String[] args) {
        BasicHero magician = new Magician("Kael");
        BasicHero monk = new Monk("Khan");
        BasicHero rogue = new Rogue("Velonara");
        BasicHero lancer = new Lancer("Vengo");
        BasicHero sniper = new Sniper("Eagle");
        BasicHero crossbowMan = new CrossbowMan("Falcon");
        BasicHero peasant = new Peasant("Morty");

        System.out.println(magician);
        System.out.println(monk);
        System.out.println(rogue);
        System.out.println(lancer);
        System.out.println(sniper);
        System.out.println(crossbowMan);
        System.out.println(peasant);
    }
}
