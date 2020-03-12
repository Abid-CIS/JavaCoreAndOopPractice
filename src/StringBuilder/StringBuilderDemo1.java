
package StringBuilder;

public class StringBuilderDemo1 {
    //StringBuilder is same as StringBuffer class except it is non syncronized.
    //Every String buffer method can also used for string builder also.
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append(" Debnath ");
        str.append(23);
        str.append(" Apurba");
        System.out.println("The StringBuilder value is: "+str);
        str.replace(0, 3, "java");
        System.out.println("After replace "+ str);
        str.reverse();
        System.out.println("After reverse:"+str);
        str.delete(2,3);
        System.out.println("After delete: "+str);
    }
}
