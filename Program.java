import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        BasicHero magician = new Magician(getName());
        BasicHero monk = new Monk(getName());
        BasicHero rogue = new Rogue(getName());
        BasicHero lancer = new Lancer(getName());
        BasicHero sniper = new Sniper(getName());
        BasicHero crossbowMan = new CrossbowMan(getName());
        BasicHero peasant = new Peasant(getName());

        ArrayList<BasicHero> allHeroes = new ArrayList<>();
        allHeroes.add(magician);
        allHeroes.add(monk);
        allHeroes.add(rogue);
        allHeroes.add(lancer);
        allHeroes.add(sniper);
        allHeroes.add(crossbowMan);
        allHeroes.add(peasant);

        ArrayList<BasicHero> alliance = new ArrayList<>();
        ArrayList<BasicHero> horde = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int j = new Random().nextInt(0, 7);
            switch (j) {
                case 0:
                    alliance.add(new Magician(getName()));
                    break;
                case 1:
                    alliance.add(new Monk(getName()));
                    break;
                case 2:
                    alliance.add(new Rogue(getName()));
                    break;
                case 3:
                    alliance.add(new Lancer(getName()));
                    break;
                case 4:
                    alliance.add(new Sniper(getName()));
                    break;
                case 5:
                    alliance.add(new CrossbowMan(getName()));
                    break;
                default:
                    alliance.add(new Peasant(getName()));
            }
            switch (j) {
                case 0:
                    horde.add(new Magician(getName()));
                    break;
                case 1:
                    horde.add(new Monk(getName()));
                    break;
                case 2:
                    horde.add(new Rogue(getName()));
                    break;
                case 3:
                    horde.add(new Lancer(getName()));
                    break;
                case 4:
                    horde.add(new Sniper(getName()));
                    break;
                case 5:
                    horde.add(new CrossbowMan(getName()));
                    break;
                default:
                    horde.add(new Peasant(getName()));
            }
        }

        alliance.forEach(n -> System.out.println("Alliance: " + n.getInfo()));
        horde.forEach(n -> System.out.println("Horde: " + n.getInfo()));

    }
    private static String getName(){
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }
}
