// Program-4.java
// Count multiples of 1 to 9 in array

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        int[] arr = {1,2,8,9,12,46,76,82,15,20,30};
        LinkedHashMap<Integer, Integer> result = new LinkedHashMap<>();

        for (int i = 1; i <= 9; i++) result.put(i, 0);

        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        System.out.print("{");
        int index = 0;
        for (int key : result.keySet()) {
            System.out.print(key + ": " + result.get(key));
            if (index < result.size() - 1) System.out.print(", ");
            index++;
        }
        System.out.println("}");
    }
}
