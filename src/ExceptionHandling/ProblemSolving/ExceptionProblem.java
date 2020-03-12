
package ExceptionHandling.ProblemSolving;
import java.util.Scanner;

public class ExceptionProblem {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter num1: ");
//        int num1 = input.nextInt();
//        System.out.println("Please enter num2: ");
//        int num2 = input.nextInt();
//        /*
//        If one number will be string than Exception will be
//        java.util.InputMismatchException
//        */
//        
//        int result = num1/num2;
//        System.out.println("Result= "+result);
//        System.out.println("Result: "+num1+" / "+num2+" = "+result );


/*One way of execution.......through iteration process*/


//     while(true){  
//        try
//        {
//        
//            Scanner input = new Scanner(System.in);
//            System.out.println("Please enter num1: ");
//            int num1 = input.nextInt();
//
//            System.out.println("Please enter num2: ");
//            int num2 = input.nextInt();//If exception occures in this line
//
//            int result = num1/num2;
//
//            System.out.println("Result: "+num1+" / "+num2+" = "+result );
//        
//        }
//        catch(Exception e)//than catch block will execute ignoring aboves lines after that
//        {
//        
//            System.out.println("Exception:"+e);
//        }
//        finally
//        {
//            System.out.println("Other Lines");
//        }
//    }
    int count=1;
     do{  
        try
        {
        
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter num1: ");
            double num1 = input.nextDouble();

            System.out.print("Please enter num2: ");
            double num2 = input.nextDouble();//If exception occures in this line

            double result = num1/num2;
            System.out.printf("result: %.3f",result);
            //System.out.printf("Result: %.3f",num1," / ",num2," = ",result );
            count=2;
        }
        catch(Exception e)//than catch block will execute ignoring aboves lines after that
        {
        
            System.out.println("Exception:"+e);
        }
        finally
        {
            System.out.println();
            System.out.println("Other Lines");
        }
    }while(count==1);


    }
}
