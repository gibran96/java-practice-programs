import java.util.*;
import java.util.stream.Collectors;

public class ScannnerTest {

    public static void main(String[] args) {
        /*String s  = "welcometojava";
        int k = 3;
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for(int i = 0; i <= s.length() - k; i++){
            String sTemp = s.substring(i, i + k);
            if(sTemp.compareTo(smallest) < 0) {
                smallest = sTemp;
            }

            if(sTemp.compareTo(largest) > 0) {
                largest = sTemp;
            }
        }
        System.out.println(largest);*/

        /*String s = "gibran";
        int length = s.length();
        String reverse = "";
        for (int i = length-1; i>-1; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);*/

        /*String a = "anagram";
        String b = "margana";*/

        /*if (a.length() == b.length()) {
            char[] aChars = a.toCharArray();
            char[] bChars = b.toCharArray();
            Arrays.sort(aChars);
            Arrays.sort(bChars);
            int c = 0;
            for (int i = 0; i < a.length(); i++) {
                if (aChars[i] != bChars[i]) {
                    c++;
                }
            }
            if (c > 0) {
                System.out.println("not anagrams");
            } else {
                System.out.println("anagrams");
            }
        }*/
        /*if (isAnagram("anagram", "mragana")) {
            System.out.println("anagrams");
        } else {
            System.out.println("not anagrams");
        }*/

        Scanner sc = new Scanner(System.in);
        //String s = sc.nextLine();
        String s = "He is a very very good boy, isn't he?";
        s= s.trim();
        if (s.length() == 0 ) {
            System.out.println(0);
        }

        if (s.length() <= 4000) {
            String[] arr = s.split("['!?,._@ ]+");
            System.out.println(arr.length);
            for (int i = 0; i<arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

    }

    static boolean isAnagram(String a, String b) {
        // test for invalid input
        /*if (a == null || b == null || a.equals("") || b.equals(""))
            throw new IllegalArgumentException();

        // initial quick test for non-anagrams
        if (a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        // populate a map with letters and frequencies of String b
        Map<Character, Integer> map = new HashMap<>();

        for (int k = 0; k < b.length(); k++) {
            char letter = b.charAt(k);

            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                Integer frequency = map.get(letter);
                map.put(letter, ++frequency);
            }
        }

        // test each letter in String a against data in the map
        // return if letter is absent in the map or its  frequency is 0
        // otherwise decrease the frequency by 1

        for (int k = 0; k < a.length(); k++) {
            char letter = a.charAt(k);

            if (!map.containsKey(letter))
                return false;

            Integer frequency = map.get(letter);

            if (frequency == 0)
                return false;
            else
                map.put(letter, --frequency);
        }
        // if the code got that far it is an anagram
        return true;*/

        a = a.toUpperCase();
        b = b.toUpperCase();
        boolean ret = false;
        StringBuilder c = new StringBuilder(b);

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < c.length(); j++) {
                    if (a.charAt(i) == c.charAt(j)) {
                        c.deleteCharAt(j);
                        if (i == a.length() - 1 && c.length() == 0) {
                            ret = true;
                            break;
                        }
                        break;

                    }

                }
            }
        }
        return ret;
    }
}
