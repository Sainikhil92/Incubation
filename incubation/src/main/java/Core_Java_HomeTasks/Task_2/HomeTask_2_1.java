package Core_Java_HomeTasks.Task_2;

import java.util.Scanner;

public class HomeTask_2_1 {
    //    Create code which displays in console “Hello, NAME”, where NAME is taken from Command line (1 mark)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, " + name);

    }
}
