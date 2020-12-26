package years2020.month12;

import java.util.HashMap;

/**
 * @author : 王康
 * @date : 10:32 2020/12/16
 * @description : 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 * @idea : 这里同样用 map，把规律 pattern 分解 每个规律为键；把str 分解 ，每个值为值；
 */
public class 单词规律 {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        //分解规律和值
        String[] strings = s.split(" ");
        char[] chars = pattern.toCharArray();

        if (strings.length != chars.length){//规律须和值数量相同
            return false;
        }

        //遍历每个规律与值
        for (int i=0;i<chars.length;i++){

            char c = chars[i];          //规律
            String string = strings[i]; //值

            if (map.containsKey(c)){//存在规律
                if (!string.equals(map.get(c))){//新值不符合规律
                    return false;
                }
            }else{//添加新规律
                if (map.containsValue(string)){//不存在规律，但存在值也不行
                    return false;
                }
                map.put(c,string);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba", str = "dog dog dog dog";
        System.out.println(wordPattern(pattern, str));
    }
}
