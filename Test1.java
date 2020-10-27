import java.util.Scanner;
class Test1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = scanner.nextLine();
        System.out.print("Enter age:");
        int age = scanner.nextInt();
        System.out.print("Enter salary:");
        double salary = scanner.nextDouble();
        System.out.println();
        System.out.println("Student detail is given below:");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
    }
}