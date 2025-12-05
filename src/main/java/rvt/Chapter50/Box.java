package rvt.Chapter50;

public class Box
{
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length)
    {
        this.width  = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side)
    {
        this.width  = side;
        this.height = side;
        this.length = side;
    }

    public Box(Box oldBox)
    {
        this.width  = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    public double width()  { return width;  }
    public double height() { return height; }
    public double length() { return length; }

    private double faceArea() { return width * height; }
    private double topArea()  { return width * length; }
    private double sideArea() { return height * length; }

    public double area()
    {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    public double volume()
    {
        return width * height * length;
    }

    public Box biggerBox()
    {
        return new Box(1.25 * width, 1.25 * height, 1.25 * length);
    }

    public Box smallerBox()
    {
        return new Box(0.75 * width, 0.75 * height, 0.75 * length);
    }

    public boolean nests(Box outsideBox)
    {
        return this.width  < outsideBox.width() &&
               this.height < outsideBox.height() &&
               this.length < outsideBox.length();
    }
}
