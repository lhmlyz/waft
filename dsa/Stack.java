public class Stack {

    int top;
    int size;
    int[] elements;

    public Stack(int size) {
        this.size = size;
        this.elements = new int[size];
        this.top = -1;
    }

    public static void main(String[] args) {
        var stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.pop();
        stack.pop();

        stack.getElements();
    }

    public void push(int element) {
        checkSize();
        if (elements.length == 0) {
            elements[0] = element;
            ++top;
        } else {
            elements[++top] = element;
        }
    }

    public int pop() {
        return elements[top--];
    }

    public int peek() {
        return elements[top];
    }

    public void getElements() {
        for (int i = 0; i <= top; i++) {
            System.out.println(elements[i]);
        }
    }

    public void checkSize() {
        if (top == size - 1) {
            throw new StackOverflowError();
        }
    }
}
