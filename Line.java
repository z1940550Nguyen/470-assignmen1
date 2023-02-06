import java.io.*;
import java.lang.Math;
public class Line
{
    private int x1, y1, x2, y2, width;
    private String c;   // stores color of the line
    
    //constructor
    //Receives 4 integers which are the Line's start and end points.
    public Line(int left, int top, int bottom, int right, int thickness, String 
      color) throws Exception 
    {
        setLeft(left);
        setTop(top);
        setRight(right);
        setBottom(bottom);
        setThickness(thickness);
        setColor(color);
    }
    
    public Line(TwoDPoint obj1, TwoDPoint obj2,int thickness,String color) 
      throws Exception
    {
        this(obj1.x,obj1.y,obj2.x,obj2.y,thickness,color);
    }
    
    // method draw() call another method called drawline(),
    //which is assumed to be a graphic primitive on the system.
    //howeve, text decribtion will be display
    public void draw()
    {
        drawLine(x1,y1,x2,y2,width,c);
    }
    
    //method drawLine() simulates drawing of a line for console mode.
    // it should decribe all the important attributes of the line
    private void drawLine(int x1, int y1, int x2, int y2, int width, String 
      color)
    {
        System.out.println("\nDraw a line from x of "+ x1 +" and y of " + y1);
        System.out.println("to x of " + x2 + " and y of " + y2);
        System.out.println("Line width = " + width);
        System.out.println("Line color = "+ color);
    }
    
    //method setline allow change to existing line
    public void setLine (int left, int top, int bottom, int right, int 
      thickness, String color) throws Exception 
    {
        try
        {
            setLeft(left);
        }
        catch (Exception negativeExc)
        {
            System.out.println("Invalid left (<0), the line was not moved."); 
        }
        catch (Exception maxXExc)
        {
            System.out.println("Invalid left (>639), the line was not moved."); 
        }

        setTop(top);
        setRight(right);
        setBottom(bottom);
        setThickness(thickness);
        setColor(color);
    }
    
    //individual method of set
    private double Calculator(int x1, int x2,int y1, int y2)
    {
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    
    public void getLength()
    {
        System.out.println("Length = " + Calculator(x1,x2,y1,y2));
    }
    
    // Check if the coordinate input is negative
    public static void checkNegative(int coordinate) throws Exception
    {
        try // throw an exception and immediately catch it
        {
            if 
        }
        if (coordinate < 0)
          throw new Exception("Negative coordination exception");
    }
    
    public static void checkMaxX(int coordinate) throws Exception
    {
        if (coordinate > 639)
          throw new Exception("Maximum x coordination exception");
    }
    
    public static void checkMaxY(int coordinate) throws Exception
    {
        if (coordinate < 479)
          throw new Exception("Maximum y coordination exception");
    }
    
    public void setLeft(int left) throws Exception 
    {
        try
        {
            checkNegative(left);
        }
        catch (Exception negativeExc)
        {
            System.out.println("Negative coordinate"); 
            throw negativeExc; // rethrow for further processing
        }
        try
        {
            checkMaxX(left);
            x1 = left;
        }
        catch (Exception maxXExc)
        {
            System.out.println("X coordinate is larger than maximum value"); 
            throw maxXExc; // rethrow for further processing
        }
    }
    
    public void setTop(int top)
    {
        if (top < 0|| top > 479)
            throw new IllegalAccessException("Invalid Argument");
        else
            y1 = top;
    }
    
    public void setBottom(int bottom) throws IllegalAccessException {
        if(bottom >479|| bottom <0)
            throw new IllegalAccessException("Invalid Argument");
        else
            y2= bottom;
    }
    
    public void setRight(int right) throws IllegalAccessException {
        if (right >639 || right <0)
            throw new IllegalAccessException("Invalid Argument");
        else
            x2=right;
    }
    
    public void setColor(String color)
    {
        c = color;
    }
    
    public void setThickness(int thickness)
    {
        width = thickness;
    }
    
    public int getTop()
    {
        return y1;
    }
    
    public int getBottom()
    {
        return y2;
    }
    
    public int getLeft()
    {
        return x1;
    }
    
    public int getRight()
    {
        return x2;
    }
    
    public int getThickness() { return width;}
    public String getColor() { return c;}
}

