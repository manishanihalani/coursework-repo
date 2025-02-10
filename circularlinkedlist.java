class node
int data;
Node next;
Node(int data){
    this.data = data;
    this .next = null;


}
class circularlinkedlist {
    Node head;
    public void append (int data){
        Node newNode = new Node (data);
        if (head==null) {
            head = newNode;
        } else{
            Node current = head;
            while (current.next=null) {
                current = current . next;

            }
          current .next = newNode;
        }
        public void makecircular(int position) {
            if  (head==null || poistion < = 0) {
                return;

            }
            Node current = head;
            int count = 1;
            while (current null && count < position){
                current = current.next
                        count++;
                if (current == null)
                    System.out.println(position is out of bounds);
                return;
                Node last = head;
                while (last.next = null) {
                    last=last.next;
                    last. next = current;
                    public void display(int limit) {
                        Node current = head
                        int count = 0;
                        while (current = null && count < limit) {
                            System.out.print(current.data + " ")
                            current = current.next;
                            count++;
                        }
                        if (count >=limit) {
                            System.out.println(" ...")
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

                }
            }
        }

    }
}
