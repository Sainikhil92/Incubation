package Core_Java_HomeTasks.Task_6;

public class HomeTask_6_1 {
//    maxSpan([1, 2, 1, 1, 3]) → 4
//maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
//maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6

    public static void main(String[] args) {
       System.out.print(maxSpan(new int[]{1,2,1,1,3}));
    }

    public static int maxSpan(int[] arr) {

        int n = arr.length;

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int loIdx = 0;
        int hiIdx = 0;

//        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
//            if (arr[0] == arr[i])
//                loIdx = i;
//            if (arr[n - 1] == arr[j])
//                hiIdx = j;
//        }

//    maxSpan([1, 2, 1, 1, 3]) → 4
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if (arr[0] == arr[i])
                    loIdx = i;
                if (arr[n - 1] == arr[j])
                    hiIdx = j;
            }
        }
        return Math.max(loIdx + 1, n - hiIdx);

    }
}
