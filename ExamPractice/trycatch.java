import java.util.*;

public class trycatch
{
    public static void main(String[] args)
    {
        int[] myNumbers = {1, 2, 3};
        try
        {
            System.out.println(myNumbers[10]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finaly done");
        }

        Mistry mist = new Mistry();
        mist.increse_number(21);

        System.out.println(mist.get_number());
        mist.finalize();
        System.out.println(mist.get_number());

    }
}

class Mistry
{
    int number=10;
    public void increse_number(int increment)
    {
        this.number = this.number + increment;
    }

    public int get_number()
    {
        return this.number;
    }

    public void finalize()
    {
    }
}