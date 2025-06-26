package org.core.java.java8f.methodref;
@FunctionalInterface
interface Sport{
    void playCricket(String name);
}
class B{
    public B(){
        System.out.println("B class constructor");
    }
    public B(String val){
        System.out.println("B class constructor : " + val);
    }

    public void randomMethod(String val){
        System.out.println("B class instance method : " + val);
    }

    public static void randomStaticMethod(String val){
        System.out.println("B class static method : " + val);
    }
}
public class MethodRef2 {
    public static void main(String[] args) {
        Sport sport = B::new;
        sport.playCricket("Sachin");
        Sport sport1 = new B()::randomMethod;
        sport1.playCricket("sehwag");
        Sport sport2 = B::randomStaticMethod;
        sport2.playCricket("Ganguly");
    }
}
