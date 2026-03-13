import java.util.Scanner;

public class MaddnessWithMethods {
    public static void main(String[] args) {
        // Getting two integers using our method
        int firstNum = getAnIntFromTheUser();
        int secondNum = getAnIntFromTheUser();

        // Using the comparison method
        compareTwoInts(firstNum, secondNum);

        // Using the sum method
        int result = sumTwoInts(firstNum, secondNum);
        System.out.println("The sum of " + firstNum + " and " + secondNum + " is: " + result);
    }

    // Function 1: Get an integer from the user
    public static int getAnIntFromTheUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        return scanner.nextInt();
    }

    // Function 2: Compare two integers
    public static void compareTwoInts(int a, int b) {
        if (a > b) {
            System.out.println(a + " is larger than " + b);
        } else if (b > a) {
            System.out.println(b + " is larger than " + a);
        } else {
            System.out.println("The numbers are equal.");
        }
    }

    // Function 3: Sum two integers
    public static int sumTwoInts(int a, int b) {
        return a + b;
    }
}