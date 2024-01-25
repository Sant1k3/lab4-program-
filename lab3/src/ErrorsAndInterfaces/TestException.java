package ErrorsAndInterfaces;

public class TestException extends RuntimeException{
    private int test;
    public TestException(String message, Throwable cause, int test){
        super(message, cause);
        this.test = test;
    }
    public TestException(String message){
        super(message);
    }
}
