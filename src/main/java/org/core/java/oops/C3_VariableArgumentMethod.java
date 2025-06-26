package org.core.java.oops;

public class C3_VariableArgumentMethod {
    //var arg should be the last argument
    //only one var arg is permitted
    public void variableArguementMethod(String name, int... varArg) {
        int sum = 0;
        for (int val : varArg) {
            sum += val;
        }
        System.out.println("Performed " + name + ", val is " + sum);
    }

    public static void main(String[] args) {
        C3_VariableArgumentMethod obj = new C3_VariableArgumentMethod();
        obj.variableArguementMethod("addition", 1, 2, 3, 4, 5, 6);
    }
}
