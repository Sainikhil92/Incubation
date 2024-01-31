package Core_Java_HomeTasks.Task_5;

public class HomeTask_5_9 {

//    public static int maxBlock(String str) {
//        int maxcount = 0;
//        int currentcount = 1;
//        for (int i = 1; i < str.length(); i++) {
//            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(i - 1))) {
//                currentcount++;
//            } else {
//                maxcount = Math.max(maxcount, currentcount);
//                currentcount = 1;
//            }
//        }
//
//        return Math.max(maxcount, currentcount);
//    }

        public static void main(String[] args) {
//            System.out.println(maxBlock("hoopla"));               // Output: 2
//            System.out.println(maxBlock("abbCCCddBBBxx"));        // Output: 3
            System.out.println(maxBlock(""));                     // Output: 0
            System.out.println(maxBlock("XX2222BBBbbXX2222"));   // Output: 4
            System.out.println(maxBlock("XXBBBbbxxXXXX"));       // Output: 4
            System.out.println(maxBlock("XXBBBbbxx"));           // Output: 3
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



