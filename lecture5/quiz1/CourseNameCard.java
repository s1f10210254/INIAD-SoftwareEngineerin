package quiz1;

public class CourseNameCard extends NameCard {
    private final String course;  // コース情報を格納するためのフィールド

    // コンストラクタ
    public CourseNameCard(String name, String course) {
        super(name);  // 親クラスのコンストラクタを呼び出す
        this.course = course;
    }

    // getCourse メソッドの実装
    public String getCourse() {
        return String.format("Course: %s", course);
    }
}