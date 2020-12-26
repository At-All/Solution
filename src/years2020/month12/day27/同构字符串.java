package years2020.month12.day27;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : 王康
 * @date : 0:44 2020/12/27
 * @description : 给定两个字符串 s 和 t，判断它们是否是同构的。
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * @idea :
 */
public class 同构字符串 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] charss = s.toCharArray();
        char[] charst = t.toCharArray();
        for (int i=0;i<charss.length;i++){
            char si = charss[i];
            char ti = charst[i];

            if (map.containsKey(si)){
                if (!map.get(si).equals(ti)){
                    return false;
                }
            }else{
                if (map.containsValue(ti)){
                    return false;
                }
                map.put(si,ti);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t));
    }
}
