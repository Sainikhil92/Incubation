package Core_Java_HomeTasks.Task_4;

import java.util.*;

public class HomeTask_4_3 {
//    Strings:
//1. write a program to Print duplicate characters from String
//2. write a program to check if two strings are rotations of each other

    public static void main(String[] args) {

        String str1 = "sainikksshill";
        String org_Str = "abcdef";
        String rotate_str2 = "defabc";
        printDuplicateChar(str1);
        rotataionString(org_Str, rotate_str2);

    }

    public static void printDuplicateChar(String str) {
        Set<Character> finalSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    finalSet.add(str.charAt(i));
                    break;
                }
            }
        }
        System.out.println("duplicate characters are " + finalSet);
    }

    public static void rotataionString(String org_str, String rotat_str) {
        if (org_str.length() == rotat_str.length()) {
            for (int i = 1; i <= rotat_str.length(); i++) {
                String temp_str = rotat_str.substring(i)+rotat_str.substring(0, i) ;
                System.out.println(temp_str);
                if (rotat_str.equalsIgnoreCase(temp_str)) {
                    System.out.println("both strings are equal when rotated");
                }
            }
        } else {
            System.out.println("given strings are not rotation of each other");
        }

    }
}
