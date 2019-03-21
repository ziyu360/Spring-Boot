/*
 *有一对兔子，从出生的第三个月起，每月都会生一对小兔子，小兔子长刀到第三个月后又可以生一对兔子，假如兔子都不死，
 * 问第20个月的兔子的对数为多少
 *
 * 分析：
 * 第一个月：1
 * 第二个月：1
 * 第三个月：2
 * 第四个月：3
 * 第五个月：5
 * 第六个月：8
 *
 * 数组实现：
 *      A: 数组实现
 *      B：变量的变化实现
 *      C：递归实现
 *B:
  假如相邻的两个月的兔子的对数是a，b
 *  第一个月相邻的数据：a=1，b=1；
 *  第二个月相邻的数据：a=1，b=2；
 *  第三个月相邻的数据：a=2，b=3；
 *  第四个月相邻的数据：a=3，b=5；
 *  看到了：下一次的a是上一次的b，下一次的b是上一次的a+b
 *
 */
/*

 */
public class Fibonacci {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        //arr[2] = arr[0] + arr[1];
        //arr[3] = arr[1] + arr[2];
        for (int x = 2; x < arr.length; x++) {
            arr[x] = arr[x - 2] + arr[x - 1];
        }
        System.out.println("数组实现："+arr[19]);
        System.out.println("--------------");
       int a = 1;
        int b = 1;
        for (int i = 0; i < 18; i++) {
            //临时变量存储上一次a
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println("变量实现："+b);
        System.out.println("-------------");
        System.out.println("递归实现："+Fibonacci.recursion(+20));
    }

    public static int recursion(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return recursion(n - 1) + recursion(n - 2);
        }
    }
}
