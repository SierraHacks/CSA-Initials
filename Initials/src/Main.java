import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setDelay(10); 

    
    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(1,5,North,30);
	
    // examples of commands you can invoke on a Robot
    

    for (int i = 0; i < 4; i++) {
      r.putBeeper();
      for (int u=0;u<4;u++) {
        r.move();
        r.turnLeft();
        r.move();
        r.putBeeper();
        turnRight(r);
      }
      turnRight(r);
    }
    
  }
  public static void turnRight (Robot robot) {
    for (int i = 0; i < 3; i++) {
      robot.turnLeft();
    }
  }
}