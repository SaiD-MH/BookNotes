package ch4;

public class StackClass {

    private char arr[];
    private int mx_S, top;

    public StackClass(int size) {
        mx_S = size;
        top = -1;
        arr = new char[size];
    }

    public void Push(char val) {

        arr[++top] = val;

    }

    public char Pop() {
        return arr[top--];
    }

    public char Peek() {
        return arr[top];
    }

    public boolean isFull() {
        return top == (mx_S);
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
