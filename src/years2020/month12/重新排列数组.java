package years2020.month12;

/**
 * @author : 王康
 * @date : 23:52 2020/12/25
 * @description : 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 * @idea :
 */
public class 重新排列数组 {
    public static int[] shuffle(int[] nums, int n) {
        int[] ints=new int[nums.length];
        for (int i=0;i<n;i++){
            ints[2*i] = nums[i];
            ints[2*i+1] = nums[i+n];
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};int n = 3;
        nums = shuffle(nums,n);
       for (int a:nums){
           System.out.print(a+" ");
       }
    }
}
