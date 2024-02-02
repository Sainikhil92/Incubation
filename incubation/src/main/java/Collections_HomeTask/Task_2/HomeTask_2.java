package Collections_HomeTask.Task_2;

import java.util.*;

import static Utilities.Utilities.log;


class Player {
    private int score;
    private String name;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return " name='" + name + " , " + " score=" + score;
    }
}

class Checker implements Comparator<Player> {


    public int compare(Player p1, Player p2) {

        if (p1.getScore() != p2.getScore()) {
            return p2.getScore() - p1.getScore();
        } else {
            return p1.getName().compareTo(p2.getName());
        }
    }
}

public class HomeTask_2 {
    public static Scanner scan;
    static List<Player> list = new ArrayList<>();

    static Checker check = new Checker();

    public static void main(String[] args) {
        System.out.println("enter number of player");
        scan = new Scanner(System.in);
        int noOfPlayers = scan.nextInt();
        for (int i = 0; i < noOfPlayers; i++) {
            System.out.println("Enter " + (i + 1) + "st player details");
            list.add(new Player(scan.next(), scan.nextInt()));
        }
        log.info(list.toString());
        list.sort(check);
        for (Player player : list) {
            System.out.println(player.toString());
        }
    }

}