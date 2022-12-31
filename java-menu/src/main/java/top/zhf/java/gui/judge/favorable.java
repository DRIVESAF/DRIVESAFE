package top.zhf.java.gui.judge;

import java.util.Scanner;

public class favorable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int)(Math.random()*10);
        System.out.println("请输入会员号（四位整数）：");
        int huiyuanhao = sc.nextInt();
        if (huiyuanhao <=9999 && huiyuanhao >= 1000) {
            int number = huiyuanhao / 10 % 10;
            if (number == random){
                System.out.println(huiyuanhao + "是幸运客户，获得精美MP3一个。");
            }else{
                System.out.println(huiyuanhao + "谢谢您的支持");
            }
        }else{
            System.out.println("客户号"+ huiyuanhao +"是无效会员号！");
            System.out.println("录入信息失败！");
        }
    }
}
