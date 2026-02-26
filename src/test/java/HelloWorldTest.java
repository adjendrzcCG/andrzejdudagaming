import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void greet_returnsPersonalizedMessage() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World!", hw.greet("World"));
    }

    @Test
    void greet_returnsMessageForAnyName() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, Alice!", hw.greet("Alice"));
    }

    @Test
    void main_doesNotThrow() {
        assertDoesNotThrow(() -> HelloWorld.main(new String[]{}));
    }
}
