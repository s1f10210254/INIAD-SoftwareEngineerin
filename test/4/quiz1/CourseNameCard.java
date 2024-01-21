package quiz1;

public class CourseNameCard extends NameCard{
    String course;

    CourseNameCard(String name, String course){
        super(name);
        this.course = course;
    }

    public String getLabel() {
        String result = "Student: " + name;
        return result;
    }

    public String getCourse(){
        String result = "Course: " + course;
        return result;
    }
    
}
