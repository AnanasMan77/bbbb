package ovning39;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] arrayNum = new double[10];
        double[] reversed = new double[10];
        double biggerThanTwo = 0;
        System.out.println("Please enter 10 numbers: ");
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Double.parseDouble(scan.nextLine());
            if (arrayNum[i] > 2) {
                biggerThanTwo++;
            }
        }
        for (int i = 0; i < 10; i++){
            reversed[i] = arrayNum[9 - i];
        }

        System.out.println("Here are your 10 numbers: " + Arrays.toString(arrayNum));
        System.out.println("There are " + biggerThanTwo + " numbers bigger than 2");
        System.out.println("All numbers in reversed order: " + Arrays.toString(reversed));

    }
}
