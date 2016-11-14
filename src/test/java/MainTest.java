import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gauthier on 14/11/16.
 */
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
        assertEquals(main.getName(), "");
        main.setName("toto");
        assertEquals(main.getName(), "toto");
    }
}