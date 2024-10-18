package org.corejava.oops;

public class C1_InstanceVariables {
    String id;
    String name;
    int age;
    float salary;

    void displayInstanceVariablesDefaultValues(){
        System.out.println("Default values of Instance variables: ");
        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("salary : " + salary);
    }

    public static void main(String[] args) {
        C1_InstanceVariables obj = new C1_InstanceVariables();
        obj.displayInstanceVariablesDefaultValues();
        C1_InstanceVariables obj2 = null;
        //will throw null pointer exception
        obj2.displayInstanceVariablesDefaultValues();
    }
}
