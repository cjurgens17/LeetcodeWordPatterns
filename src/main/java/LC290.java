import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC290 {

    public static void main(String[] args) {
        System.out.println(isPattern("abba","dog cat cat dog"));
        System.out.println(isPattern("abba","dog cat cat fish"));
        System.out.println(isPattern("aaaa","dog cat cat dog"));
        System.out.println(isPattern("abba", "dog dog dog dog"));

    }

    //Given a pattern and a string s, find if s follows the same pattern.
    //
    //Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
    //
    //
    //
    //Example 1:
    //
    //Input: pattern = "abba", s = "dog cat cat dog"
    //Output: true
    //Example 2:
    //
    //Input: pattern = "abba", s = "dog cat cat fish"
    //Output: false
    //Example 3:
    //
    //Input: pattern = "aaaa", s = "dog cat cat dog"
    //Output: false
    //
    //
    //Constraints:
    //
    //1 <= pattern.length <= 300
    //pattern contains only lower-case English letters.
    //1 <= s.length <= 3000
    //s contains only lowercase English letters and spaces ' '.
    //s does not contain any leading or trailing spaces.
    //All the words in s are separated by a single space.

    public static boolean isPattern(String pattern, String s){
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        char[] chArr = pattern.toCharArray();

        if(arr.length != chArr.length) return false;

        boolean flag = true;

        for(int i = 0;i<arr.length;i++){
            if(!map.containsKey(chArr[i])){
                map.put(chArr[i], arr[i]);
            }

            if(map.containsKey(chArr[i])){
                flag = map.get(chArr[i]).equals(arr[i]);
                if(!flag) break;
            }
        }
        Set<String> set = new HashSet<>();
        boolean okay = isSame(set, map);
        return okay ? flag : okay;
    }

    public static boolean isSame(Set<String> set, Map<Character, String> map){
        for(String str: map.values()){
            if(!set.add(str)) return false;
        }
        return true;
    }
}
