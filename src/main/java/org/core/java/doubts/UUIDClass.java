package org.core.java.doubts;

import java.io.BufferedReader;
import java.util.UUID;

public class UUIDClass {
    public static void main(String[] args) {
        String str = "1234" + "_" + UUID.randomUUID();
        String[] splitVal =  str.split("_");
        System.out.println(splitVal[0]);
        System.out.println(splitVal[1]);
        //language=JSON
        String str1 = "{\n" +
                "  \"person\": \"harry\",\n" +
                "  \"age\": 12\n" +
                "}\n";

        System.out.println(str1);
        String str2 = "";
    }

}
