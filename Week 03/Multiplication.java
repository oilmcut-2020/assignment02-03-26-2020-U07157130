import java.util.Scanner;
public class Multiplication
{
    public static void main(String[] args)
    {
        int number1,number2;
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        number2 = input.nextInt();
        System.out.printf("%s x %s = %s",number1,number2,number1*number2);
        input.close();
        
    }
}