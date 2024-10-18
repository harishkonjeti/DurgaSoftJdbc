package org.core.java.doubts;
class A<T>{
    T t;
    A(){

    }
    A(T t){
        this.t = t;
    }
    public T showDataType(T t){
        System.out.println("val : " + t + " " + t.getClass().getTypeName());
        return t;
    }
}
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        A a = new A();
        a.showDataType(1);
        a.showDataType(1.0);
        a.showDataType(1l);
        a.showDataType(1L); // -->Suggested
        a.showDataType(1.0f);
        a.showDataType(1.0F); // -->Suggested
        a.showDataType(1.0d);
        a.showDataType(1.0D);
        a.showDataType("Harry");
        a.showDataType('C');
        a.showDataType(true);
//        a.showDataType(null); ---> NullPointerException
        a.showDataType(a);

    }
}
