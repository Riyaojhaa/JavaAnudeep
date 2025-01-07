// import java.util.*;

// public class Hashing {
//     public static void main(String[] args) {
//         int arr[] = { 1, 1, 2, 4, 3, 3, 5, 5, 5, 5, 5, 5, 6, 6, 1 };

//         Map<Integer, Integer> map = new HashMap<>();

//         for (int i : arr) {
//             if (!map.containsKey(i)) {
//                 map.put(i, 1);
//             } else {
//                 map.put(i, map.get(i) + 1);
//             }

//         }

//         System.out.println(map.entrySet());

//         int maxFreq = 0;
//         int maxFreqElement = 0;
//         for (var e : map.entrySet()) {
//             if (maxFreq < e.getValue()) {
//                 maxFreq = e.getValue();
//                 maxFreqElement = e.getKey();
//             }
//         }

//         System.out.println(maxFreqElement + " is the most frequent element with " + maxFreq + " times");

//     }
// }

//---------------------------------------------------------------------------------------

//find the minimum and maximum frequency of elements in an array
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 10, 15, 10, 5 };

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        System.out.println(map.entrySet());
        int maxFreq = 0;
        int minFreq = arr.length;
        int maxElem = 0;
        int minElem = 0;
        for (var el : map.entrySet()) {
            if (maxFreq < el.getValue()) {
                maxFreq = el.getValue();
                maxElem = el.getKey();
            }
        }
        for (var el : map.entrySet()) {
            if (minFreq > el.getValue()) {
                minFreq = el.getValue();
                minElem = el.getKey();
            }
        }

        System.out.print("maxElem is :" + maxElem + "frequency is :" + maxFreq);
        System.out.print("minElem is :" + minElem + "frequency is :" + minFreq);

    }
}