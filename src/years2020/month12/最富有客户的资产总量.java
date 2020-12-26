package years2020.month12;

import static java.lang.Integer.max;

/**
 * @author : 王康
 * @date : 22:40 2020/12/23
 * @description : 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i​​​​​​​​​​​​ 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
 * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
 * @idea :
 */
public class 最富有客户的资产总量 {
    public int maximumWealth(int[][] accounts) {
        int money,maxmoney=0;
        for(int[] p:accounts){
            money=0;
            for(int m:p){
                money+=m;
            }
            maxmoney=max(money,maxmoney);

        }
        return maxmoney;
    }
}
