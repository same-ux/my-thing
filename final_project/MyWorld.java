import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        player p = new player();
        addObject(p, 50, 200);
        
        carWreck1 c1 = new carWreck1();
        addObject(c1, 550, Greenfoot.getRandomNumber(200));
        
        carWreck2 c2 = new carWreck2();
        addObject(c2, 550, Greenfoot.getRandomNumber(300));
        
        carWreck3 c3 = new carWreck3();
        addObject(c3, 550, Greenfoot.getRandomNumber(400));
    }
    
}
