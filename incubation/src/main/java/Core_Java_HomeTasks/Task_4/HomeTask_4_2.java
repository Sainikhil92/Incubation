package Core_Java_HomeTasks.Task_4;

import java.util.Arrays;

import static Utilities.Utilities.log;

public class HomeTask_4_2 {
    //    Write a program to find biggest and smallest number in a array.
    public static void main(String[] args) {
        int [] given_arr={2,4,6,1,4,5,45,67,34};
        int first_index=0,last_index=given_arr.length-1;
        Arrays.sort(given_arr);
        log.info("smallest number in the array is "+given_arr[first_index]);
        log.info(" biggest number in the array is "+given_arr[last_index]);
    }
}
