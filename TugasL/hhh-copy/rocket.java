  import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class rocket extends Actor
{
    
    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World w; 
    public void act()
    {
        w = getWorld();
        // Add your action code here.
        mover(); //call a menthod 
        shooter();
        end();
    }

    public void mover()   //menthod definition
    {
    if(Greenfoot.isKeyDown("Up") || Greenfoot.isKeyDown("W"))
    {
    setLocation(getX(),getY()-10); 
    }
    if(Greenfoot.isKeyDown("Down") || Greenfoot.isKeyDown("S"))
    {
    setLocation(getX(),getY()+10); 
    }
    }

  public void shooter()
  {
    World w = getWorld();  //create a World class object and sets it to the current World
    if(Greenfoot.isKeyDown("space"))
    {
      w.addObject(new Shots(), getX()+50 , getY());
    }
}
public void end(){
    if (isTouching(SpaceObject.class)){
        getWorld().showText("GameOver",400, 300);
        Greenfoot.stop();
    }
}
}
