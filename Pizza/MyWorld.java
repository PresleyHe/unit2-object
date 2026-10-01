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
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pizza pizza = new Pizza();
        addObject(pizza,160,226);
        pizza.setLocation(300, 300);
        Toppings toppings = new Toppings("Cheese");
        addObject(toppings,120,153);
        pizza.setLocation(300,296);
        Toppings toppings2 = new Toppings("Olives");
        addObject(toppings2,300,296);
        toppings.setLocation(300, 300);
        pizza.setLocation(298,295);
        Toppings toppings3 = new Toppings("Pepperoni");
        addObject(toppings3,298,295);
    }
}
