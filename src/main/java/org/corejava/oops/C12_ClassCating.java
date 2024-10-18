package org.corejava.oops;

class Parent1{
    public void parent1(){
        System.out.println("parent1 method");
    }
}
class Child1 extends Parent1{
    public void child1(){
        System.out.println("child1 method");
    }
}
class Child2 extends Child1{
    public void child2(){
        System.out.println("child2 method");
    }
}
class Child3 extends Child2{
    public void child3(){
        System.out.println("child3 method");
    }
}
public class C12_ClassCating {
    public static void main(String[] args) {
//Parent(object) ref variable cannot assign to  child reference variable
//        //Compilation Error
//        Parent1 p = new Parent1();
//        Child1 c1 = p;

//        // No Compilation Error, but java.lang.ClassCastException
//        Parent1 p = new Parent1();
//        Child1 c1 = (Child1) p;
//        c1.child1();

//        // No Compilation Error, No Exception
//        Parent1 p = new Child1();
//        Child1 c1 = (Child1) p;
//        c1.child1();

        Parent1 p = new Child3();
        Child2 c2 = (Child3) p;
        c2.child2();

//        Parent1 p = new Child2();
//        p.parent1();
//        Child1 c1 = (Child3) p;
//        c1.child1();

    }
}
