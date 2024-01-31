package OOPs_HomeTask.Task_1;

import java.util.ArrayList;

public class Toppings {

    public static double costoftopping(String topping) {

        if(topping.equalsIgnoreCase("tomato"))
        {
            return 1.5;
        }
        if(topping.equalsIgnoreCase("corn"))
        {
            return 1;
        }
        if(topping.equalsIgnoreCase("mushrooms"))
        {
            return 2;
        }
        return 0;
    }


}
