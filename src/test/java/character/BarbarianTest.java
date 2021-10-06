package character;

import character.warrior.Barbarian;
import enums.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian(100);
    }

    @Test
    public void canHaveWeapon(){
        assertEquals(0, barbarian.getWeapons().size());
    }

    @Test
    public void canAddWeapon(){
        barbarian.addWeapon(Weapons.SWORD);
        assertEquals(1, barbarian.getWeapons().size());
    }

    @Test
    public void canEquipWeapon(){
        barbarian.addWeapon(Weapons.SWORD);
        barbarian.addWeapon(Weapons.AXE);
        barbarian.equipWeapon(Weapons.AXE);
        assertEquals(Weapons.AXE, barbarian.getCurrentWeapon());
    }
}
