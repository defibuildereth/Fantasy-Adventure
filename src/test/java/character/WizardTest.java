package character;

import character.mage.Wizard;
import org.junit.Before;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard(100);
    }
}
