
package Exception_handling_in_java;

import java.util.NoSuchElementException;


public class Stack {
    private int[] ar;
    private int top, size, capacity;
    
    public Stack(int capacity) throws Exception{
        if(capacity < 1){
            throw new Exception("Size of Stack can't be smaller than 1");//now Exception catch korte hbe na.
        }
        this.capacity = capacity;
        ar = new int[capacity];
        //initially size is 0 and top is -1
        size = 0;
        top= -1;
    }
    public boolean isFull(){
        if(size == capacity){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmp(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    public void display(){
        //this function will print stack:
        if(isEmp()){
            throw new NoSuchElementException("Stack is empty");
        }else{
            System.out.print("Stack:\t");
            for(int i = 0; i <=top; i++){
                System.out.print(ar[i] + "\t");
            }
            System.out.println();
        }
    }
    
    public void push(int value){
        // int value bcz eta ekta value receive korbe;
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }
        size++;
        top++;
        ar[top] = value;
    }
    public void pop() throws MyException{
        if(isEmp()){
            throw new MyException();
        }
        top--;
        size--;
    }
    
    public int size(){
        
        return size;
    }
    public int peek(){
        return ar[top];
    }
}
