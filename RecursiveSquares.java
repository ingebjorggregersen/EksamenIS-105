import java.awt.*;
import java.util.ArrayList;

/**
 * A square that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Jørgen Tveit Espeland
 * @version 2016.02.29
 */

public class RecursiveSquares
{
    private int size;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    private int antallFigurer;
    private int index;
    private ArrayList<RecursiveSquares> squares;

    /**
     * Constructor for creating square object
     * Autofills ArrayList
     */
    public RecursiveSquares()
    {
        isVisible = false;
        antallFigurer = 0;
       index = 0;
        squares = new ArrayList<RecursiveSquares>();
        fillAddSquares();
    }
    
    /**
     * Constrctor for creating squares of specific size, position and color 
     */
    public RecursiveSquares(int size, int yPosition, String color)
    {
        this.size = size;
        this.yPosition = yPosition; 
        this.color = color;
    } 
    
    /**
     * Arraylist for squares 
     */
    public void fillAddSquares()
    {
        squares.add(new RecursiveSquares(100, 80, "yellow")); //index 0
        squares.add(new RecursiveSquares(80, 100, "green")); //index 1
        squares.add(new RecursiveSquares(60, 120, "red")); //index 2
        squares.add(new RecursiveSquares(40, 140, "blue")); //index 3 
    }
    
    /**
       * Create reqursive squares from the Arraylist 
         */
        public void reqSquare()
        {
            System.out.println("Recursion" + index); 
            while(antallFigurer < 4){
                //kjøre paint metoden
                squares.get(index).makeVisible();
                index ++; 
                antallFigurer ++;
                reqSquare();
       
        }
    }

    /**
     * Make this square visible. If it was already visible, do nothing.
     */
    public void makeVisible()
        {
        isVisible = true;
        draw();
    }       
    
    /**
     * Draw the square with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                        new Rectangle(xPosition, yPosition, size, size));
            canvas.wait(10);
        }
    }
}
