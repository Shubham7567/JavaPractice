import java.util.*;
class Ifdemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);  
        
        float num1=0,num2=0,result=0;
        System.out.println("Enter a number");
        num1 = sc.nextFloat();
        System.out.println("Enter a number");
        num2 = sc.nextFloat();
        String option = new String();
        System.out.println("We have addition substraction multiplication division");
        System.out.println("What do you want please enter : ");
        option = sc.nextLine();
        option = sc.nextLine();
        if(option.equals("Addition") || option.equals("addition") || option.equals("add"))
        {
            System.out.println("Addition IS \n" + add(num1,num2,result));
        }
        else if(option.equals("Substraction") || option.equals("substraction") || option.equals("sub"))
        {
            System.out.println("Substraction IS \n" + sub(num1,num2,result));
        }
        else if(option.equals("Multiplication") || option.equals("multiplication") || option.equals("mul"))
        {
            System.out.println("Multiplication IS \n" + mul(num1,num2,result));
        }
        else if(option.equals("Division") || option.equals("division") || option.equals("div"))
        {
            System.out.println("Division IS \n" + div(num1,num2,result));
        }
        else
        {
            System.out.println(option);
            System.out.println("Wrong choice");
        }
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