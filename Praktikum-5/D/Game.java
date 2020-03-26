import java.util.*;

class Game {
    static void run(String[] hojun, String[] qila) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        for (String a : hojun) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }
        for (String a : qila) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 0 : freq - 1);
        }
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() > 0) {
                for (int i = 1; i <= entry.getValue(); i++) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }
}