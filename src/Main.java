
public class Main {
    public static void main(String[] args){
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.prepend(1);
        myList.prepend(2);
        myList.prepend(3);
        myList.prepend(4);
        myList.prepend(5);
        System.out.println(myList);
        System.out.println(myList.getSize());

        myList.append('7');
        myList.append("solomon");
        myList.append(9);
        myList.append("John");
        myList.append("Praise");
        myList.append(34);
        System.out.println(myList);
        System.out.println(myList.getSize());

        myList.removeFirst();
        System.out.println(myList);

        myList.removeLast();
        myList.removeLast();
        System.out.println(myList);

        myList.insertAt(4, "test");
        System.out.println(myList);

        myList.removeAt(6);
        System.out.println(myList);

    }
}
