package years2020.month12;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : 王康
 * @date : 9:24 2020/12/16
 * @description : 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * @idea : 遍历字符串记录每个字符的位置与 map 中
 */
public class 无重复字符的最长子串 {
    public static int lengthOfLongestSubstring(String s) {
        int fs = 0;//用于存取最后要返回的长度
        //1.创建一个map，key：字符，value: 字符下标  `
        Map<Character,Integer> map = new HashMap<>();
        //2.遍历字符串，并将字符串存入map中
        for (int start = 0,end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch) && map.get(ch) > start){ //若字符存在子串中，更新start
                start = map.get(ch);
            }
            // 取较大值
            fs = Math.max(fs,end - start +1);
            //存入map中
            map.put(ch,end + 1);
        }
        return fs;

    }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
