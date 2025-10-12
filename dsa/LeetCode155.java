import java.util.Stack;

// https://leetcode.com/problems/min-stack/
public class LeetCode155 {
    int top;
    int[] elements;
    Stack<Integer> stack;

    public LeetCode155() {
        this.top = -1;
        this.elements = new int[100];
        this.stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (top < 0 || val <= elements[top]) {
            elements[++top] = val;
        }
    }

    public void pop() {
        var e = stack.pop();
        if (e == elements[top]) {
            top--;
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if (top >= 0) {
            return elements[top];
        }
        throw new StackOverflowError();
    }
}
