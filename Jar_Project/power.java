package functions;
import java.util.Scanner;

public class power
{
     public static void main(String[] args)
     {
            //This is the given input number n
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the digit");
            int n = scan.nextInt();
            int i = 0;
            int power = 1;
            if(n<31)
            System.out.println("Powers of 2 that are less than 2^"+n);
            while (i <= n)
            {
                System.out.println("2^"+i+" = " + power);
                power = power * 2;
                i++;
            }
        }
}

