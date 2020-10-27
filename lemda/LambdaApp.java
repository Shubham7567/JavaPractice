interface Cab{
    void bookCab();
}

/*class UberX implements Cab{
    public void bookCab() {
        System.out.println("UberX booked !! Arriving soon");
    }
}

public class LambdaApp {
    public static void main(String[] args)
    {
        Cab cab = new UberX();
        cab.bookCab();
    }
}*/

public class LambdaApp {
    public static void main(String[] args)
    {
        /*Cab cab = new Cab(){
            @Override
            public void bookCab(){
                System.out.println("UberX booked !! Arriving soon");
            }
        };*/
        Cab cab = () -> {System.out.println("UberX booked !! Arriving soon");};

        cab.bookCab();
    }
}