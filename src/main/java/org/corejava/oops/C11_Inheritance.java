package org.corejava.oops;
class Parent{
    int parent_variable = 10;
   public void parent(){
       System.out.println("parent method");
   }
}
class Child extends Parent{
    int child_variable = 20;
    public void child(){
        System.out.println("child method");
    }
    public void parent(){
        System.out.println("parent method in child class");
    }
}
public class C11_Inheritance {
    public static void main(String[] args) {
        Parent p = new Child();
        int parentVariable = p.parent_variable;
        p.parent();

        Parent p1 = new Child();
        Child c1 = (Child) p1;
        c1.child();
    }
}
