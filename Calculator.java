import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter The first number: ");
        int num1=ab.nextInt();
        System.out.println("Enter The second number: ");
        int num2=ab.nextInt();
        System.out.println("Enter the Operation to be done:");
        System.out.println("1)Addition\n2)Subtraction\n3)Multiplication\n4)Division\n");
        int num3=ab.nextInt();
        int a=num1+num2;
        int b=num1-num2;
        int c=num1*num2;
        float d=num1/num2;
        if(num3==1)
        {
            System.out.println("Addition of "+num1+" and "+num2 +" is "+a);
        }
        else if (num3==2)
    {
        System.out.println("Subtraction of "+num1+" and "+num2 +" is "+b);
    }
    else if (num3==3)
    {
        System.out.println("Multiplication of "+num1+" and "+num2 +" is "+c);
    }
    else 
    {
        System.out.println("Division  of "+num1+" and "+num2 +" is "+d);
    }
}
}