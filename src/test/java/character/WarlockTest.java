package character;

import character.mage.Warlock;
import org.junit.Before;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock(100);
    }
}
