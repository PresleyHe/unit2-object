import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User extends Actor
{
    /**
     * Act - do whatever the User wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String name;
    private Pokemon pokemon;
    public void act()
    {
        // Add your action code here.
    }
    public User(String name){
        
    }
    public Pokemon setPokemon(){
        return new Pokemon();
    }

}