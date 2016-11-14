import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    private Main main;

    @Before
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void getHello() throws Exception {
        assertEquals(main.getHello(), "Hello!");
        main.setName("toto");
        assertEquals(main.getHello(), "Hello toto!");
    }

    @Test
    public void setName() throws Exception {
        main.setName("toto");
        assertEquals(main.getName(), "toto");
        main.setName("");
        assertEquals(main.getName(), "");
    }
}