package OOPs_HomeTask.Task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChocolateBox {
    static Scanner scan;
    static int noofChocolates;
    static int nofSweets;
    static int totalWeightOfBox = 0;
    static List<Chocolates> chocolates_List = new ArrayList<>();
    static List<Sweets> sweets_list = new ArrayList<>();
    static List<String> totalBoxofSweets = new ArrayList<>();

    public static void chocolateBuilder() {

        for (int i = 0; i < noofChocolates; i++) {
            String chocolate = scan.next();
            if (chocolate.equalsIgnoreCase("dairymilk")) {
                chocolates_List.add(new Chocolates().setName("Dairymilk").setWeight(50));
            } else if (chocolate.equalsIgnoreCase("Kitkat")) {
                chocolates_List.add(new Chocolates().setName("kitkat").setWeight(80));
            }
        }
    }

    public static void sweetsBuilder() {
        sweets_list.add(new Sweets().setName("gulabjamun").setWeight(50));
        sweets_list.add(new Sweets().setName("laddu").setWeight(60));
        sweets_list.add(new Sweets().setName("doublekameeta").setWeight(70));
        sweets_list.add(new Sweets().setName("mysorepak").setWeight(80));
    }

    private static void getrangeOfSweets(int min_range, int max_Range) {
        int count=nofSweets;
        for (Sweets sweet : sweets_list) {
            if (sweet.getWeight() >= min_range && sweet.getWeight() <= max_Range&& count>0) {
                totalBoxofSweets.add(sweet.getName());
                totalWeightOfBox += sweet.getWeight();
                count--;
            }
        }
    }

    private static void getRangeSweets(int range) {
        if (range == 1) {
            getrangeOfSweets(50, 60);

        } else if (range == 2) {
            getrangeOfSweets(60, 80);
        }
    }

    private static void addChocolateweightToBox() {
        for (Chocolates chocolates : chocolates_List) {
            totalBoxofSweets.add(chocolates.getName());
            totalWeightOfBox += chocolates.getWeight();
        }
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println("please enter no of chocolates in box");
        noofChocolates = scan.nextInt();
        System.out.println("please enter no of Sweets in box");
        nofSweets = scan.nextInt();
        System.out.println("please enter the preferred chocolates from below list \n 1.dairy milk \n2.kitkat");
        chocolateBuilder();
        sweetsBuilder();
        System.out.println("Enter the range of sweets to be added in box \n 1.50 to 60 \n 2.60 to 80");
        addChocolateweightToBox();
        getRangeSweets(scan.nextInt());
        System.out.println("total sweets and chocolates in box :");
        for(String totalbox:totalBoxofSweets){System.out.println("- "+totalbox);}
        System.out.println("total weightage of box is : " + totalWeightOfBox);
    }
}
