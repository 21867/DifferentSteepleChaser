import kareltherobot.*;
/**
 * Write a description of class DifferentSteepleChaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DifferentSteepleChaser extends Robot //extends????
{
    
    /**
     * Constructor for objects of class DifferentSteepleChaser
     */
    public DifferentSteepleChaser (int st,int ave, Direction direction, int beeps)
    {
        super(st, ave, direction ,beeps);
    }
    public boolean beeperIsToLeft()
    {
        turnLeft();
        move();
        if(nextToABeeper())
        {
            turnLeft();
            turnLeft();
            move();
            turnLeft();
            return true;
           }
        else
        {
            turnLeft();
            turnLeft();
            move();
            turnLeft();
            return false;
           } 
       }
    public void check()
    {
        if(!nextToABeeper())
        {
            move();
        }
        else
        {
            pickBeeper();
            if (!beeperIsToLeft())
            {
                move();
            }
            else
            {
                turnLeft();
                move();
                pickBeeper();
                turnRight();
                if (!beeperIsToLeft())
                {
                    turnRight();
                    move();
                    turnLeft();
                    move();
                    
                }
                else
                {
                    turnLeft();
                    move();
                    pickBeeper();
                    turnLeft();
                    turnLeft();
                    move();
                    move();
                    turnLeft();
                    move();
                }
            }
        }
    
        
            }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void runRace()
    {
       check();
       check();
       check();
       check();
       check();
       check();
       check();
       check();
       
        // your code here
    }
}
