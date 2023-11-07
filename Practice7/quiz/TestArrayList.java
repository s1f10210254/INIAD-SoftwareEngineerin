package quiz;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // StudentのArrayListを定義
        ArrayList<Student> myList = new ArrayList<>();

        // "Alice"と"Bob"というnameを持つStudentのインスタンスを追加
        myList.add(new Student("Alice"));
        myList.add(new Student("Bob"));

        // myListの各要素を表示
        for (Student student : myList) {
            System.out.println(student.getName());
        }
    }
}
