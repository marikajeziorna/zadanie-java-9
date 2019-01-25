import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        int[] numberTable = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        numberTable[0] = scanner.nextInt();
        System.out.println("Enter the second number: ");
        numberTable[1] = scanner.nextInt();
        System.out.println("Enter the third number: ");
        numberTable[2] = scanner.nextInt();
        System.out.println("Enter the fourth number: ");
        numberTable[3] = scanner.nextInt();
        System.out.println("Enter the fifth number: ");
        numberTable[4] = scanner.nextInt();

        int sum = numberTable[0] + numberTable[3] + numberTable[4];

        System.out.println("It is the sum of the first, second and fifth numbers: " + sum);
    }
}
