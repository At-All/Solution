package years2020.month12;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : 王康
 * @date : 15:54 2020/12/23
 * @description : 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * @idea : 我们可以对字符串进行两次遍历。
 * 在第一次遍历时，我们使用哈希映射统计出字符串中每个字符出现的次数。在第二次遍历时，我们只要遍历到了一个只出现一次的字符，那么就返回它的索引，否则在遍历结束后返回 -1−1。
 */
public class 字符串中的第一个唯一字符 {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> num = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            num.put(ch, num.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); ++i) {
            if (num.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
