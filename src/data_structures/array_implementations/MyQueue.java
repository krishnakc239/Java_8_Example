package data_structures.array_implementations;

public class MyQueue {
    int[] queue;
    int queuSize;
    int front;
    int rear;

    MyQueue(int size){
        queuSize = size;
        queue = new int[queuSize];
        front =-1;
        rear =-1;
    }

    public void  enqueu(int data){
        if (front+1 >= queuSize){
            resize();
        }
        queue[++front] = data;  // for the first element enqueue first and last index points the same data
    }

    public Integer  dequeu(){
        if (front >= rear){
            return queue[++front];
        }
        return null;
    }

    public boolean isEmpyt(){
        return front <= rear;
    }

    public void resize(){
        int[] temp = queue;
        queuSize= queuSize*2;
        queue= new int[queuSize];
        for (int i=0;i <= front; i++){
            queue[i] = temp[i];
        }
    }

    public void display(){
        for (int i=0;i<=front; i++){
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        MyQueue queue1 = new MyQueue(5);
        queue1.enqueu(1);
        queue1.enqueu(2);
        queue1.enqueu(3);
        System.out.println("data enqueued ............");
        queue1.display();
        System.out.println("data dequeued..............");
        queue1.dequeu();
        queue1.dequeu();
        queue1.display();
    }
}
