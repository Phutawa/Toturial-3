package Test;

class Stack {
    private int[] stackArray; 
    private int top; 
    private int capacity;


    public Stack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1; 
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            stackArray[++top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack overflow.");
            return -1; 
        } else {
            return stackArray[top--];
        }
    }

    public void peek() {
         System.out.println(stackArray[top]); ;

    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
            return top + 1;
        }

    public String PrintStack(){
            String result = "";
            for(int i =  0; i < size(); i++){
                result = result + " " + stackArray[i];
            }  
            return "[" + result + "]" ;
    }
}


    