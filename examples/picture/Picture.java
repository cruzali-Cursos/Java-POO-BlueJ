
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author    Michael Kolling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private    Circle sun;
    private Circle sun2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();    
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
     
        
        sun2 = new Circle();
        sun2.changeColor("yellow");
        sun2.moveHorizontal(10);
        sun2.moveVertical(-10);
        sun2.changeSize(60);
        sun2.makeVisible();
        sun2.slowMoveVertical(170);
    }
    
    public void drawCircleSunset() {
        Circle c = new Circle();
        c.changeColor("yellow");
        c.moveHorizontal(5);
        c.moveVertical(-5);
        c.changeSize(40);
        c.makeVisible();
    }
    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            //delta += delta;
            drawCircleSunset();
        }
    }
    
    public void fastMoveVertical(int distance) {
        int delta;
        
        if (distance < 0) {
            delta = -1;
        }
    }
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    
    public void sunsetUp() {
        sun2.changeColor("red");
        sun2.makeVisible();
        sun2.slowMoveVertical(-180);
    }
    
    public void sunsetDown() {
        sun.changeColor("yellow");
        sun.makeVisible();
        sun.slowMoveVertical(180);
    }
    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
