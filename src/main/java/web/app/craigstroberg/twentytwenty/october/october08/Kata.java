package web.app.craigstroberg.twentytwenty.october.october08;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Kata {
    public static int[] menFromBoys(final int[] values) {
        // Your Code is Here .. Enjoy !! , Don't Forget To Vote :wink: :wink
        Arrays.sort(values);

        NavigableSet treeSet = new TreeSet();
        for (int i = 0; i < values.length; i++) {
            treeSet.add(values[i]);
        }

        Object[] objects = treeSet.toArray();
        int[] result = new int[objects.length];

        int oddIndex = (objects.length - 1);
        int evenIndex = 0;

        for (int i = 0; i < objects.length; i++) {
            if (((int) objects[i]) % 2 == 0) {
                result[evenIndex] = (int) objects[i];
                evenIndex++;
            } else {
                result[oddIndex] = (int) objects[i];
                oddIndex--;
            }
        }
        return result;
    }
}
