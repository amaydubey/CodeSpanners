import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Over extends World
{

    public Over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);  
        Greenfoot.playSound("GameLose.wav");
        addObject(new GameOver(),400, 300);
         if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MenuWorld());
        }
      //  addObject(new Restart(), 400,400);
    }
}
