import java.util.Scanner;
public class Division
{
    public static void main(String[] args)
    {
        Float number1,number2;
        Scanner input = new Scanner(System.in);
        number1 = input.nextFloat();
        number2 = input.nextFloat();
        System.out.printf("%.0f ÷ %.0f = %s",number1,number2,number1/number2);
        input.close();
        
    }
}