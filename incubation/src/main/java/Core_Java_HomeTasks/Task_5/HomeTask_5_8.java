package Core_Java_HomeTasks.Task_5;

public class HomeTask_5_8 {
    public String withoutString(String base, String remove) {
        if (base == null || remove == null || remove.isEmpty()) {
            return base;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < base.length(); i++) {
            int j = i + remove.length();

            if (j <= base.length() && base.substring(i, j).equalsIgnoreCase(remove)) {
                i = j - 1;
            } else {
                result.append(base.charAt(i));
            }
        }

        return result.toString();
    }

}
