package years2020.month12.day27;

/**
 * @author : 王康
 * @date : 18:14 2020/12/27
 * @description :
 * @idea :
 */
public class 罗马数字转整数 {
    public static int romanToInt(String s) {
        int x=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='I'){
                x+=1;
            }else if (s.charAt(i)=='V'){
                if (i>0&&s.charAt(i-1)=='I'){
                    x+=3;
                }else {
                    x+=5;
                }
            }else if (s.charAt(i)=='X'){
                if (i>0&&s.charAt(i-1)=='I'){
                    x+=8;
                }else {
                    x+=10;
                }
            }else if (s.charAt(i)=='L'){
                if (i>0&&s.charAt(i-1)=='X'){
                    x+=30;
                }else {
                    x+=50;
                }
            }else if (s.charAt(i)=='C'){
                if (i>0&&s.charAt(i-1)=='X'){
                    x+=80;
                }else {
                    x+=100;
                }
            }else if (s.charAt(i)=='D'){
                if (i>0&&s.charAt(i-1)=='C'){
                    x+=300;
                }else {
                    x+=500;
                }
            }else if (s.charAt(i)=='M'){
                if (i>0&&s.charAt(i-1)=='C'){
                    x+=800;
                }else {
                    x+=1000;
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
