public class Student {
    String name;
    int grade;

    //staticフィールド
    static int cnt = 0;
    //コンストラクタの宣言
    Student(String name, int grade){
        this.name = name;
        this.grade = grade;
        cnt++;
    }

    //コンストラクタのオーバーロード
    Student(String name){
        // this.name = name;
        // this.grade = 1;

        this(name, 1);
    }

    //インスタンスメソッド
    boolean belongsToCourse(){
        return this.grade >= 2;
    }

    boolean belongsToCourse(int credit){
        return (this.grade >= 2) && (credit >= 22);
    }

    //staticメソッド
    static boolean older(Student a, Student b){
        return a.grade > b.grade;
    }

}
