import java.util.Scanner;

public class ReversedStrings{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = input.nextLine();

        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed: " + reversed);

        input.close();

    }
}






