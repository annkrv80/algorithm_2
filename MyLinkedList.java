public class MyLinkedList {


    public static void main(String[] args) {

        MyLinkedList myList=new MyLinkedList();
        myList.insert(1);
        myList.insert(8);
        myList.insert(20);
        myList.insert(15);
        myList.insert(60);
        myList.printMyLinkedList();
        myList.revert();
        System.out.println("\n"+"Разворот двусвязного списка: ");
        myList.printMyLinkedList();
        
    }

    Node head;
    Node tail; 

    class Node{
        public int data;
        public Node nextNode;
        public Node previousNode;

        public void displayNodeData() {
            System.out.print( data +  " <-> ");
        }
    }

    public void insert(int value){
        Node node = new Node();
        node.data=value;

        if(head == null){
            head=node;
            tail=node; 
        }else{
            tail.nextNode=node;
            node.previousNode=tail;
            tail=node;
        }

    }

    public void printMyLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.nextNode;

        }     
    }

    public void revert(){
        Node current=head;
        while(current!=null){
            Node next = current.nextNode;
            Node previouse= current.previousNode;
            current.nextNode=previouse;
            current.previousNode=next;
            if (previouse==null){
                tail=current;
            }
            if(next==null){
               head=current; 
            }
            current=next;

        }

    
    }
}