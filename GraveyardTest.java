import static org.junit.Assert.assertEquals;
import org.junit.*;

public class GraveyardTest{
  Graveyard graveyard;
  Grave grave;

  @Before 
  public void before(){
    graveyard = new Graveyard("Greyfriars");
    grave = new Grave();
  }

  @Test 
  public void hasName(){
    assertEquals("Greyfriars", graveyard.getName());
  }

  @Test
  public void graveyardStartsWithNoGrave(){
    assertEquals(0, graveyard.graveCount());
  }

  @Test 
  public void graveyardCanHaveGrave(){
    graveyard.bury(grave);
    assertEquals(1, graveyard.graveCount());
  }

  @Test 
  public void cantBuryWhenCemeteryIsFull(){
    for (int i = 0; i < 15 ; i++ ) {
        graveyard.bury(grave);
    }
    assertEquals(11, graveyard.graveCount());
  }

  @Test 
  public void graveyardIsFull(){
    for (int i = 0; i < 11 ; i++) {
      graveyard.bury(grave);
    }
    assertEquals(true, graveyard.cemeteryFull());
  }

  @Test 
  public void graveyeardEmptyAfterZombieRising(){
    graveyard.bury(grave);
    assertEquals(1 , graveyard.graveCount());
    graveyard.empty();
    assertEquals(0, graveyard.graveCount());
  }

}