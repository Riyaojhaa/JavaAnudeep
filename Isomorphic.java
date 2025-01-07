import java.util.HashMap;

public class Isomorphic {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            // System.out.println("this is listen : " + map.entrySet());

            // Check if ch1 is already mapped to a character, and if so, check if it maps to
            // the same character as ch2
            if (map.containsKey(ch1)) {
                System.out.println("this is containeskey : " + map.containsKey(ch1)); // unique check krega true or //
                                                                                      // false me ans dega
                if (map.get(ch1) != ch2) {
                    return false;
                }
            } else {
                // If ch1 is not yet mapped, make sure ch2 is not already mapped to another
                // character
                if (map.containsValue(ch2)) {
                    return false;
                }
                map.put(ch1, ch2);
            }
        }
        System.out.println("this is listen2 : " + map.entrySet());

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("eggl", "addm"));
    }
}
