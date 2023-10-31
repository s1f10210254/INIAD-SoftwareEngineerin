package kadai2;

public class MyQueue<T> {
    private int size;
    private int tail;
    private int head;
    private Object[] elements;

    public MyQueue(int size) {
        this.size = size;
        this.tail = 0;
        this.head = 0;
        this.elements = new Object[size];
    }

    public void enqueue(T item) {
        if ((tail + 1) % size == head) {
            return; // sizeを超える場合、何も追加しない
        }
        elements[tail] = item;
        tail++;
        tail %= size;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null; // 要素がない場合はnullを返す
        }
        @SuppressWarnings("unchecked")
        T item = (T) elements[head];
        elements[head] = null; // 要素を削除した場所をnullにする
        head++;
        head %= size;
        return item;
    }

    public boolean isEmpty() {
        return head == tail;
    }
}
