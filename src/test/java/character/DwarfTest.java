package character;

import character.warrior.Dwarf;
import org.junit.Before;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf(100);
    }
}
