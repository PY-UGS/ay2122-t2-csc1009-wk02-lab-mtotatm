package Week2;

import java.util.Scanner;

public class Week2Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 value: ");
        float float1Value = input.nextFloat();
        float float2Value = input.nextFloat();
        float float3Value = input.nextFloat();

        double avg = (float1Value+float2Value+float3Value)/3;
        System.out.print("The average of " + float1Value + ", " + float2Value + ", " + float3Value + " is " + avg);
    }
}
