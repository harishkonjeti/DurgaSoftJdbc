package org.corejava.oops;

class Student{
    int student_id;
    String student_name;
    String student_branch;

     public Student() {
    }

    public Student(int student_id, String student_name, String student_branch) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_branch = student_branch;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_branch() {
        return student_branch;
    }

    public void setStudent_branch(String student_branch) {
        this.student_branch = student_branch;
    }

    public void getHashCode(){
        System.out.println(super.toString());
    }
}
public class C15_Entity {
    public static void main(String[] args) {

        Student student1 = new Student(1, "harry", "EEE");
        Student student2 = new Student(2, "potter", "CSE");
        System.out.println(student1.getStudent_name());
        System.out.println(student2.getStudent_name());
        System.out.println(student1);
        student1.getHashCode();
    }

}
