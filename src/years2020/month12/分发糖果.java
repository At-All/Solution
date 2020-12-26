package years2020.month12;

/**
 * @author : 王康
 * @date : 16:27 2020/12/24
 * @description : 老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
 * 你需要按照以下要求，帮助老师给这些孩子分发糖果：
 * 每个孩子至少分配到 1 个糖果。相邻的孩子中，评分高的孩子必须获得更多的糖果。
 * 那么这样下来，老师至少需要准备多少颗糖果呢？
 * @idea :
 */
public class 分发糖果 {
    public static int candy(int[] ratings) {
        int[] num= new int[ratings.length];
        for (int i =0;i<ratings.length;i++){
            if (i>0&&ratings[i]>ratings[i-1]){
                num[i]=num[i-1]+1;
            }else{
                num[i]=1;
                for (int j=i-1;j>=0;j--){
                    if (ratings[j]>ratings[j+1]&&num[j]<=num[j+1]){
                        num[j]++;
                    }else{
                        break;
                    }
                }
            }
        }
        int sum=0;
        for (int n:num){
            sum+=n;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1,0,2};
        System.out.println(candy(a));
    }
}
