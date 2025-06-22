import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args)
    {
        //class GetWristband
        //main ()
        //  num age
        //  output “Enter your age: ”
        //  input age
        //  if age >= 21 then
        //     output “You get a wrist band.”
        //     end if
        //   return
        //end class

        Scanner in = new Scanner(System.in);
        int age;
        String trash;

        System.out.print("Enter your age: ");
        if (in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();

            if (age >= 21)
            {
                System.out.println("You get a wrist band.");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash + ". Please enter an integer.");
        }
    }
}