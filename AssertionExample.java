import java.util.Scanner;
class AssertionExample
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age");
        int value = scanner.nextInt();
        assert value >= 18 : "Eligible";
        System.out.println("Your enteres age is " + value);
    }
}