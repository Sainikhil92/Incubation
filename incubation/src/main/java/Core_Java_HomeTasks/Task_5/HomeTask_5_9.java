package Core_Java_HomeTasks.Task_5;

public class HomeTask_5_9 {


        public static void main(String[] args) {
            System.out.println(maxBlock("hoopla"));
            System.out.println(maxBlock("abbCCCddBBBxx"));
            System.out.println(maxBlock(""));
            System.out.println(maxBlock("XX2222BBBbbXX2222"));
            System.out.println(maxBlock("XXBBBbbxxXXXX"));
            System.out.println(maxBlock("XXBBBbbxx"));
        }

        public static int maxBlock(String str) {
            int max = 0;
            int count = 1;
            char o = ' ';

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == o) {
                    count++;
                    if (count > max) { max = count; }
                } else {
                    count = 1;
                    if (count > max) { max = count; }
                }
                o = c;
            }

            return max;
        }

    }



