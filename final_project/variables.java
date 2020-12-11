import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class variables here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class variables extends Animal
{
    public int difficulty;
    public boolean stunned = false;
    SimpleTimer timer = new SimpleTimer();
    /**
     * Act - do whatever the variables wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       timer.mark();
    }     
    public void moving()
    {
        if(stunned == false)
        {
            move(-1 - difficulty);
        }
    }
    public void hurt()
    {
          
    }
}
