
package StringBuffer1;


public class Demo1 {
    
    public static void main(String[] args) {
        String s1 = "Apurba";
        StringBuffer sb = new StringBuffer(s1);
        sb.append(" Debnath");
        sb.append(430);
        sb.append('A');
        sb.append('P');
        sb.append('u');
        System.out.println("sb is: " + sb);
        String s2 = sb.reverse().toString();
        System.out.println("After reverse: "+sb);
        System.out.println("Now sb is: " + sb);// so string Buffer is immutable
        s2 = sb.reverse().toString();
        System.out.println("sb: "+ sb);
        s2 = sb.delete(0,3).toString();
        System.out.println("s2: " +sb);
        
        
    }
}
