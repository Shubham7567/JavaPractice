import java.util.*; 
class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);  
        float num1=0,num2=0,result=0;
        System.out.println("Enter a number");
        num1 = sc.nextFloat();
        System.out.println("Enter a number");
        num2 = sc.nextFloat();
        System.out.println("Addition IS \n" + add(num1,num2,result));
        System.out.println("Substraction IS \n" + sub(num1,num2,result));
        System.out.println("Multiplication IS \n" + mul(num1,num2,result));
        System.out.println("Division IS \n" + div(num1,num2,result));
    }

    static float add(float num1,float num2,float result)
    {
        result = num1 + num2;
        return result;
    }

    static float sub(float num1,float num2,float result)
    {
        result = num1 - num2;
        return result;
    }

    static float mul(float num1,float num2,float result)
    {
        result = num1 * num2;
        return result;
    }

    static float div(float num1,float num2,float result)
    {
        result = num1 / num2;
        return result;
    }
}