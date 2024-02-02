package Collections_HomeTask.Task_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import static Utilities.Utilities.log;

public class HomeTask_3 {
    static Scanner scan = new Scanner(System.in);
    /*
    *
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

    * */
    static HashMap<String, Integer> map = new HashMap<>();
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("enter the no of dat to be entered");
        int noOfdata = scan.nextInt();
        for (int i = 0; i < noOfdata; i++) {
            log.info("enter the name and number");
            map.put(scan.next(), scan.nextInt());
        }
        int retirivalData = scan.nextInt();
        for (int i = 0; i < retirivalData; i++) {
            list.add(scan.next());
        }
        for (String s : list) {
            boolean found = false;
            for (String result : map.keySet()) {
                if (result.equals(s)) {
                    System.out.println(result + " = " + map.get(result));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(" Not Found");
            }
        }
    }
}

