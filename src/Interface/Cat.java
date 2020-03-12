
package Interface;


public class Cat implements Dog {
    
    @Override
    public void g(){
        //Eche moto use koro ebar;
        System.out.println("Method is g");
    }
    @Override
    public void play(){
        System.out.println("Method is play");
    }
    @Override
    public void talk(){
        System.out.println("Method is talk");
    }
    @Override
    public void call(){
        System.out.println("Method is call");
    }
    @Override
    public void display(){
        System.out.println("Method is display");
    }
    
}
