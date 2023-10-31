package kadai1;

@SuppressWarnings("unchecked")
public class MyStack<E> {
    private int size;
    private int top;
    private E[] elements;

    public MyStack(int size) {
        this.size = size;
        this.top = 0;
        this.elements = (E[]) new Object[size];
    }

    // pushメソッド
    public void push(E item) {
        if (top >= size) {
            System.out.println("スタックが満杯です。");
            return;
        }
        elements[top] = item;
        top++;
    }

    // popメソッド
    public E pop() {
        if (top <= 0) {
            System.out.println("スタックが空です。");
            return null;
        }
        top--;
        return elements[top];
    } 
}
