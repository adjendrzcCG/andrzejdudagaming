public class HelloWorld {

    public String greet() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().greet());
    }
}
