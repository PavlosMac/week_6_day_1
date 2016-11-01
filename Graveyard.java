public class Graveyard{
  private String name;
  private Grave[] cemetery;
  private Warden guy;


  public Graveyard(String name){
    this.name = name;
    this.cemetery = new Grave[11];
    this.guy = new Warden();
  }


  public String getName(){
  return this.name;
  }


  public int graveCount(){
    int counter = 0;
    for (Grave hole: cemetery){
      if (hole != null){
        counter++;
      }
    }
    return counter;
  }

  public int wardensGraveLog(){
    int counter = 0;
    for (Grave hole: cemetery){
      if (hole != null){

      }
    }
    return counter;
  }

  public void bury(Grave grave){
    if (cemeteryFull()){
      return;
    }
    int graves = graveCount();
    cemetery[graves] = grave; 
  }

  public boolean cemeteryFull(){
    return cemetery.length == graveCount();
  }

  public void empty(){
    for (int i = 0; i < cemetery.length; i++ ) {
      cemetery[i] = null;
    }
  }

  public String wardenIshappy(){
    if (cemetery.length == 10){
    
    }
    return "Happy warden";
  }

  public boolean isWardenDrunk(){
    if (cemeteryFull()){
    return;
    }
  }



}   