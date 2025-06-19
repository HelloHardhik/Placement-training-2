class StackArray {
    int maxSize = 100;
    int top;
    int[] stack = new int[maxSize];

    StackArray() {
        top = -1;
    }

    void push(int x) {
        if (top >= maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Empty");
            return -1;
        }
        return stack[top];
    }

    boolean isEmpty() {
        return (top < 0);
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}
