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
    
    public User(String name){
        this.name = name;
        this.pokemon = null;
        GreenfootImage img = new GreenfootImage( name.toUpperCase()+" ", 28, Color.WHITE, Color.BLUE);
        this.setImage(img);
    }
    public void setPokemon(Pokemon p){
        this.pokemon = p;
        
    }
    public Pokemon getPokemon(){
        return this.pokemon;
    }
    public void switchPokemon(Pokemon p){
        setPokemon(p);
    }
    public void heal(){
        if(this.pokemon != null){
            this.pokemon.heal();
        }
    }
    public void attack(String name, User enemy)
    {
        if (this.pokemon != null){
            this.pokemon.attack(name, enemy);
        }
    }
    public boolean isEndGame(){
        return false;
    }
    public void act()
    {
        // Add your action code here.
    }
    public Pokemon setPokemon(){
        return new Pokemon();
    }

}