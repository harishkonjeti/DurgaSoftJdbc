package org.corejava.oops;

class B{
    private int i;

    B(){
        System.out.println("B constructor");
    }
    B(int i){
        this.i = i;
    }
}
class C extends B{
    C(int i) {
        super(i);
    }
    C(){
        System.out.println("C constructor");
    }
}
public class C19_Super {
    public static void main(String[] args) {
        C c = new C();
    }
}
