import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        String trash;

        // Prompt user for age
        System.out.print("Enter your age: ");
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine(); // Clear buffer

            // Check if 21 or older
            if (age >= 21) {
                System.out.println("You get a wrist band!");
            }
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash + ". Please enter an integer.");
        }
    }
}