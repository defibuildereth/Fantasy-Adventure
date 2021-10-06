package character;

import character.warrior.Barbarian;
import org.junit.Before;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian(100);
    }
}
