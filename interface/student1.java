package basicoperations;
import java.util.Scanner;

public class student1 implements maths
{
    @Override
    public void add()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Addition");
        System.out.println("-----------------------------");
        System.out.println("Enter any two integer values:");
        int no1 = kb.nextInt();
        int no2 = kb.nextInt();
        int sum = no1 + no2;
        System.out.println("sum of " + no1 + " and " + no2 + " is " + sum);
    }
    @Override
    public void sub()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Substraction");
        System.out.println("-----------------------------");
        System.out.println("Enter any two integer values:");
        int no1 = kb.nextInt();
        int no2 = kb.nextInt();
        int sum = no1 - no2;
        System.out.println("substraction of " + no1 + " and " + no2 + " is " + sum);
    }
    @Override
    public void mul()
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("-----------------------------");
        System.out.println("Multiplication");
        System.out.println("-----------------------------");
        System.out.println("Enter any two integer values:");
        int no1 = kb.nextInt();
        int no2 = kb.nextInt();
        int sum = no1 * no2;
        System.out.println("multiplication of " + no1 + " and " + no2 + " is " + sum);
    }
    @Override
    public void div()
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("-----------------------------");
        System.out.println("Division");
        System.out.println("-----------------------------");
        System.out.println("Enter any two integer values:");
        int no1 = kb.nextInt();
        int no2 = kb.nextInt();
        int sum = no1 / no2;
        System.out.println("division of " + no1 + " and " + no2 + " is " + sum);
    }
    public static void main(String[] args)
    {
        student1 student = new student1();
        student.add();
        student.sub();
        student.mul();
        student.div();
    }
}