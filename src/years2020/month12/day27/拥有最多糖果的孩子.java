package years2020.month12.day27;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : 王康
 * @date : 13:00 2020/12/27
 * @description : 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
 * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。
 * @idea :
 */
public class 拥有最多糖果的孩子 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleans=new ArrayList<>();
        int max=0;
        for (int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        for (int i=0;i<candies.length;i++){
            if (candies[i]+extraCandies>=max){
                booleans.add(true);
            }else{
                booleans.add(false);
            }
        }
        return booleans;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
}
