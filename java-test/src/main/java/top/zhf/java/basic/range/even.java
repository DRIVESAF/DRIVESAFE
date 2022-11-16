package top.zhf.java.basic.range;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 100;i++){
            if(i % 2 == 1){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
