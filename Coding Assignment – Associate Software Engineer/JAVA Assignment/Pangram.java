import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Pangram
{
    public static boolean isPangram(String str)
    {
        str = str.toLowerCase();
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < str.length(); i++)
        {
            characters.add(str.charAt(i));
        }
        return characters.size() == 26;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the A to Z letter in String: ");
        String str = scanner.next();
        if (isPangram(str)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}

//OUTPUT1
//Enter the A to Z letter in String: abcdefghijklmnopqrstuvwxyz
//The string is a pangram.


//OUTPUT 2
//Enter the A to Z letter in String: abcdefghijklmnopqrstwxyz
//The string is not a pangram.