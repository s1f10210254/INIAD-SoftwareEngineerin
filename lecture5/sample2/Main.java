package sample2;

public class Main {
    public static void main(String[] args) {
        Member st = new Student("1234", "Taro", 1);
        // Memver型でも、studentクラスのgetProfile()が呼ばれる
        System.out.printf(st.getProfile());
        Member t = new Teacher("1000", "Inoue", "Professor");
        // Member型でも、teacherクラスのgetProfile()が呼ばれる
        System.out.printf(t.getProfile());
    }
}