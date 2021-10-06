package character;

import character.enemy.Troll;
import org.junit.Before;

public class TrollTest {

    Troll troll;

    @Before
    public void before(){
        troll = new Troll(100);
    }
}
