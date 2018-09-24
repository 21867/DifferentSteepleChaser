/*
   @Author: Coglianese
      Date: Sep 18, 2006
   Teacher:
       Lab:
      Misc: based on work by C. Nelson
  */

import kareltherobot.*;

public class KarelCH5_10Test extends KJRTest implements Directions
{
    public KarelCH5_10Test (String name)
    {
            super(name);
    }
    
     public KarelCH5_10Test ()
    {
            super("test");
    }
    
    private DifferentSteepleChaser alice;

    

    public void setUp()
    {
         World.reset();
         World.setDelay(1);
         World.setVisible(false);               
         World.setTrace(true);
         World.readWorld("k://APCS A//0 Karel//worlds//ch5_10.kwld");         
         alice=  new DifferentSteepleChaser(1, 1, East, 0);
    }
    
    public void testRobotPosition()
    {
         World.reset();
         World.setDelay(1);
         World.setVisible(false);               
         World.setTrace(false);
         World.readWorld("k://APCS A//0 Karel//worlds//ch5_10.kwld");         
         alice=  new DifferentSteepleChaser(1, 1, East, 0);  
         alice.runRace();    
         assertAt((UrRobot)alice, 1, 9);
    }
    
     public void testRobotDirection()
    {
         World.reset();
         World.setDelay(1);
         World.setVisible(false);               
         World.setTrace(false);
         World.readWorld("k://APCS A//0 Karel//worlds//ch5_10.kwld");         
         alice=  new DifferentSteepleChaser(1, 1, East, 0);  
         alice.runRace();    
         assertFacingEast((UrRobot)alice);
    }
     
    public void testBeepersInWorld()
    {
         World.reset();
         World.setDelay(1);
         World.setVisible(false);               
         World.setTrace(false);
         World.readWorld("k://APCS A//0 Karel//worlds//ch5_10.kwld");         
         alice=  new DifferentSteepleChaser(1, 1, East, 0);      
         alice.runRace();        
         assertBeepersInWorld(0);
    }
    
    public void testBeepersInBag()
    {
         World.reset();
         World.setDelay(1);
         World.setVisible(false);               
         World.setTrace(false);
         World.readWorld("k://APCS A//0 Karel//worlds//ch5_10.kwld");         
         alice=  new DifferentSteepleChaser(1, 1, East,0);      
         alice.runRace(); 
         for(int i = 0; i < 7; i++)
         {
            assertBeepersInBeeperBag((UrRobot)alice);
            alice.putBeeper();
        }
        assertNoBeepersInBeeperBag((UrRobot) alice);
         
    }
 
}
