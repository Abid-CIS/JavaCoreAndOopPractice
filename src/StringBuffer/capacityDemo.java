
package StringBuffer;
//Modifiable String;

public class capacityDemo {
    
    public static void main(String[] args) {
    StringBuffer sb=new StringBuffer();  
    StringBuffer sb2=new StringBuffer();  
    
    System.out.println(sb.capacity());//default 16  
    System.out.println("Capacity of sb2 :"+sb2.capacity());//default 16  
    sb.append("Hello");  
    System.out.println(sb.capacity());//now 16  
    sb.append("java is my favourite language");  
    System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2 
    }
}
