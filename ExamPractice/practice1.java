public class practice1
{
    public static void main(String[] args)
    {
        rectangle mySquare = new rectangle(10);
        rectangle myRectangle = new rectangle(10,15);
        
        System.out.println("Area of sqare is "+mySquare.area_of_square());
        System.out.println("Area of sqare is "+myRectangle.area_of_square());
    }
}

class square
{
    int height;
    square(int height)
    {
        this.height = height;
    }

    public int get_height()
    {
        return this.height;
    }

    public int area_of_square()
    {
        return this.height*this.height;
    }
}

class rectangle extends square
{
    int width;
    rectangle(int height)
    {
        super(height);
    }

    rectangle(int height, int width)
    {
        this.width = width;
        super(height);
    }

    public int area_of_rectangle()
    {
        return (this.width*get_height());
    }
}