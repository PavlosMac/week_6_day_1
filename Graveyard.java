
import java.util.*;

public class Graveyard{
  private String name;
  private ArrayList<Buriable> cemetery;
  


  public Graveyard(String name){
    this.name = name;
    this.cemetery = new ArrayList<Buriable>();   
    }


  public String getName(){
  return this.name;
  }

  public int graveCount(){
    return this.cemetery.size();
  }

 
  public void bury(Buriable body){
    this.cemetery.add(body)
  }


  public Buriable digOut(){
    if (graveCount() > 0) {
      Buriable body = cemetery.remove(0);
      return body;
    }
    return null;
  }


 

  // public void empty(){
  //   for (int i = 0; i < cemetery.length; i++ ) {
  //     cemetery[i] = null;
  //   }
  // }

  // public String wardenIshappy(){
  //   if (cemetery.length == 10){
    
  //   }
  //   return "Happy warden";
  // }

  // public boolean isWardenDrunk(){
  //   if (cemeteryFull()){
  //   return;
  //   }
  // }



}   