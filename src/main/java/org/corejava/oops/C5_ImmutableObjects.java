package org.corejava.oops;

public class C5_ImmutableObjects {
    public static void main(String[] args) {
        //immutable
        String s1 = "harry";
        String s2 = s1.concat(" potter");
        String s3 = s2.concat(" movie");

        //mutable objects
        StringBuffer sb1 = new StringBuffer("harry");
        StringBuffer sb2 = sb1.append(" potter");
        StringBuffer sb3 = sb2.append(" movie");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(sb1.hashCode());
        System.out.println(sb2.hashCode());
        System.out.println(sb3.hashCode());
    }
}
