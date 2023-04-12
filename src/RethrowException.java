public class RethrowException {
    public static void someMethod2() throws Exception {
        System.out.println("The Exception in someMethod2()");
        throw new Exception("thrown from someMethod2()");
    }
    public static void someMethod() throws Throwable {
        try {
            someMethod2();
        } catch(Exception e) {
            System.out.println("Inside someMethod()");
            throw e;
        }
    }
    public static void main(String[] args) throws Throwable {
        try {
            someMethod();
        } catch(Exception e) {
            System.out.println("Caught in main");
        }
    }
}