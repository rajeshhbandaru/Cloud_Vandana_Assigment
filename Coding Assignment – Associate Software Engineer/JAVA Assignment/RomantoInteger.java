import java.util.*;
class RomanToInteger
{
    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
    //function to convert roman to integer
    int convertRomanToInt(String s)
    {
        int total = 0;
        for (int i=0; i<s.length(); i++)
        {
            int s1 = value(s.charAt(i));
            if (i+1 < s.length())
            {
                int s2 = value(s.charAt(i+1));
                if (s1 >= s2)
                {
                    total = total + s1;
                }
                else
                {
                    total = total - s1;
                }
            }
            else
            {
                total = total + s1;
            }
        }
        return total;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        RomanToInteger romanToInteger = new RomanToInteger();
        String romanStr= sc.next();
        System.out.println("The Roman to Integer  is : "+romanToInteger.convertRomanToInt(romanStr));
    }
}

//OUTPUT FOR THIS PROGRAM
//Enter your String : IX
//The Roman to Integer  is : 9