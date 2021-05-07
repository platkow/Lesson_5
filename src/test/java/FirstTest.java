import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest extends TestBase{

    @Test
    public void thisIsMyFirstTest(){
        assertEquals("qwe", "qwe" );
        assertEquals(2, 2);
        assertTrue(false);
        System.out.println(">>>>This is my first test!!!");
    }

    @Test
    public void thisIsMySecondTest(){
        int i = 2;
        assertEquals(i, 2);
        assertEquals(2, 3);
        System.out.println(">>>>This is my second test!!!");
    }

    @Test
    public void thisIsMyThirdTest(){
        assertEquals("qwe", "qwe" );
        assertEquals(2, 2);
        System.out.println(">>>>This is my third test!!!");
    }
}
