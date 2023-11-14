package ovning39;

import java.util.Scanner;

public class baklenges {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] normalArray = new int[10];
        int[] reversedArray = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number " + (i + 1) + ": ");
            normalArray[i] = scan.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            reversedArray[i] = normalArray[9 - i];
        }

        System.out.println("Normal array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(normalArray[i] + " ");
        }
        System.out.println();

        System.out.println("Reversed array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();

    }
}
