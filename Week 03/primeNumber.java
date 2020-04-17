public class primeNumber
{
    public static void main(String[] args)
    {
        for (int i = 2 ;i<100;i++)
        {
            boolean n =  true;
            for (int j = 2 ; j<i;j++)
            {
                if (i%j == 0)
                {
                   n= false;
                    break;
                }
            }
            if (n)
            {
                System.out.print(i+"  ");
            }
        }
    }
}