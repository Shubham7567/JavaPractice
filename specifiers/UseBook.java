package bookpackext;
import bookpack.*;

class UseBook
{
    public static void main(String args[])
    {
        books book[] = new books[5];
        book[0] = new books("Java: A Beginner's Guide","Schildt",2014);

        book[1] = new books("Java: The Complete Reference","Schildt",2014);

        book[2] = new books("The Art of Java","Schildt and Holmes",2003);

        book[3] = new books("Red Storm Raising","Clancy",1986);

        book[4] = new books("On The Road","Kerouac",1955);

        for(int index = 0; index < book.length;index++) book[index].show();
    }
}