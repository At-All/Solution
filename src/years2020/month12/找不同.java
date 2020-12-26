package years2020.month12;

import java.util.Arrays;

/**
 * @author : 王康
 * @date : 0:22 2020/12/19
 * @description :给定两个字符串 s 和 t，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 * @idea : 先排序，再比较
 */
public class 找不同 {
    public static char findTheDifference(String s, String t) {
        char[] charss = s.toCharArray();
        char[] charst = t.toCharArray();
        Arrays.sort(charss);
        Arrays.sort(charst);
        int i=0;
        for (i=0;i<charss.length;i++){
            if (charss[i] != charst[i]){
                return charst[i];
            }
        }
        return charst[i];
    }

    public static void main(String[] args) {
        String s = "ae", t = "aea";
        System.out.println(findTheDifference(s,t));
    }
}
