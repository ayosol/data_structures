public class SinglyLinkedList {
    private Node header;
    private Node tail;
    private int size;

    /*  Constructor  */
    private SinglyLinkedList(){
        header = new Node(null);
        tail = header;
    }

    /*Function to insert an element at beginning */
    public void prepend(Object data){
        Node n = new Node(data);
        if (size == 0){
            header.next = n;
            tail = n;
        }
        else{
            Node temp = header.next;
            header.next = n;
            n.next = temp;
        }
        size++;
    }


}
