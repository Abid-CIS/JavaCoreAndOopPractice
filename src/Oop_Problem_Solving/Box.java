
package Oop_Problem_Solving;


public class Box {
    double height;
    double width;
    double length;
    // If we declared local variables as instance variable than
    // we have to use this keyword
    Box(double height, double width, double length){
        //height=height;//compiler treated it as local as local, local=local;
        this.height=height;// here this keyword specifies that this variable is belonging to this class.
        this.width= width;
        this.length=length;
    }
    void displayVol(){
        System.out.printf("The volume of the Box is %.2f",height*width*length);
        System.out.println();
    }
}
