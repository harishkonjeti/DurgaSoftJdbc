package org.corejava.oops;

public class C3_VariableArgumentMethod {
    public void variableArguementMethod(String name, int ...var){
        int sum = 0;
        for (int val:var) {
            sum += val;
        }
        System.out.println("Performed " + name + ", val is " + sum);
    }

    public static void main(String[] args) {
        C3_VariableArgumentMethod obj = new C3_VariableArgumentMethod();
        obj.variableArguementMethod("addition", 1,2,3,4,5,6);
    }
}
