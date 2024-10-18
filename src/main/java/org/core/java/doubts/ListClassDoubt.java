package org.core.java.doubts;

import org.core.java.collections.Person;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;

    private List<String> qual;

    public Student(int id, String name, List<String> qual) {
        this.id = id;
        this.name = name;
        this.qual = qual;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getQual() {
        return qual;
    }

    public void setQual(List<String> qual) {
        this.qual = qual;
    }

    public void addElement(List<String> stringList){
        stringList.add("phd");
    }

    public void updateQual(Student student){
        student.getQual().add("doctorate");
    }
}
public class ListClassDoubt {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("tenth");
        list.add("inter");
        list.add("btech");
        list.add("mtech");
        System.out.println(list);
        Student student = new Student();
        student.setQual(list);
        student.addElement(list);
        System.out.println(list);
        student.updateQual(student);
        System.out.println(list);
    }
}
