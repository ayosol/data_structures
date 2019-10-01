public class SinglyLinkedList {
    private Node header;
    private Node tail;
    private int size;

    /*  Constructor  */
    public SinglyLinkedList(){
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

    /*Function to insert an element at the end*/
    public void append(Object data){
        Node n = new Node(data);
        if (size == 0){
            header.next = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
        size++;
    }

    //Function to remove the first node
    public void removeFirst(){
        if (size != 0){
            header.next = header.next.next;
            size--;
            //Garbage collector deletes the removed node object
        }
    }

    //Function to get the size of List
    public int getSize(){
        return size;
    }

    //Function to get the string of the objects data for print.
    public String toString(){
        Node n = header.next;
        StringBuilder string = new StringBuilder();
        while (n != null){
            string.append(n.data).append(" ");
            n = n.next;
        }
        return string.toString();
    }


}
