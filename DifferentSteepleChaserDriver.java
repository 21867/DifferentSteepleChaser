/**
   @Author:
      Date:
   Teacher:
       Lab:
      Misc:
  */
import kareltherobot.*;
import java.awt.Color;

public class DifferentSteepleChaserDriver implements Directions
{
    public static void main(String args[])  {
        DifferentSteepleChaser karel = new DifferentSteepleChaser(1, 1, East, 0);  
        karel.runRace();
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("ch5_10.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}