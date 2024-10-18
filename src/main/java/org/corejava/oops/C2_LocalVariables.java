package org.corejava.oops;

public class C2_LocalVariables {
    String data = "Harry";
    String name2 = data;
    void localMethod(){
        String name;
        //local variables won't have default variables;
        //the following line will throw error if we access local variable without initializing
        //System.out.println(name);
        name = "Harish";
        System.out.println("name : " + name);
        System.out.println("name2 : " + name2);
        System.out.println("data : " + data);

        String data = "Harry";

    }
    // we cannot access local variables outside methods
    //String instVariable = name;

    public static void main(String[] args) {
        C2_LocalVariables obj = new C2_LocalVariables();
        obj.localMethod();
    }
}
