import static java.lang.Integer.toBinaryString;

class Bitwiseops
{
    public static void main(String[] args)
    {
        int indicators = 0xFF07;
        int selectBit = 0x4;
        System.out.println("indicators    = "+toBinaryString(indicators));
        System.out.println("SelectBit    = "+toBinaryString(selectBit));
        indicators &= selectBit;
        System.out.println("indicators & selectBit    = "+toBinaryString(indicators));
        indicators = 0xFF09;
        System.out.println("indicators    = "+toBinaryString(indicators));
        indicators = indicators | selectBit;
        System.out.println("indicators | selectBit    = "+toBinaryString(indicators));

        indicators &= ~selectBit;
        System.out.println("indicators & ~selectBit    = "+toBinaryString(indicators));
    }
}