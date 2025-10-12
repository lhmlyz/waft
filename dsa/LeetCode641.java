class LeerCode641 {
    int front;
    int rear;
    int maxSize;
    int size;
    int[] elements;

    public LeerCode641(int k) {
        this.maxSize = k;
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.elements = new int[maxSize];
    }

    public boolean insertFront(int value) {
        if (isFull())
            return false;

        front = (front - 1 + maxSize) % maxSize; // 0 - 1 + 3 = 2 % 3 = 2
        elements[front] = value;
        if (size == 0) {
            rear = front;
        }
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull())
            return false;

        rear = (rear + 1) % maxSize; // 0 - 1 + 3 = 2 % 3 = 2
        elements[rear] = value;
        if (size == 0) {
            front = rear;
        }
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % maxSize;
        size--;
        if (size == 0) {
            rear = -1;
            front = 0;
        }
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        rear = (rear - 1 + maxSize) % maxSize;
        size--;
        if (size == 0) {
            rear = -1;
            front = 0;
        }
        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return elements[front];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return elements[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }
}