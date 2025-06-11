package org.core.java.oops;
class Concrete_class{
    void concreteMethod(){
        System.out.println("Concrete method");
    }
}
abstract class AbstractClass_Parent extends Concrete_class{
    int a =1;

    AbstractClass_Parent(){
        System.out.println("AbstractClass_Parent constructor");
    }
    void parentMethod(){
        System.out.println("parent method");
    }
    abstract void parentAbstarctMethod();
}
class AbstractClass_Child extends AbstractClass_Parent{

    @Override
    void parentAbstarctMethod() {
        System.out.println("parentAbstract method implemented in child class");
    }
}
public class C13_AbstractClass {
    public static void main(String[] args) {
    AbstractClass_Child child1 = new AbstractClass_Child();
    AbstractClass_Child child2 = new AbstractClass_Child();
    child1.parentMethod();
    child1.parentAbstarctMethod();
    child1.concreteMethod();

    Concrete_class obj1 = new AbstractClass_Child();
    obj1.concreteMethod();
    }
}
