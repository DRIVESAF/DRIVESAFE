package top.zhf.java.basic.range;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //输入层数
        System.out.println("Enter the number of lines：");
        int n = sc.nextInt();
        //层数
        for(int line = 1; line <= n; line++) {
            //空格
            for(int blank = 1; blank <= n - line; blank++) {
                System.out.print(" ");
            }
            //递减
            for(int jian = line; jian >= 1;jian--){
                System.out.print(jian);
            }
            //递增
            for (int c = 2;c <= line;c++){
                System.out.print(c);
            }
            //换行
            System.out.println();
        }

    }
}
