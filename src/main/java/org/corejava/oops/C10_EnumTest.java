package org.corejava.oops;

enum UserStatus{
    AVAILABLE("available"),BUSY("busy"),IDLE("idle"), EMPTY;

    private String value;

    UserStatus(){

    }
    UserStatus(String val) {
        this.value = val;
    }
    public  String getValue(){
        return value;
    }
}
public class C10_EnumTest {
    public static void main(String[] args) {
        System.out.println(UserStatus.BUSY);
        System.out.println(UserStatus.EMPTY);
        System.out.println(UserStatus.AVAILABLE.name());
        System.out.println(UserStatus.values());
        for (UserStatus value : UserStatus.values()) {
            System.out.println("value: " + value);
        }
        System.out.println(UserStatus.valueOf("IDLE"));
        System.out.println(UserStatus.BUSY.getValue());
    }
}
