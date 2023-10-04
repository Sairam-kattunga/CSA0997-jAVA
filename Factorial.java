import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = reader.nextInt();
       int c=1,i;
       for (i=1;i<=n;i++)
       {
         c=c*i;
       }
       System.out.println(c);
        }
    }
