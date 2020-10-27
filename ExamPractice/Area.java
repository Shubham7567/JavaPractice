import java.util.Scanner;

interface Shape
{
    public double height=0;
    public double width=0;
    public double radious=0;
    public double base=0;
}

class Square extends Shape
{
    public void set_height()
    {
        Scanner input = new Scanner();
        System.out.println("Enter height:");
        height = input.nextDouble();
    }
}

public class Area
{
    public static void main(String[] args)
    {
        Square square = new Square();
        square.set_height();
    }
}