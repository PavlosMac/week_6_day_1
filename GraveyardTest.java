import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class GraveyardTest {
  Graveyard graveyard;
  Corpse corpse;
  Roadkill roadkill;
  PlagueInfected plagueinfected;

  @Before 
  public void before() {
    graveyard = new Graveyard("Greyfriars");
    corpse = new Corpse();
    roadkill = new Roadkill();
    plagueinfected = new PlagueInfected();
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
  public void graveyardCanBuryCorpse(){
    graveyard.bury(corpse);
    assertEquals(1, graveyard.graveCount());
  }

  @Test 
  public void cantBuryWhenCemeteryIsFull(){
    for (int i = 0; i < 15 ; i++ ) {
        graveyard.bury(corpse);
    }
    assertEquals(15, graveyard.graveCount());
  }

  @Test 
  public void graveyardIsFull(){
    for (int i = 0; i < 13 ; i++) {
      graveyard.bury(corpse);
    }
    assertEquals(true, graveyard.cemeteryFull());
  }



  @Test
  public void graveyardCanBeDugOut(){
    graveyard.bury(corpse);
    graveyard.digOut
  }

  // @Test 
  // public void graveyeardEmptyAfterZombieRising(){
  //   graveyard.bury(grave);
  //   assertEquals(1 , graveyard.graveCount());
  //   graveyard.empty();
  //   assertEquals(0, graveyard.graveCount());
  // }

  // @Test 
  // public void wardenGetsHappyWithTenGraves(){
  //   for (int i = 0; i < 10; i++ ) {
  //     graveyard.bury(grave);
  //   }
  //   assertEquals("Happy warden", graveyard.wardenIshappy()); 
  // }

  // @Test void wardenDrinksWhenCemeteryisFull(){
  //   for (int i = 0; i < 12; i++ ) {
  //     graveyard.bury(grave);
  //   }
  //   assertEquals(true, graveyard.isWardenDrunk());
  // }

}