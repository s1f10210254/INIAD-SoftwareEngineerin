package quiz5;

public class CourseNameCard extends NameCard{
    private final String course;
    //コンストラクタ
    public CourseNameCard(String name, String course){
        super(name);
        this.course = course;
    }

    //インスタンスメソッド
    public String getCourse(){
        return String.format("Course: %s", course);
    }
}
