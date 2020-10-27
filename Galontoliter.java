import java.util.*; 
class Galontoliter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float gallon=0,liter=0;
        System.out.print("Enter gallon :");
        gallon = sc.nextFloat();
        liter = gallon * 3.78451f;
        System.out.println(gallon + " Gallon = " + liter + " Liter");
    }
}