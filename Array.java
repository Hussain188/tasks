import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array{
    public static void main(String[] args) {
        // Create the initial list
        List<Integer> initialList = new ArrayList<>();
        initialList.add(1);
        initialList.add(2);
        initialList.add(3);
        initialList.add(4);
        initialList.add(5);
        initialList.add(6);
        initialList.add(7);

        // Shuffle the list
        Collections.shuffle(initialList);

        // Print the shuffled list
        for (Integer value : initialList) {
            System.out.print(value + " ");
        }
    }
}
