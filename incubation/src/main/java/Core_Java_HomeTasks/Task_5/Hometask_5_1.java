package Core_Java_HomeTasks.Task_5;

public class Hometask_5_1 {
    public int caughtSpeeding(int speed, boolean isBirthday) {

        if ((speed <= 60) || (isBirthday && speed <= 65)) {
            return 0;
        }
        if ((speed >= 61 && speed <= 80) || (isBirthday && speed >= 66 && speed <= 85)) {

            return 1;
        }
        if ((speed >= 81) || (isBirthday && speed >= 86)) {
            return 2;
        }
        return 0;
    }
}
