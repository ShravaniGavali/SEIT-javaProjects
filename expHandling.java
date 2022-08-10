
import java.util.Scanner;

class expHandling
{
    public static void main(String[] args)
    {
        int a = 10, b = 0, c ;
        try
        {
            c = a / b;
        }
       
        catch (ArithmeticException e) 
        {
            System.out.println("Divide by Zero:"+e);
        }
        finally
        {
            System.out.println("This is the last statement before termination of program");
        }
    };
}