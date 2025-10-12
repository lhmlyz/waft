class LeetCode1381 {

    int maxSize;
    int top;
    int[] elements;

    // https://leetcode.com/problems/design-a-stack-with-increment-operation/description/
    public LeetCode1381(int maxSize) {
        this.maxSize = maxSize;
        this.elements = new int[this.maxSize];
        this.top = -1;
    }

    public void push(int x) {
        if (top >= maxSize - 1) {
            return;
        }
        elements[++top] = x;
    }

    public int pop() {
        if (top >= 0) {
            return elements[top--];
        }
        return -1;
    }

    public void increment(int k, int val) {
        int loopCount = Math.min(k, top+1);
        for (int i = 0; i < loopCount; i++) {
            elements[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */