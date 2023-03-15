import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Collections;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (char index = 0; index < text.length(); index++) {
            if (Objects.equals(Character.isLetter(index), true)) {
                for (char s : text.charAt(index)) {
                    if (map.get(s) == 0) {
                        map.put(s, 1);
                    } else {
                        int newS = map.get(s) + 1;
                        map.put(s, newS);
                    }
                }
                for (char k : map.keySet()) {
                    int i = map.get(k);
                    if (i > 0 && i < Integer.MAX_VALUE) {
                        System.out.println("Минимальное число " + i + " символа " + k);
                    } else if (i > Integer.MAX_VALUE){
                        System.out.println("Максимальное число " + i + " символа " + k);
                    }

                }
            }
        }
    }
}