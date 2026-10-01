import greenfoot.*;
/**
 * Write a description of class Pokemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokemon extends Actor 
{
    // instance variables - replace the example below with your own
    private int hp;
    private int ap;
    private String name;
    private GreenfootImage img;
    private boolean outStatus;
    private Attack attack;
    private String type;
    
    public String getType(){
        return this.type;
    }
    public void attack(String aName, User enemy){
    }
    public void takeDamage(int amount ){
        this.hp -= amount;
    }
    public void heal(){
        this.hp ++;
    }
    public void printAttack(){
    }
    public int getAPower(String aName, User enemy){
        return 0;
    }
    /**
     * Constructor for objects of class Pokemon
     */
    public Pokemon()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return  y;
    }
}
