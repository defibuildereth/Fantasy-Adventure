import character.enemy.Troll;
import enums.Treasure;
import org.junit.Before;
import org.junit.Test;
import rooms.Dungeon;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Dungeon dungeon;
    Troll troll;

    @Before
    public void before(){
        dungeon = new Dungeon("The Lair");
        troll = new Troll(100);
    }

    @Test
    public void hasEnemy(){
        assertEquals(0, dungeon.getEnemy().size());
    }

    @Test
    public void canAddEnemy(){
        dungeon.addEnemy(troll);
        assertEquals(1, dungeon.getEnemy().size());
    }

    @Test
    public void hasTreasure(){
        assertEquals(0, dungeon.getTreasure().size());
    }

    @Test
    public void canAddTreasure(){
        dungeon.addTreasure(Treasure.GOLD);
        assertEquals(1, dungeon.getTreasure().size());
    }
}
