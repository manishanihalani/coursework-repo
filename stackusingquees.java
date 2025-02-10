import java.util.linkedlist;
import java.util,queue;

public class stackusingquees {
    private queue <integer> queue1;
            private queue <integer> queue2;
            public stackusingquee(){
                queue 1 = new linkedlist<>();
                queue 2 = new linkedlist<>();
            }
public void push(int x){
                queue.1 offer(x);
                public int pop () {
                    if (queue is empty()){
                        throw new illegalstateexception("stack is empty");
                        while (queue1.size () > 1){
                            queue2 .offer (queue1.poll());
                            int poped element = queue1.poll();
                            queue <integer> temp = queue=1
                                    queue1 =queue2
                                            queue2 = temp
                                     returnpopelement;
                            public int peek() {
                                if (queue1 . is empty()){
                                    throw new illegalstateexception("stack is empty");
                                    while (queue 1 .size() > 1)
                                        queue2.offer(queue 1.poll());
                                    int topElement=queue 1.peek();
                                    queue<integer> temp = queue1;
                                    queue 1 = queue2;
                                    queue2 temp;
                                    return top element;
                                    public boolean is empty() {
                                        return queue 1.is empty
                                        public ststic void main (string[]args) {
                                            stackusingqueues stack = new stackusingqueues ();
                                            stack.push(1);
                                                    stack.push(2);
                                                    stack.push(3);
                                                    System.out.println("top element + stack.peek")
                                            System.out.println("pop element + stack.pop")
                                            System.out.println("top element afterpop element + stack.pop")
                                            System.out.println("is stack empty? + stack.is empty")

                                        }
                                    }



                                }
                            }



                        }
        }
    }
}
}
