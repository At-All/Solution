package years2020.month12;

/**
 * @author : 王康
 * @date : 16:44 2020/12/15
 * @description :给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。
 *（当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）
 */
public class 单调递增的数字 {

    public static int monotoneIncreasingDigits(int N) {
        String s = String.valueOf(N);
        //分解
        char[] chars = s.toCharArray();
        //操作
        for (int i =0;i< chars.length-1;i++){
            if (chars[i]>chars[i+1]){
                chars[i] = (char)(chars[i]-1);
                for (int j=i+1;j< chars.length;j++){
                    chars[j] = '9';
                }
                i=-1;
            }
        }

        //重组
        Integer integer = Integer.valueOf(String.valueOf(chars));
        return Integer.valueOf(String.valueOf(chars));
    }


    public static void main(String[] args) {
        int N = 332;
        System.out.println(monotoneIncreasingDigits(N));

    }
}
