package Core_Java_HomeTasks.Task_3;

import java.util.Scanner;

public class HomeTask_3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int totalRows = scanner.nextInt();

        System.out.print("Enter the starting value: ");
        int initialValue = scanner.nextInt();

        System.out.println("Using while loop:");
        printPyramidWithWhile(totalRows, initialValue);

        System.out.println("\nUsing for loop:");
        printPyramidWithFor(totalRows, initialValue);

        System.out.println("\nUsing do-while loop:");
        printPyramidWithDoWhile(totalRows, initialValue);

    }

    private static void printPyramidWithWhile(int rows, int startValue) {
        int currentRow = 0;

        while (currentRow < rows) {
            int currentColumn = 0;
            int currentValue = startValue + currentRow * (currentRow + 1) / 2;

            while (currentColumn <= currentRow) {
                System.out.print(currentValue + " ");
                currentValue++;
                currentColumn++;
            }
            System.out.println();
            currentRow++;
        }
    }

    private static void printPyramidWithFor(int rows, int startValue) {
        for (int currentRow = 0; currentRow < rows; currentRow++) {
            int currentColumn = 0;
            int currentValue = startValue + currentRow * (currentRow + 1) / 2;

            for ( currentColumn =0; currentColumn <= currentRow; currentColumn++) {
                System.out.print(currentValue + " ");
                currentValue++;
            }

            System.out.println();
        }
    }

    private static void printPyramidWithDoWhile(int rows, int startValue) {
        int currentRow = 0;

        do {
            int currentColumn = 0;
            int currentValue = startValue + currentRow * (currentRow + 1) / 2;

            do {
                System.out.print(currentValue + " ");
                currentValue++;
                currentColumn++;
            } while (currentColumn <= currentRow);

            System.out.println();
            currentRow++;
        } while (currentRow < rows);
    }
}
