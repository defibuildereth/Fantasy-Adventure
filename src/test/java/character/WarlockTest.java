package character;

import character.mage.Warlock;
import enums.Spells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock(100);
    }

    @Test
    public void canAddSpell(){
        warlock.addSpell(Spells.FIRE);
        assertEquals(1, warlock.getSpells().size());
    }

    @Test
    public void canEquipSpell(){
        warlock.addSpell(Spells.FIRE);
        warlock.equipSpell(Spells.FIRE);
        assertEquals(Spells.FIRE, warlock.getCurrentSpell());
    }
}
