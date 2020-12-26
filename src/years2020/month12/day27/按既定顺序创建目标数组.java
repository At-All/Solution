package years2020.month12.day27;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author : 王康
 * @date : 15:20 2020/12/27
 * @description : 给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
 * 目标数组 target 最初为空。
 * 按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
 * 重复上一步，直到在 nums 和 index 中都没有要读取的元素。
 * 请你返回目标数组。
 * 题目保证数字插入位置总是存在。
 * @idea :
 */
public class 按既定顺序创建目标数组 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            System.arraycopy(target, index[i], target, index[i] + 1, i - index[i]);
            target[index[i]]=nums[i];
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
        int[] target = createTargetArray(nums,index);
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

}
