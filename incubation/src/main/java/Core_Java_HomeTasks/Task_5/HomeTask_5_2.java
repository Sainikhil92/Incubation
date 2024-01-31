package Core_Java_HomeTasks.Task_5;

public class HomeTask_5_2 {
//    The number 6 is a truly great number.
//    Given two int values, a and b, return true if either one is 6. Or if their sum or difference is  6.
//    Note: the function Math.abs(num) computes the absolute value of a number.


    public static void main(String[] args) {
        int a = -6, b = 6;
        System.out.println(trulyGrtnumber(a, b));

    }

    public static boolean trulyGrtnumber(int a, int b) {
        if (Math.abs(a) == 6 || Math.abs(b) == 6 || Math.abs((a + b)) == 6 || Math.abs((a - b)) == 6) {
            return true;

        }
        return false;
    }

}
