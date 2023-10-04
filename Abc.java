import java.util.Scanner;
public class Abc
{    
public static void main (String[] args){ 
Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        n = s.nextInt();
        int a1[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a1[i] = s.nextInt();
        }
        System.out.print("Enter the key:");
        int key=s.nextInt();   
        for(int i=0;i<a1   .length;i++){    
            if(a1[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }
        
        System.out.println(key+" is found at index: "+Abc(a1, key));    
    }    