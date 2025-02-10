 class Node
 int data;
Node next;
Node(int data){
    this.data = data
    this.next = null;

}

 class linkedlist {
    Node head;
    public void append (int data) {
        Node = new Node(data);
        if (head == null)
            head = newNode;
    } else {
        Node current = head;
        while (current . next = null){
            current = current.next
                    current.next = newNode;
            public boolean is circular() {
                if (head == null)

                    return false ;
                Node slow = head;
                Node fast = head;
                if slow == fast
                    return true;
                return false ;
                public void display(){
                    Node current = head;
                    while (current=null)
                        System.out.print (current data " ");
                    current = current .next;
                    System.out.println();
                    public class main{
                        public static void main(string[]args){
                            circularlinkedlist list = new circularlinkedlist();
                            list.append(1);
                            list.append(2);
                            list.append(3);
                            list.append(4);
                            list.append(5);

                            System.out.println("Original list:");
                            list.display(10); // Displays first 10 nodes or less if circular

                            // Make the list circular by connecting last node to the node at position 3
                            list.makeCircular(3);

                            System.out.println("List after making it circular:");
                            list.display(10); // Will print the first 10 nodes or show '...' if infinite loop detected
                        }


                }

            }

        }


    }
}
