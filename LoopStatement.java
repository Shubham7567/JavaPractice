class LoopStatement
{
    public static void main(String[] args)
    {
        int number=0,index=0;
        number = Integer.parseInt(args[0]);
        for(index = 1; index<11; index++)
        {
            System.out.println(number + " * " + index + " = " + (number*index));
        }
    }
}