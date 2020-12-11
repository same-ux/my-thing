import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends variables
{
    public int life = 3;
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moving();
    }
    
    public void moving()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            if(stunned == false)
            {
                int x = getX();
                int y = getY() - 10;
                setLocation(x, y);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            if(stunned == false)
            {
                int x = getX();
                int y = getY() + 10;
                setLocation(x, y);
            }
        }
        if(canSee(carWreck1.class) || canSee(carWreck2.class) || canSee(carWreck3.class))
        {
              life--; 
        }
    }
}
