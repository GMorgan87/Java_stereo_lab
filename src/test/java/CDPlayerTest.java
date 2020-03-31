import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    public CDPlayer cdPlayer;

    @Before
    public void before(){ cdPlayer = new CDPlayer("Sony", "My CDPlayer", 6 );}

    @Test
    public void hasMake(){
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("My CDPlayer", cdPlayer.getModel());
    }

    @Test
    public void hasNoOfCDs(){ assertEquals(6, cdPlayer.getNoOfCDs());
    }

    @Test
    public void canPlay(){
        assertEquals("I am playing 6 CDs", cdPlayer.play());
    }
}
