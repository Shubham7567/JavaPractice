import java.util.Scanner;

//base class to run the program
public class shape
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String choice = "";
        double area=0.00;//for setting area of any shape to show at one place
        System.out.println("Enter the shape name for which you want to find area and to quit enter exit in shape name");//instruction
        while(!choice.equals("exit"))//to iterate while user want
        {
            System.out.println("Enter shape name:");
            choice = input.nextLine();//to take input for shapename
            choice = choice.toLowerCase();//so it will be easy to compare
            if(choice.equals("square") || choice.equals("rectangle"))//in one so we need only one object for both rectangle and square
            {
                Rectangle recsquare = new Rectangle();
                if(choice.equals("square"))
                {
                    recsquare.setHeight();
                    area = recsquare.getAreaOfSquare();
                }
                if(choice.equals("rectangle"))
                {
                    recsquare.setHeight();
                    recsquare.setWidth();
                    area = recsquare.getAreaOfRectangle();
                }
            }
            else if(choice.equals("triangle"))//for triangle
            {
                Triangle triangle = new Triangle();
                triangle.setHeight();
                triangle.setBase();
                area = triangle.getAreaOfTriangle();
            }
            else if(choice.equals("circle"))//for circle
            {
                Circle circle = new Circle();
                circle.setRadious();
                area = circle.getAreaOfCircle();
            }
            else{
                if(!choice.equals("exit"))
                {
                    System.out.println("Wrong choice");
                }
            }
            // set to show area only when it is shapename in choice
            if(choice.equals("circle") || choice.equals("triangle") || choice.equals("rectangle") || choice.equals("square"))
            {
                System.out.println("=================================");
                System.out.println("area of "+ choice + " is " + area);
                System.out.println("=================================\n\n");
            }    
        }
    }
}

//for shape Square
class Square
{
    double height;

    public void setHeight()//to set the value in height variable
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height:");
        this.height = input.nextDouble();
    }

    public double getHeight()//to get value of height in subclass
    {
        return this.height;
    }

    public double getAreaOfSquare()//to get area of square
    {
        return this.height*this.height;
    }
}

class Rectangle extends Square//inherited square to rectangle to use height
{
    double width;

    public void setWidth()//to set the value in width variable
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter width:");
        this.width = input.nextDouble();
    }

    public double getAreaOfRectangle()
    {
        return this.width*getHeight();//generate are by using height of square class
    }
}

class Triangle extends Square//inherited square to rectangle to use height
{
    double base;
    public void setBase()//to set the value of base
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base:");
        this.base = input.nextDouble();
    }

    public double getAreaOfTriangle()//to get area of triangle
    {
        return this.base * getHeight();
    }
}

class Circle
{
    double radious;

    public void setRadious()//set the value of radius
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radious:");
        this.radious = input.nextDouble();
    }

    public double getAreaOfCircle()//get the area of circle
    {
        return this.radious * this.radious  * 3.14;
    }
}