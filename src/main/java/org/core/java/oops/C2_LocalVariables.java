package org.core.java.oops;

public class C2_LocalVariables {
    String data = "Harry";
    String name2 = data;
    void localMethod(){
        String name;
        //local variables won't have default values;
        //the following line will throw error if we access local variable without initializing
        //System.out.println(name);
        name = "Harish";
        System.out.println("name : " + name);
        System.out.println("name2 : " + name2);

        String data = "Potter";
        System.out.println("data : " + data);
        System.out.println("data : " + this.data);
        System.out.println("name2 : " + name2);

    }
    // we cannot access local variables outside methods
    //String instVariable = name;

    public void localMethod2() {
        String name = "Sachin";
        int val = 10;
        int a =3;
        if (a >= 2) {
            name = "tendulkar";
            val = 20;
            System.out.println("name: " + name);
            System.out.println("val: " + val);
        }
        System.out.println("name: " + name);
        System.out.println("val: " + val);
    }

    public static void main(String[] args) {
        C2_LocalVariables obj = new C2_LocalVariables();
        obj.localMethod();
        obj.localMethod2();
    }
}
