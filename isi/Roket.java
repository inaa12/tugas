import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Roket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roket extends Actor
{
    /**
     * Act - do whatever the Roket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int belok = 0;
    public void act()
    {
        KontrolKeyboard();
        Ambil();
    }

    public void KontrolKeyboard()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            move(5);
        }

        if(Greenfoot.isKeyDown("down"))
        {
            move(-5);
        }

        if(Greenfoot.isKeyDown("right"))
        {
            belok+=2;
            setRotation(belok);
        }

        if(Greenfoot.isKeyDown("left"))
        {
            belok-=2;
            setRotation(belok);
        }
    }

    public void Ambil()
    {
        if(isTouching(bom.class))
        {
            removeTouching(bom.class);
        }
    }
}
