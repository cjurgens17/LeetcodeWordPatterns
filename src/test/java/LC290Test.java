import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class LC290Test {

    @org.junit.jupiter.api.Test
    void isPattern() {
        boolean one = LC290.isPattern("abba","dog cat cat dog");
        boolean two = LC290.isPattern("abba","dog cat cat fish");
        boolean three = LC290.isPattern("aaaa","dog cat cat dog");
        boolean four = LC290.isPattern("abba", "dog dog dog dog");

        Assertions.assertTrue(one);
        Assertions.assertFalse(two);
        Assertions.assertFalse(three);
        Assertions.assertFalse(four);
    }

    @org.junit.jupiter.api.Test
    void isSame() {
        Set<String> set = new HashSet<>();
        Map<Character, String> map1 = new HashMap<>();
        map1.put('a', "Hello");
        map1.put('b', "Hello");
        Map<Character, String> map2 = new HashMap<>();
        map2.put('a', "hello");
        map2.put('b', "GoodBye");

        Assertions.assertFalse(LC290.isSame(set,map1));
        Assertions.assertTrue(LC290.isSame(set, map2));

    }
}