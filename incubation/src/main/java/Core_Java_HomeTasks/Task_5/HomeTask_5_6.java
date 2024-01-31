package Core_Java_HomeTasks.Task_5;

public class HomeTask_5_6 {
    public boolean shareDigit(int a, int b) {


        int rightDigit_a = a / 10;
        int leftdigit_a = a % 10;

        int rightDigit_b = b / 10;
        int leftdigit_b = b % 10;

        if (rightDigit_a == rightDigit_b || rightDigit_a == leftdigit_b || leftdigit_a == rightDigit_b || leftdigit_a == leftdigit_b) {
            return true;
        }


        return false;
    }

}
