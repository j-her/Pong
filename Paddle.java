import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;


/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Actor
{
    private static final int WIDTH = 10;
    private static final int HEIGHT = 60;
    private String upKey;
    private String downKey;
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
    }
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown(upKey) ==  true )
        {
            setLocation( getX(), getY() -4);
        }
        
        if(Greenfoot.isKeyDown(downKey) == true )
        {
            setLocation( getX(), getY() +4);
        }
        
    }
    
    public Paddle(boolean isLeft)
    {
        GreenfootImage paddleImage = new GreenfootImage( WIDTH, HEIGHT );
        if(isLeft == true)
        {
            upKey = "w";
            downKey = "s";
            paddleImage.setColor(Color.RED);
        }
        else
        {
            upKey = "up";
            downKey = "down";
            paddleImage.setColor(Color.BLUE);
        }
        
        paddleImage.fillRect( 0, 0, WIDTH, HEIGHT );
        setImage( paddleImage);
    }
    
}
