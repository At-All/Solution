package years2020.month12;

/**
 * @author : 王康
 * @date : 2:07 2020/12/26
 * @description : 给定一个仅包含 0 和 1 、大小为 rows x cols 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。
 * @idea :
 */
public class 最大矩形 {
    public static int maximalRectangle(char[][] matrix) {
        int max=0,num=0;
        for (int i=0;i<matrix.length;i++){  //i方向前进
            for (int j=0;j<matrix[i].length;j++){ //j方向前进
                if (matrix[i][j]=='1'){
                    num=1;  //该位置可延伸最大面积
                    int k=0, l=0,maxl=matrix[i].length-j;  //k:i延申大小 l:j延申大小 maxl:j最大延伸
                    while (i+k<matrix.length){
                        if (matrix[i+k][j]=='1'){
                            l=0;
                            while(j+l<matrix[i].length&&l<maxl){
                                if (matrix[i+k][j+l]=='1'){
                                    num=Math.max(num,(k+1)*(l+1));
                                    l++;
                                }else{
                                    break;
                                }
                            }
                            maxl=l;
                            k++;
                        }else {
                            break;
                        }
                    }

                }
                max=Math.max(max,num);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        char[][] matrix = { { '1','0','1','0','0'} ,{ '1','0','1','1','1'} ,{ '1','1','1','1','1'} ,{ '1','0','0','1','0'}};
        System.out.println(maximalRectangle(matrix));
    }
}
