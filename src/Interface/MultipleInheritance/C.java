
package Interface.MultipleInheritance;

//Multiple inheritance :
public class C implements A, B{
    //Here, A and B both have play() abstract method;
    //Kintu eder nam same r kono body nai, tai ambiguity problem ta hoche na..
    
   public void play(){
       System.out.println("I am from c.");
   } 
}
