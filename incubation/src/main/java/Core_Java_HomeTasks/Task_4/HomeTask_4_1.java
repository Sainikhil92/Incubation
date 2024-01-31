package Core_Java_HomeTasks.Task_4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask_4_1 {
// Write a program to find the missing number in integer array of 1 to 100

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] original_arr = new int[100];
        int[] given_arr = new int[scan.nextInt()];
        for (int i = 0; i < 100; i++) {
            original_arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(original_arr));
        for (int i = 0; i < given_arr.length; i++) {
            given_arr[i] = scan.nextInt();
        }

    }

}

