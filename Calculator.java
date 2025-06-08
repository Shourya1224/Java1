
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
         
         System.out.println("Enter the first number:");
         int a = in.nextInt();      
      
        System.out.println("Enter the second number:");
        int b = in.nextInt();
        
        
        System.out.println("Enter the operator:");
        char c =  in.next().charAt(0);
        switch (c) {
        

            case '+':
            System.out.println(a+b);
               break;
            case'-':
            System.out.println(a-b);
                break;
            case '*':
            System.out.println(a*b);
        
                default:
                

                
                 



            
        }

        




    }

        

}
    

