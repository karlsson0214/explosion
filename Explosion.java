import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Animate explosion
 * 
 * @author Rikard Karlsson 
 * @version 20-03-13
 */
public class Explosion extends Actor
{
    // image from: https://commons.wikimedia.org/wiki/File:Explosion-155624_icon.svg
    private GreenfootImage originalImage;
    private int size = 10;

    public Explosion()
    {   
        // save original image 
        originalImage = getImage();

        resizeImage();
    }

    private void resizeImage()
    {
        // create copy of the original image
        GreenfootImage imageCopy = new GreenfootImage(originalImage);
        imageCopy.scale(size, size);
        // display copy
        setImage(imageCopy);
    }

    public void act() 
    {
        size = size + 10;
        resizeImage();
        if (size > 300)
        {
            getWorld().removeObject(this);
        }
    }    
}
