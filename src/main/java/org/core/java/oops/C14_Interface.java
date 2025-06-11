package org.core.java.oops;

interface Service {
    int interface_var = 12;
    void m1();
}

class ImplementationClass implements Service{
    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    public void m2(){
        System.out.println("m2 method");
    }
}
public class C14_Interface{
    public static void main(String[] args) {
        Service obj1 = new ImplementationClass();
        obj1.m1();
        //obj1.m2();   --> error
        int var1 = obj1.interface_var;
        int var2 = Service.interface_var;
        int var3 = ImplementationClass.interface_var;

        ImplementationClass obj2 = new ImplementationClass();
        obj2.m1();
        obj2.m2();
        int val4 = obj2.interface_var;
        int val5 = Service.interface_var;
        int val6 = ImplementationClass.interface_var;

    }
}
