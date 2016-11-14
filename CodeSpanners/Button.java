import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * An object you can click on, and something will happen...
 * 
 * @author Seema
 * @version 1.0
 */
public class Button extends Actor implements Invoker
{
    private String title;
    private Command c;
    GreenfootSound sound = new GreenfootSound("button1.wav");
    /**
     * Constructor for objects of the class Button
     */
    public Button(String title)
    {
        this.title = title;
          GreenfootImage image = getImage() ;
        image.scale(100,100) ;
        putTextOnImage();
        
       // this.world = world;
    }
    
    private void putTextOnImage()
    {
        GreenfootImage backgroundImage = new GreenfootImage(getImage());
        GreenfootImage text = new GreenfootImage(title, 22, Color.BLACK, new Color(0,0,0,0));
        
        if (text.getWidth() > backgroundImage.getWidth() - 20) {
            backgroundImage.scale(text.getWidth() + 20, backgroundImage.getHeight());
        }
        
        int x = (backgroundImage.getWidth() -text.getWidth() ) /2;
        int y = (backgroundImage.getHeight() -text.getHeight() ) /2;
        backgroundImage.drawImage(text, x, y);
        setImage(backgroundImage);
    }
    
    /**
     * Check for clicks on the button.
     */
    public void act() 
    {
           if(getX()<1500)
           {
               setLocation(getX()+ 30, getY());
               sound.play();
            }
           if(Greenfoot.mouseClicked(this))
           {
               invoke();
           }
     
    }
    
    public void setCommand(Command c1) {
        c = c1;
    }
    
    public void invoke() {
        c.execute();
    }
    /**
     * Returns the title of the button.
     */
    public String getTitle()
    {
        return title;
    }
    

}