package kadai1;

public class MyStackTest {
    public static void main(String[] args) {
        // Stringのスタックを作成
        MyStack<String> stringStack = new MyStack<>(10);
        stringStack.push("Apple");
        stringStack.push("Banana");
        stringStack.push("Orange");

        // Studentのスタックを作成
        MyStack<Student> studentStack = new MyStack<>(10);
        studentStack.push(new Student("Bob", 10, "001"));
        studentStack.push(new Student("Alice", 12, "002"));

        // Stringのスタックの内容を表示
        System.out.println("Strings in the stack:");
        for (int i = 0; i < 3; i++) {
            System.out.println(stringStack.pop());
        }

        // Studentのスタックの内容を表示
        System.out.println("\nStudents in the stack:");
        for (int i = 0; i < 2; i++) {
            System.out.println(studentStack.pop());
        }
    }
}