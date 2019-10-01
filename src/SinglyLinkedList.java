public class SinglyLinkedList {
    private Node header;
    private Node tail;
    private Node currentNode;
    private int size;

    /*  Constructor  */
    public SinglyLinkedList(){
        header = new Node(null);
        tail = header;
    }

    /*Function to insert an element at beginning */
    public void prepend(Object data){
       currentNode = new Node(data);
        if (size == 0){
            header.next = currentNode;
            tail = currentNode;
        }
        else{
            Node temp = header.next;
            header.next = currentNode;
            currentNode.next = temp;
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
            header.next = currentNode .next;
            size--;
            //Garbage collector deletes the removed node object
        }
    }

    //Function to remove the Last node
    public void removeLast(){
        if (size >= 1){
            currentNode = header.next;
            int count = 1;
            while (count != (size-1)){
                currentNode = currentNode.next;
                count++;
            }
            tail = currentNode;
            tail.next = null;
            size--;
        }
    }


    //Function to insert at a certain index in the list
    public void insertAt(int index, Object data){
        if (index <= 0 || index > size){
            return;
        }
        else if (index == 1){
            prepend(data);
        }
        else if (index == size){
            append(data);
        }
        else{
            Node newNode = new Node(data);
            currentNode = header.next;
            int count = 1;
            while (count != (index -1)){
                currentNode = currentNode.next;
                count++;
            }
            Node temp = currentNode.next;
            currentNode.next = newNode;
            newNode.next = temp;
            size++;
        }
    }

    //Function to removeAt a certain index in the list
    public void removeAt(int index) {
        if (index <= 0 || index > size) {
            return;
        } else if (index == 1) {
            removeFirst();
        } else if (index == size) {
            removeLast();
        } else {
            currentNode = header.next;
            int count = 1;
            while (count != index - 1) {
                currentNode = currentNode.next;
                count++;
            }
            currentNode.next = currentNode.next.next;
            size--;
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
