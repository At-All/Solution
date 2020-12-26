package years2020.month12;

import java.util.Arrays;

/**
 * @author : 王康
 * @date : 13:29 2020/12/25
 * @description : 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
 * 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
 * @idea : 贪心算法，先满足胃口小的，再满足胃口大的且尽量用小饼干满足
 */
public class 分发饼干 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i,j;
        for (i=0,j=0;i<g.length&&j<s.length;i++,j++){
            if (s[j]<g[i]){
                i--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] g = {1,2}, s = {1,2,3};
        System.out.println(findContentChildren(g,s));
    }
}
