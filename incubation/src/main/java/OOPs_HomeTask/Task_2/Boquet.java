package OOPs_HomeTask.Task_2;

import java.util.*;

public class Boquet {
    static Map<String, Integer> flowerMap;
    static int totalboquetCost = 0;

    public static void flowersCost(Map<String, Integer> flower) {

        for (String choice : flower.keySet()) {
            Flowers f;
            if (choice.contains("Rose")) {
                f = new Rose();
                totalboquetCost+= flower.get(choice) * (f.flower());
            }else if (choice.contains("jasmine")) {
                f = new Jasmine();
                totalboquetCost+= flower.get("jasmine") * (f.flower());
            } else if (choice.contains("lily")) {
                f = new Lily();
                totalboquetCost+= flower.get(choice) * (f.flower());
            } else {
                throw new RuntimeException("flowers not found or empty");
            }
        }


    }

    public static void main(String[] args) {
        flowerMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter total types of flowers to be added in boquet");
        int noOfFlowers = scan.nextInt();
        for (int i = 0; i < noOfFlowers; i++) {
            System.out.println("please select the flowers from below list \n 1.Rose \n 2.jasmine \n 3.lily and \n also number of flowers");
            flowerMap.put(scan.next(), scan.nextInt());
        }
        flowersCost(flowerMap);

        System.out.print("total cost of boquet is :" +totalboquetCost);
    }
}
