package years2020.month12.day27;

/**
 * @author : 王康
 * @date : 0:26 2020/12/27
 * @description :  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *               J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * @idea :
 */
public class 宝石与石头 {
    public static int numJewelsInStones(String jewels, String stones) {
        int num=0;
        for (int i=0;i<stones.length();i++){
            if (jewels.indexOf(stones.substring(i,i+1))!=-1){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";
        System.out.println(numJewelsInStones(J,S));
    }
}
