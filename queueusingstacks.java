 import java .util stack;
 public class queueusingstacks {
     private stack <integer>stack1;
     private stack <integer> stack2;
     public queue stacks () {
         stack1 = new stack<>();
         stack2 = new stack <>();
         public void enque(int x){
             stack 1.push (x);
             public int dequeue (){
                 if (stack 2 is empty ()){
                     while stsck 1 is empty()
                         stsck 2 .push (stack 1. pop());
                     if stack2 is empty()
                 throw new ilegalexpression("queue is empty")
                         return stack2.peek();
                     public boolean is empty() {
                         return stack1 is empty() && stack2 is empty();{
                             public void main (string[]args ){
                                 queue using stacks queue = new queue using stacks ();
                                 queue.enqueue(1);
                                 queue.enqueue(2);
                                 queue.enqueue(3);
                                 System.out.println ("front element " +queue.peek());
                                 System.out.println ("dequed element " +queue.peek());
                                 System.out.println ("is queue is empty " +queueis empty());
                                 System.out.println ("dequedelement " +queue.dequeue());
                                 System.out.println ("is queue is empty " +queueis empty());


                             }

                         }
                     }

                 }
             }
         }
     }
}
