package Week2;

import java.util.Scanner;

public class Week2Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius value: ");
        float floatValue = input.nextFloat();

        double area = floatValue * floatValue * 3.14159;
        System.out.println("The area for the circle of radius: " + floatValue + " is " + area);
    }
}
