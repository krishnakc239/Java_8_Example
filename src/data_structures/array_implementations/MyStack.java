package data_structures.array_implementations;

public class MyStack {
    int[] stack;
    int top;

    MyStack(){
        stack = new int[10];
        top = -1;
    }
    public void push(int data){
        stack[++top] = data;
    }

    public void pop(){
        if (top == -1){
            System.out.println("empty stack !!");
        }else {
            top--;
        }
    }

    public void display(){
        for (int i=0;i<=top;i++){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stacked pushed and data are..........");
        stack.display();
        stack.pop();
        System.out.println("stacked popped and data are..........");
        stack.display();
    }
}
