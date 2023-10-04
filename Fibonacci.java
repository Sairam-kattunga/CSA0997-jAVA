import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c,i;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = reader.nextInt();
        System.out.println("Fibonacci series:");
	System.out.println(a);
	System.out.println(b);
        for (i=3;i<=n;++i)
        {
            c=a+b;
            a=b;
            b=c;
         System.out.println(c);
        }
    }
}