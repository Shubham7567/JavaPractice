class StringClass
{
    public static void main(String[] args)
    {
        String phrase = "The quick brock down fox jumped over the lazy dog";
        int vowels=0;
        for(char ch : phrase.toCharArray())
        {
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                vowels++;
        }
        System.out.println("Vowels are "+vowels);
    }
}