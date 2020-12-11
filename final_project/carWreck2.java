import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carWreck2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carWreck2 extends variables
{
    /**
     * Act - do whatever the carWreck2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         moving();
        if(getX() == 0)
       { 
           int y = Greenfoot.getRandomNumber(400);
           setLocation(550, y);
           if(difficulty < 10)
           {
               difficulty ++;
           }
       }
    }    
}
