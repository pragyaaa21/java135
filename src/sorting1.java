import java.util.ArrayList;
import java.util.Collections;

public class sorting1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        Collections.sort(list1);
        Collections.reverse(list1);
      // or  list1.sort(Collections.reverseOrder());
        System.out.println(list1);

    }
}
