import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    public Radio radio;

    @Before
    public void before() {
        radio = new Radio("Sony", "My Radio", "6music");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("My Radio", radio.getModel());
    }

    @Test
    public void isTuned(){
        assertEquals("6music", radio.getTune());
    }

    @Test
    public void canPlay(){
        assertEquals("I am playing 6music", radio.play());
    }
}
