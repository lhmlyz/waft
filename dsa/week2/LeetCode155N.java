class LeetCode155N {
    private class Node {
        int val;
        int minSoFar;
        Node previousTop;

        Node(int v, int minSoFar, Node previousTop) {
            this.val = v;
            this.minSoFar = minSoFar;
            this.previousTop = previousTop;
        }
    }

    private Node head; // top of the stack

    public LeetCode155N() {
        head = null;
    }

    public void push(int x) {
        if (head == null) {
            head = new Node(x, x, null);
        } else {
            int newMin = Math.min(x, head.minSoFar);
            var nextNode = new Node(x, newMin, head);
            head = nextNode;
        }
    }

    public void pop() {
        if (head != null) {
            head = head.previousTop;
        }
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.minSoFar;
    }
}