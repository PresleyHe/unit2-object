import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Toppings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toppings extends Actor
{
    /**
     * Act - do whatever the Toppings wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String name;
    public Toppings(String name){
        this.name = name;
        setImage(name+".png");
    }
    public void act()
    {
        // Add your action code here.
        fall();
    }
        public void fall()
        {
            setLocation(getX(), getY() + 2);
            if(getY() >= getWorld().getHeight() - 1)
            {
                int randomX = Greenfoot.getRandomNumber(getWorld().getWidth());
                setLocation(randomX, 0);
            }
        }
}
