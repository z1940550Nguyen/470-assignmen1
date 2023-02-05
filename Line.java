import java.io.*;
import java.lang.Math;
public class Line
{
    private int x1,y1,x2,y2,z1;
    private String c;
    //constructor
    //Receives 4 integers which are the Line's start and end points.
    public Line(int left, int top, int bottom, int right, int Thick, String color) throws IllegalAccessException {
        setLeft (left);
        setTop (top);
        setRight(right);
        setBottom(bottom);
        setThick(Thick);
        setColor(color);

    }
    public Line(TwoDPoint obj1, TwoDPoint obj2,int Thick,String color) throws IllegalAccessException {
        this(obj1.x,obj1.y,obj2.x,obj2.y,Thick,color);
    }
    // method draw() call another method called drawline(),
    //which is assumed to be a graphic primitive on the system.
    //howeve, text decribtion will be display
    public void draw()
    {
        drawLine(x1,y1,x2,y2,z1,c);
    }
    //method drawLine() simulates drawing of a line for console mode.
    // it should decribe all the important attributes of the line
    private void drawLine(int x1, int y1, int x2, int y2,int z1,String c)
    {
        System.out.println("draw a line from x of "+ x1+" and y of " +y1);
        System.out.println("to x of " + x2 + " and y of " +y2 + "\n");
        System.out.println("line width= "+z1 +"\n");
        System.out.println(" Line color= "+ c+" \n");

    }
    //method setline allow change to existing line
    public void setLine (int left, int top, int bottom, int right,int Thick, String color) throws IllegalAccessException {
        setLeft(left);
        setTop(top);
        setRight(right);
        setBottom(bottom);
        setThick(Thick);
        setColor(color);
    }
    //individual method of set
    private double Calculator(int x1, int x2,int y1, int y2)
    {
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    public void getLength()
    {

        System.out.println("length = "+ Calculator(x1,x2,y1,y2)+"\n");
    }
    public void setLeft (int left) throws IllegalAccessException {
        if (left < 0 || left >639)
            throw new IllegalAccessException("Invalid Argument");

        else
            this.x1= left;
    }
    public void setTop(int top) throws IllegalAccessException {
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
        c=color;
    }
    public void setThick(int Thick)
    {
        z1 = Thick;
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
    public int getThick() { return z1;}
    public String getColor() { return c;}

}

