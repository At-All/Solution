package years2020.month12;

/**
 * @author : 王康
 * @date : 0:56 2020/12/26
 * @description : 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
 * @idea :
 */
public class 拿硬币 {
    public static int minCount(int[] coins) {
        int min=0;
        for (int a:coins){
            if (a%2==0){
                min+=a/2;
            }else{
                min+=a/2+1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] coins={4,2,1};
        System.out.println(minCount(coins));
    }
}
