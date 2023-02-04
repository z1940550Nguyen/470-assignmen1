import java.io.*;
import java.util.Scanner;

public class add
{
    public static void main(String[] args)
    {
        String amtStr;
        double num1 = 0.0,
                num2 = 0.0,
                tot = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        amtStr = sc.next();
        try
        {
            num1= Double.parseDouble(amtStr);
        }
        catch (NumberFormatException e)
        {
            System.out.println (" Bad numberic input; 1st num set to 100");
            num1=100;
        }
        try
        {
            num2 = Double.parseDouble(amtStr);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Bad numeric input; 2nd num is set to 50");
            num2 = 50;
        }
        tot = num1 + num2;
        sc.close();
        System.out.println("Sum is: " + tot);
    }
}
