import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void mainPrintsHelloWorld() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        try {
            HelloWorld.main(new String[]{});
        } finally {
            System.setOut(original);
        }
        assertEquals("Hello, World!", out.toString().trim());
    }
}
