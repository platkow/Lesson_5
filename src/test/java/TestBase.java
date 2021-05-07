import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    @BeforeEach
    public void setup() {
        System.out.println("I was run before each test");
    }

    @AfterEach
    public void cleanUp() {
        System.out.println("I was run after each test");
    }

    @BeforeAll
    public static void runOnceBeforeAll() {
        System.out.println("I was run once before all tests");
    }

    @AfterAll
    public static void runOnceAfterAll() {
        System.out.println("I was run once after all tests");
    }
}
