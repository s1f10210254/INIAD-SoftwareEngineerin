package sample2.pkg2;

import sample2.pkg1.Member;

public class Student extends Member {
    protected int grade;

    public Student(String id, String name, int grade) {
        super(id, name);
        this.grade = grade;
    }

    @Override
    public String getProfile() { //getStudentProfile()から変更
        StringBuffer sb = new StringBuffer();
        sb.append("----- Student -----\n");
        sb.append(super.getProfile());
        sb.append("Grade: ").append(grade).append("\n");
        String email = getEmail();
        sb.append("email: ").append(email).append("\n");
        return sb.toString();
    }

    @Override
    public boolean canReserveRoom() {
        return false;
    }

    @Override
    protected String getEmail() {
        return name + DOMAIN;
    }
}