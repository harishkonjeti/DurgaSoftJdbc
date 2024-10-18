package org.core.java.wrapper;

public class W2_StringManupulations {
    public static void main(String[] args) {
        String str = "Durga Software Solutions";
        String str1 = "Durga Software Solutions";
        String str2 = new String("Java is good");
        String str3 = new String("Java is good");
        byte[] byteArray = {65, 66, 67, 68, 69, 70};
        char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F'};

        System.out.println("str : " + str);
        System.out.println(str == str1);
        System.out.println(str2 == str3);
        System.out.println("str.equals(str1) : " + str.equals(str1));
        String str4 = new String(byteArray);
        System.out.println("str4 : " + str4);
        String str5 = new String(byteArray,1,3);
        System.out.println("str5 : " + str5);
        String str6 = new String(charArray);
        System.out.println("str6 : " + str6);
        String str7 = new String(charArray,2,3);
        System.out.println("str7 : " + str7);
        System.out.println("str.length() : " + str.length());
        System.out.println("str.concat(\" institute\") : " + str.concat(" institute"));
        System.out.println("str.equalsIgnoreCase(\"Durga Software Solutions\") : " + str.equalsIgnoreCase("durga Software Solutions"));
        System.out.println("\"abc\".compareTo(\"def\") : " + "abc".compareTo("def"));
        System.out.println(String.join("-",str,str2));
        System.out.println(str.toCharArray());
        System.out.println(str.split(" "));
        System.out.println(str.split(" ",6));
        System.out.println(str.substring(5));
        System.out.println(str.subSequence(5,20));

        StringBuffer stringBuffer = new StringBuffer("Durga Software Solutions");
        System.out.println(stringBuffer);
        stringBuffer.append(" institute");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
