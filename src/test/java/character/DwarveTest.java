package character;

import character.warrior.Dwarve;
import org.junit.Before;

public class DwarveTest {

    Dwarve dwarve;

    @Before
    public void before(){
        dwarve = new Dwarve(100);
    }
}
