import java.util.Scanner;

public class Recursion {
    public static void main(String args[])
    {
        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        // Write the logic here

        sum = recursiveSeries(num);
        System.out.println(sum);*/

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        // Implement the logic to reverse the string using recursion
        String result = reverseString(s1);
        System.out.println(result);
    }

    public static int recursiveSeries(int level){

        if(level == 1){
            return 11;
        }
        else{
            return (level*11)+recursiveSeries(level -1);
        }
    }

    public static String reverseString(String input){
        String result;
        if(input.length()==1){
            return input;
        }
        else{
            result = reverseString(input.substring(1))+input.charAt(0);
            return result;
        }
    }
}
