//Teacher
package sample2;

class Teacher extends Member {
    private String title;

    public Teacher(String id, String name, String title) {
        super(id, name);
        this.title = title;
    }

    public String getTeacherProfile() {
        return String.format("----- Teacher -----\nID: %s\nName: %s\nTitle: %s\nemail: %s\n",
                             this.id, this.name, this.title, this.getEmail());
    }
}