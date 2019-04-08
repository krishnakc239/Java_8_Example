package data_structures.array_implementations;

public class MyLinkedList {

    Node head; //head of th elist
    int size;

    public MyLinkedList(){
        size=0;
    }


    public void add(Integer data){
        Node newNode = new Node(data);
        Node current = head;

        if (head ==null){
            head = newNode;
        }else {
            //loop to the last node
            while (current.getNext() !=null){
                current = current.getNext();
            }
            //then add new node at last
            current.setNext(newNode);
            ++size;
        }

    }

    public void  addAt(Integer data, Integer position){
        Node newNode = new Node(data);
        Node current = head;

        int counter =0;
        while (current.getNext() != null){
             if (counter ==position-1){
                 newNode.setNext(current.getNext()); // connect added node to nex node which is at current.getNext()
                 current.setNext(newNode); //connect previous node to added new node
                 ++size;
                return;
             }

             current = current.getNext();//update the current node
             counter++;
        }

    }

    public void remove(Integer data){
        Node current = head;
        while (current.getNext() != null){
            if (current.getNext().getData() == data){
                Node nodeToRemove = current.getNext();
                current.setNext(current.getNext().getNext());
                nodeToRemove.setNext(null);
                nodeToRemove = null;
                --size;
                return;
            }
            current = current.getNext();//update the current node
        }
    }
    public void displayData(){
        Node current = head;

        while (current != null){
            System.out.println("data===="+ current.getData());
            current = current.getNext();


        }
    }
    //LinkedList node
    static class Node {

        //reference to next node
        private Node next;
        private Integer data;

        Node(Integer data){
            this.data = data;
            next = null;
        }
        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {
        MyLinkedList mlist = new MyLinkedList();
        mlist.add(0);
        mlist.add(1);
        mlist.add(2);
        mlist.addAt(3,1);
        mlist.remove(2);
        mlist.displayData();
    }
}
