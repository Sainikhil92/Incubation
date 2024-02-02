package Collections_HomeTask.Task_1;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

import static Utilities.Utilities.log;

public class HomeTask_1 {

    static List<ArrayList<Integer>> lists = new ArrayList<>();
    static Scanner scan;
    static int lenOfArr;

    public static void AddListData() {
        log.info(" enter all arrays for length :" + lenOfArr);
        for (int i = 0; i < lenOfArr; i++) {
            System.out.println("enter th length of " + (i + 1) + "st index array ");
            int IndexLength = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("enter the values in array of length : ");
            for (int j = 0; j < IndexLength; j++) {
                list.add(scan.nextInt());
            }
            lists.add(list);
        }
    }

    public static void positionFetch() {
        int inputLen = scan.nextInt();
        for (int i = 0; i < inputLen; i++) {
            System.out.println("enter the value of line to search");
            int x = scan.nextInt();
            System.out.println("enter the value of postion");
            int y = scan.nextInt();
            log.info("Executing " + (i + 1) + "query ");
            if (x <= lists.size() && y <= lists.get(x - 1).size()) {
                log.info("value of ( " + x + " , " + y + " ) is " + lists.get(x - 1).get(y - 1));
            } else {
                log.error("ERROR");
            }
        }
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        log.info("enter length of the array");
        lenOfArr = scan.nextInt();
        AddListData();
        log.info(lists);
        System.out.println("enter the length of inputs");
        positionFetch();
    }
}
