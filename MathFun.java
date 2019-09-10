import java.util.Scanner;
import java.lang.Math;

public class MathFun
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // write the logic to find the square root of the given number

        double result = Math.sqrt((double)num);
        result *= 100;
        num = (int)result;
        result = num / 100.0;
        System.out.println(result);

    }
}