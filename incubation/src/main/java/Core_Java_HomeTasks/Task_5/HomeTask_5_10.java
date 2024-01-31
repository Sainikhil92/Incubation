package Core_Java_HomeTasks.Task_5;

public class HomeTask_5_10 {
    public int sumNumbers(String str) {
        int sum = 0;
        int num = 0;
        String closedString = str + ".";

        for (int i = 0; i < closedString.length(); i += 1) {
            int c = (int) closedString.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            } else {
                sum += num;
                num = 0;
            }
        }
        return sum;
    }
}
