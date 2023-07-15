import units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Program {
    static ArrayList<BasicHero> united = new ArrayList<>();
    static ArrayList<BasicHero> alliance = new ArrayList<>();
    static ArrayList<BasicHero> horde = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            int character = new Random().nextInt(0, 7);
            switch (character) {
                case 0:
                    alliance.add(new Magician(getName(), 1, i));
                    horde.add(new Rogue(getName(), 10, i));
                    break;
                case 1:
                    alliance.add(new Monk(getName(), 1, i));
                    horde.add(new Magician(getName(), 10, i));
                    break;
                case 2:
                    alliance.add(new Rogue(getName(), 1, i));
                    horde.add(new Lancer(getName(), 10, i));
                    break;
                case 3:
                    alliance.add(new Lancer(getName(), 1, i));
                    horde.add(new CrossbowMan(getName(), 10, i));
                    break;
                case 4:
                    alliance.add(new Sniper(getName(), 1, i));
                    horde.add(new Monk(getName(), 10, i));
                    break;
                case 5:
                    alliance.add(new CrossbowMan(getName(), 1, i));
                    horde.add(new Sniper(getName(), 10, i));
                    break;
                default:
                    alliance.add(new Peasant(getName(), 1, i));
                    horde.add(new Peasant(getName(), 10, i));

            }
        }


        united.addAll(alliance);
        united.addAll(horde);
        united.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative());

        Scanner scan = new Scanner(System.in);
        View.view();
        while (true) {
            scan.nextLine();
            for (BasicHero item : united) {
                if (alliance.contains(item)) {
                    item.step(horde, alliance);
                } else {
                    item.step(alliance, horde);
                }
            }
            View.view();
        }
    }

    private static String getName() {
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }

}
