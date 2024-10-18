package org.core.java.exceptions;

class MockedException extends Exception{
    public MockedException() {
    }

    public MockedException(String message) {
        super(message);
    }

    public MockedException(String message, Throwable cause) {
        super(message, cause);
    }
}
public class Main3 {
    public static void main(String[] args) throws MockedException {
        try {
            float f =100/0;
        }
        catch (Exception e){
            //new MockedException(e.getMessage(),e);
            throw new MockedException(e.getMessage(),e);
        }
    }
}
