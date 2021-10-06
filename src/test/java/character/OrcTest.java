package character;

import character.enemy.Orc;
import org.junit.Before;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc(100);
    }
}
