//import MCA.solution;
package MCA;
public class classA implements solution {
    public void Hello()
    {
        System.out.println("Hello world");
    }
    public void Welcome()
    {
        System.out.println("Welcome MCAIII");
    }

    public static void main(String[] args)
    {

        classA test = new classA();
        test.Hello();
        test.Welcome();
    }
}