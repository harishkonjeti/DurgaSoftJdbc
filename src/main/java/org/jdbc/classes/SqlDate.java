package org.jdbc.classes;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class SqlDate {
    public static void main(String[] args) {
        Date sqlDate = Date.valueOf("1996-10-26");
        System.out.println(sqlDate);
        java.util.Date utilDate = new java.util.Date();
        System.out.println(utilDate);
        System.out.println(utilDate.getTime());
        Date sqlDate1 = new Date(utilDate.getTime());
        System.out.println(sqlDate1);
        LocalDate localDate = LocalDate.now(ZoneId.of("Europe/London"));
        System.out.println(localDate);
    }
}
