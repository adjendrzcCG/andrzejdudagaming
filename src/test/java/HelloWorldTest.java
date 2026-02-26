import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void testGetGreeting() {
        assertEquals("Hello, World!", HelloWorld.getGreeting());
    }
}
