import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        ArrayList<BasicHero> alliance = new ArrayList<>();
        ArrayList<BasicHero> horde = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int character = new Random().nextInt(0, 7);
            switch (character) {
                case 0:
                    alliance.add(new Magician(getName(), 0, new Random().nextInt(0, 50)));
                    horde.add(new Rogue(getName(), 9, new Random().nextInt(0, 50)));
                    break;
                case 1:
                    alliance.add(new Monk(getName(), 0, new Random().nextInt(0, 50)));
                    horde.add(new Magician(getName(), 9, new Random().nextInt(0, 50)));
                    break;
                case 2:
                    alliance.add(new Rogue(getName(), 0, new Random().nextInt(0, 50)));
                    horde.add(new Lancer(getName(), 9, new Random().nextInt(0, 50)));
                    break;
                case 3:
                    alliance.add(new Lancer(getName(),0, new Random().nextInt(0, 50)));
                    horde.add(new CrossbowMan(getName(), 9, new Random().nextInt(0, 50)));
                    break;
                case 4:
                    alliance.add(new Sniper(getName(),0, new Random().nextInt(0, 50)));
                    horde.add(new Monk(getName(), 9, new Random().nextInt(0, 50)));
                    break;
                case 5:
                    alliance.add(new CrossbowMan(getName(),0, new Random().nextInt(0, 50)));
                    horde.add(new Sniper(getName(), 9, new Random().nextInt(0, 50)));
                    break;
                default:
                    alliance.add(new Peasant(getName(),0, new Random().nextInt(0, 50)));
                    horde.add(new Peasant(getName(), 9, new Random().nextInt(0, 50)));

            }
        }

        alliance.forEach(n -> System.out.println("Alliance: " + n.getInfo()));
        horde.forEach(n -> System.out.println("Horde: " + n.getInfo()));

        System.out.println("The Alliance's enemies:");
        alliance.forEach(n -> n.step(horde));
        System.out.println("The Horde's enemies:");
        horde.forEach(n -> n.step(alliance));

    }
    private static String getName(){
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }

}
