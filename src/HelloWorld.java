public class HelloWorld {

    public native void print_c(String string);

    static { 
        System.loadLibrary("helloworldjni");
    }

    public static void main ( String[] args) {

        HelloWorld hello = new HelloWorld();

        hello.print_c("Hello");
        hello.print_c("World");

    }
}
