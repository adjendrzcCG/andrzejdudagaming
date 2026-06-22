import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void testMainPrintsHelloWorld() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        try {
            HelloWorld.main(new String[]{});
        } finally {
            System.setOut(originalOut);
        }

        assertEquals("Hello, World!", outputStream.toString().trim());
    }
}
