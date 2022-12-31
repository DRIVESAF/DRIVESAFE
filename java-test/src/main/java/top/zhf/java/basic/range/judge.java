package top.zhf.java.basic.range;

import java.util.Scanner;

public class judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;
        int sum = 0;
        double ava = 0;
        while(true){
            System.out.print("请输入你的整数：");
            int num = sc.nextInt();
            if(num > 0){
                count1++;}
            else if(num < 0){
                count2++;}
            else{
                break;
            }
            sum  += num;
            ava = sum / (count1 + count2);
        }
        System.out.println("输入正数个数：" + count1);
        System.out.println("输入负数个数：" + count2);
        System.out.println("这些数的总和是：" + sum);
        System.out.println("这些数的平均数是：" + ava);

    }
}
