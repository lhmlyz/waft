import java.util.Deque;
import java.util.ArrayDeque;

// https://leetcode.com/problems/implement-queue-using-stacks/
public class LeetCode232 {

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public LeetCode232() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }

    void main() {
        LeetCode232 myQueue = new LeetCode232();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue.peek(); // return 1
        myQueue.pop(); // return 1, queue is [2]
        myQueue.empty(); // return false

    }


    public void push(int x) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        } 

        stack1.push(x);

        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    
    public int pop() {
       if (stack1.isEmpty()) {
            return -1;
       }
       return stack1.pop();
    }
    
    public int peek() {
        return stack1.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}