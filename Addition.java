import java.util.*;
class Add{
      int a,b,sum;
      Scanner sc=new Scanner(System.in);
      void put_data(){
           System.out.print("Enter your first number: ");
           a=sc.nextInt();
           System.out.print("Enter your second number: ");
           b=sc.nextInt();
           sum=a+b;
      }
      void get_data(){
           System.out.println("The sum of the num is= "+sum);
      }
}
class Addition{
      public static void main(String[] args){
            Add b1=new Add();
            b1.put_data();
            b1.get_data();
      }
}