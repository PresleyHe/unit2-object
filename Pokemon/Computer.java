import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Computer extends User
{
    public Computer(String name)
    {
        super(name);
    }

    public void setPokemon(Pokemon p)
    {
        super.setPokemon(p);
    }

    public void switchPokemon()
    {
        // code for computer switching Pokemon
    }

    public void attack(String name, User enemy)
    {
        super.attack(name, enemy);
    }
}