import java.util.HashMap;

public class Anagram {
    // public static HashMap<Character, Integer> makeFreqMap(String str) {
    // HashMap<Character, Integer> map = new HashMap<>();
    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);
    // if (!map.containsKey(ch)) {
    // map.put(ch, 1);
    // } else {
    // map.put(ch, map.get(ch) + 1);
    // }
    // }

    // return map;
    // }

    public static HashMap<Character, Integer> makeFreqMap1(String str1) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        System.out.println("this is listen : " + map.entrySet());

        return map;
    }

    // public static boolean isAnagram(String s, String t) {
    // if (s.length() != t.length()) {
    // return false;
    // }

    // HashMap<Character, Integer> mp1 = makeFreqMap(s);
    // HashMap<Character, Integer> mp2 = makeFreqMap(t);

    // return mp1.equals(mp2);

    // }

    public static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mp = makeFreqMap1(s);
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!mp.containsKey(ch)) {
                return false;
            } else {
                mp.put(ch, mp.get(ch) - 1);
            }

        }

        for (int i : mp.values()) {
            if (i != 0) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String s = "keen";
        String t = "sile";
        System.out.println(isAnagram1(s, t));

    }
}
