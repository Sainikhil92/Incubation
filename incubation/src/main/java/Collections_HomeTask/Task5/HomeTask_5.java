package Collections_HomeTask.Task5;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HomeTask_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int testCases = scanner.nextInt();

        for (int t = 0; t < testCases; t++) {
            int queries = scanner.nextInt();
            for (int i = 0; i < queries; i++) {
                char operation = scanner.next().charAt(0);
                if (operation == 'a') {
                    int key = scanner.nextInt();
                    int value = scanner.nextInt();
                    map.put(key, value);
                } else if (operation == 'b') {
                    int queryKey = scanner.nextInt();
                    if (map.containsKey(queryKey)) {
                        System.out.println(map.get(queryKey));
                    } else {
                        System.out.println("-1");
                    }
                } else if (operation == 'c') {
                    System.out.println(map.size());
                } else if (operation == 'd') {
                    int removeKey = scanner.nextInt();
                    map.remove(removeKey);
                } else if (operation == 'e') {
                    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                        System.out.println(entry.getKey());
                    }
                } else {
                    System.out.println("Invalid operation");
                }
            }
            map.clear();
        }
    }
}
