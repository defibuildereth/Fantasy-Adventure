package character;

import character.enemy.Troll;
import character.warrior.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    Knight knight;

    @Before
    public void before(){
        troll = new Troll(100);
        knight = new Knight(100);
    }

    @Test
    public void canAttack(){
        troll.attack(knight);
        assertEquals(92, knight.getHealth());
    }
}
