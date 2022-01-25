import java.util.Scanner;

public class Week2Q4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int intValue = input.nextInt();

        int zodiacSign = intValue%12;

        switch (zodiacSign)
        {
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;

            case 3:
                System.out.println("Pig");
                break;

            case 4:
                System.out.println("Rat");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
            default:
                System.out.println("Error");
        }
    }
}
