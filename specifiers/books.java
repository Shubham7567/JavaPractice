package bookpack;

public class books
{
    //these are protected members
    protected String title;
    protected String author;
    protected int pubDate;

    public books(String t, String a, int d)
    {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show()
    {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}