import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void testGetMessage() {
        assertEquals("Hello, World!", HelloWorld.getMessage());
    }
}
