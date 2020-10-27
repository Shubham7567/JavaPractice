public class Calculator
{
    interface IntegerMath
    {
        int operation(int a,int b);
    }

    public int OperateBinary(int a,int b,IntegerMath op){
        return op.operation(a,b);
    }

    public static void main(String[] args)
    {
        Calculator myApp = new Calculator();
        IntegerMath addition = (a,b) -> a + b;
        IntegerMath substraction = (a,b) -> a-b;
        System.out.println("40 + 2 = " + myApp.OperateBinary(40,2,addition));

        System.out.println("20 - 10 = " + myApp.OperateBinary(20,10,substraction));
    }
}