import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void mainPrintsHelloWorld() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        try {
            HelloWorld.main(new String[]{});
        } finally {
            System.setOut(originalOut);
        }
        assertEquals("Hello, World!", out.toString().trim());
    }
}
