package Test;
/*  Phutawan Mueangma    
    672115037
    Program for to SE tutorial 3
*/  
public class Stack{

    public  static StudentClass[] stackArray;
    private static int top;
    private static int capacity; 
        
    public Stack(int capacity) {
        this.capacity = capacity;
        stackArray = new StudentClass[capacity];
        top = -1;
    }
        
    public void push(StudentClass element) {
        if (isFull()) {
        System.out.println("Stack overflow");
    } else {
        stackArray[++top] = element;
        System.out.println("Element " + element + " is pushed into the queue");
    }
    }

    public StudentClass pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        } else {
            return stackArray[top--];
        }

    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity;
    }

    public StudentClass peek() {
        return stackArray[top];
    }

    public int max() {
        return top + 1;
    }

    public static int capacity() {
        return capacity;
    }

}