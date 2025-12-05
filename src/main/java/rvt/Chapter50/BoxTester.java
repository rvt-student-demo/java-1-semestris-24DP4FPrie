package rvt.Chapter50;

public class BoxTester
{
    public static void main(String[] args)
    {
        Box box = new Box(2.5, 5.0, 6.0);

        System.out.println("Area: " + box.area());
        System.out.println("Volume: " + box.volume());

        System.out.println("Width:  " + box.width());
        System.out.println("Height: " + box.height());
        System.out.println("Length: " + box.length());

        Box copy = new Box(box);
        System.out.println("Copied box volume: " + copy.volume());

        Box big = box.biggerBox();
        Box small = box.smallerBox();
        System.out.println("Bigger box dimensions: " +
                big.width() + " x " + big.height() + " x " + big.length());
        System.out.println("Smaller box dimensions: " +
                small.width() + " x " + small.height() + " x " + small.length());

        System.out.println("Does small nest in box? " + small.nests(box));
        System.out.println("Does box nest in small? " + box.nests(small));
    }
}
