package sample2;

//Memberクラスを継承
public class Student extends Member{
    int grade;

    //サブクラスからコンストラクタの継承
    Student(String id, String name, int grade){
        super(id, name);
        this.grade = grade;
    }
    Student(){
        super(null, null);
    }
}
