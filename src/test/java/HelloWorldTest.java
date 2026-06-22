import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void main_printsHelloWorld() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        HelloWorld.main(new String[]{});

        assertEquals("Hello, World!" + System.lineSeparator(), out.toString());
    }
}
