package character;

import character.mage.Wizard;
import enums.Creatures;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard(100);
    }

    @Test
    public void canAddCreature(){
        wizard.addCreature(Creatures.DRAGON);
        assertEquals(1, wizard.getCreatures().size());
    }

    @Test
    public void canEquipCreature(){
        wizard.addCreature(Creatures.DRAGON);
        wizard.equipCreature(Creatures.DRAGON);
        assertEquals(Creatures.DRAGON, wizard.getCurrentCreature());
    }
}
