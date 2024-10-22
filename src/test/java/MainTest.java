import org.apache.maven.plugins.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testGetGreeting() {
        Main main = new Main();
        String greeting = main.getGreeting();
        assertEquals("Hello world!", greeting);
    }
}
