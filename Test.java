public class Test
{
    public static void main(String[] args)
    {
        int value=18;
        try {
            assert value >=20 : "Eligible";
        } catch (Exception e) {
            throw(e);
        }
        
        System.out.println("Value " + value);
    }
}