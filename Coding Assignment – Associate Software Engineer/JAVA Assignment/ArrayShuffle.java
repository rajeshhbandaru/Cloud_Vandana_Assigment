import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ShuffleArrya
{
    public static void main(String[] rags)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Collections.shuffle(list);
        System.out.println("Shuffle Arrya: " + list);
    }
}
//OUTPUT FOR THIS PROGRAM
// Shuffle Arrya: [7, 5, 1, 4, 3, 2, 6]