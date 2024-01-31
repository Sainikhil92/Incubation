package Core_Java_HomeTasks.Task_5;

public class HomeTask_5_3 {
    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= 5 && candy >= 5) {
            if (tea >= 2 * candy || candy >= 2 * tea) {
                return 2;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
