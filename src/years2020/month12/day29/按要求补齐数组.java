package years2020.month12.day29;

/**
 * @author : 王康
 * @date : 16:37 2020/12/29
 * @description : 给定一个已排序的正整数数组 nums，和一个正整数 n 。从 [1, n] 区间内选取任意个数字补充到 nums 中，使得 [1, n] 区间内的任何数字都可以用 nums 中某几个数字的和来表示。请输出满足上述要求的最少需要补充的数字个数。
 * @idea : 如果区间 [1,x-1]内的所有数字都已经被覆盖，则从贪心的角度考虑，补充 x 之后即可覆盖到 x，且满足补充的数字个数最少。在补充 x 之后，区间[1,2x−1] 内的所有数字都被覆盖，下一个缺失的数字一定不会小于 2x2x。
 */
public class 按要求补齐数组 {
    public static int minPatches(int[] nums, int n) {
        int patches = 0;
        long x = 1;
        int length = nums.length, index = 0;
        while (x <= n) {
            if (index < length && nums[index] <= x) {
                x += nums[index];
                index++;
            } else {
                System.out.print("补充"+x+"  ");
                x *= 2;
                patches++;
            }
        }
        return patches;
    }

    public static void main(String[] args) {
        int[] nums = {};int n = 50;
        System.out.println(minPatches(nums,n));
    }
}
