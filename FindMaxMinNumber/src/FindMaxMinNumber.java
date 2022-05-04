import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxMinNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number will you enter ..:");
        int numberCount = scanner.nextInt();

        int[] numberArray = new int[numberCount];

        for (int i = 0; i < numberCount; i++) {
            System.out.print("Enter "+ (i + 1) + ". Number..:");
            numberArray[i] = scanner.nextInt();
        }

        System.out.println("Max Number ..:" + Arrays.stream(numberArray).max());
        System.out.println("Min Number ..:" + Arrays.stream(numberArray).min());
    }
}
