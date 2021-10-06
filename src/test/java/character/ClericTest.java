package character;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric(100);
    }

    @Test
    public void hasHealth(){
        assertEquals(100, cleric.getHealth());
    }

}
