
package ExceptionHandling;


public class ExceptionDemo {
    /*for exception ->> {Class Name cann't be Exception}  */
    //The normal flow of application can be maintained;
    /*
    What is exception(abnormal condition of program/code sequence)?
    ..Exception is the abnormal condition of code sequence which disrupts the normal flow of the application.
    The exception handling in java is one of the most powerful mechanism 
    to handle the run-time errors 
    so that the normal flow of application can be maintained.
    >>Exception runtime errors.
    >>Exception handling is one of the most powerful mechanism to handle the runtime error.
    So that the normal flow of code sequence can be maintained.
    //error dhore r take handle kore..object er modhe rekhe..
    //Types of exception-> checked(compiletime ex) and Unchecked(Runtime ex)
    ..There are 5 keywords to manage or to handle the exceptions:
   `    1.try
        2.catch
        3.finally
        4.throw
        5.throws
    **Advantages of Exception Handling:
    suppose:
    
statement 1;  
statement 2;  
statement 3;  
statement 4;  
statement 5;//exception occurs so next lines will not be executed. 
statement 6;  (the rest of the code will not be executed) i.e.                  
statement 7;  statement 6 to 10 will not be executed.
statement 8;  
statement 9;  
statement 10;
    
    ->>Advantage: 
    (If we perform exception handling, 
    the rest of the statement will be executed. 
    That is why we use exception handling in Java.)
    -------->>>Java Exception hierarchy :-------->>>>>>>
    Note:->>
    ->The (java.lang.Throwable) class is the root class 
    ->of Java Exception hierarchy 
    ->which is inherited by two subclasses: 
    ->1.Exception and 2. Error. 
    There are 5 keywords to maintain Exception handling in java:
    1.try(1.small letter must be and must be follwed by either catch or finally,
    Can't use try alone)
    2.catch(ExceptionName variables)
    {
    //can't use catch block alone, must be in small letter, 
    }
    3.finally
    4.throw(Throw keyword used to throw an exception)
    5.throws(Throws keyword used to declared an exception, always used with method signature.)
    */
    public static void main(String[] args) {
       try
       {
            int a=10;
            int b= 0;
            int result = a/b;
            System.out.println("The result is: "+result);
        }
        catch(NumberFormatException e1)
        /*This yellow line is not an error;
        That is your catch block is not be specialized for spesific exceptions.
        -->>The yellow line in netbeans explains that you can specialize 
        your catch block for spesific exception.   
        */
        {
           System.out.println("Artihmetic: "+e1);
        }
        catch(NullPointerException e2)
        {
           System.out.println("Artihmetic: "+e2);
        }
        catch(ArithmeticException e3)
        {
           System.out.println("Artihmetic: "+e3);
        }
        catch(Exception e1)
        {
           System.out.println("Artihmetic: "+e1);
        }
        finally
        {
           System.out.println("How are you?");
        }
       
        
    }
}
