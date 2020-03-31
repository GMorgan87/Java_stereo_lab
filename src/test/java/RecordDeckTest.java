import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    public RecordDeck recordDeck;

    @Before
    public void before(){
            recordDeck = new RecordDeck("Sony", "My RecordDeck", 100);
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", recordDeck.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("My RecordDeck", recordDeck.getModel());
    }

    @Test
    public void hasPlaySpeed(){
        assertEquals(100, recordDeck.getPlaySpeed());
    }

    @Test
    public void canPlay(){
        assertEquals("I am playing at 100 rpm", recordDeck.play());
    }
}



