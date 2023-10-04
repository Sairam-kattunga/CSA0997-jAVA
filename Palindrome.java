import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=ab.nextInt();
        int remainder, rn=0;
        int on=num;
        while (num!=0)
        {
           remainder=num%10;
           rn=rn*10+remainder;
           num=num/10;
        }
        if (on==rn)
        
        {
           System.out.println(on + " is a palindrome"); 
        }
        else
        {
            System.out.println(on + " is not a palindrome");
        }
        
    }
}