public class Stack {

    public int top;
    public int[] stackArray;
    public int maxSize;

    Stack(int size) {

        top = -1;
        maxSize = size;
        stackArray = new int[maxSize];
    }

    void push(int x) {
        stackArray[++top] = x;
    }

    int pop() {
        return stackArray[top--];
    }

    int peek() {
        return stackArray[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == maxSize-1;
    }

    public static void main(String[] args){

        Stack st = new Stack(10);
        st.push(10);
        st.push(5);
        st.push(20);
        st.push(25);
        st.push(90);

        while (!st.isEmpty()){

            int value = st.pop();
            System.out.println(value + " ");
        }

        st.pop();
    }
}
