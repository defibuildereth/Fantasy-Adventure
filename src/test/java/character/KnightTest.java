package character;

import character.warrior.Knight;
import org.junit.Before;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight(100);
    }
}
