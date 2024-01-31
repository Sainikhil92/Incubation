package Core_Java_HomeTasks.Task_5;

public class HomeTask_5_5 {
    public boolean inOrder(int a, int b, int c, boolean bOk) {

        if (bOk && (c > b)) {
            return true;
        } else {
            if (b > a && c > b) {
                return true;
            }
        }
        return false;
    }

}
