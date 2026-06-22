import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testMain() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        try {
            HelloWorld.main(new String[]{});
            assertEquals("Hello, World!" + System.lineSeparator(), out.toString());
        } finally {
            System.setOut(originalOut);
        }
    }
}
