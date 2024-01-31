package OOPs_HomeTask.Task_1;

import java.util.List;
import java.util.Scanner;

public class OrderPizza extends Toppings {
    public static List<String> toppings;
    static double totalToppingCost = 0;
    static String PizzabaseType;
    static PizzaBase pizzaBase;
   static OrderPizza orderpizza = new OrderPizza();
    public double totalCost() {
        return pizzaBase.baseCost() + totalToppingCost;
    }
    public static void baseCostinvoker() {

        if (PizzabaseType.equalsIgnoreCase("softbase")) {
            pizzaBase = new SoftPizzaBase();
        } else if (PizzabaseType.equalsIgnoreCase("Standard")) {
            pizzaBase = new StandardPizzaBase();
        } else {
            throw new RuntimeException("Please check the input");
        }

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter pizza base you want as \n 1.standard \n 2.soft base");
        PizzabaseType = scan.next();
        System.out.println("Enter no of toppings");
        int no_toppings = scan.nextInt();
        System.out.println("Enter type of toppings from below list \n 1.tomato \n 2.corn \n3.mushrooms");
        for (int i = 0; i < no_toppings; i++) {
            totalToppingCost = totalToppingCost + costoftopping(scan.next());
        }
        baseCostinvoker();
        System.out.print("Total cost of pizza is :"+new OrderPizza().totalCost());


    }
}
