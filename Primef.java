//Check a number is prime or not using for loop

import java.util.*;
public class Primef {
    public static void main(String[]args){
        int t=5;
        for(int j=t;j>0;j--)
        {

        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=scan.nextInt();
        int count=0;

        for(int i=2;i<n;i++)
        {
            if(n%i==0){
                count=1;
                break;
            }
            else
               count=0;
            
        }
        if(n==1)
        System.out.println(" 1 is neither prime or not prime");
        else if(count==1)
        System.out.println("not prime");
        else
        System.out.println("prime");
    }


    }
    
}
