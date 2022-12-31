package top.zhf.java.basic.range;

public class cumulative {
    public static void main(String[] args) {
        //定义空变量
        int temp = 0;
        //把1~100之间的数输出来
        for (int num = 1; num <= 100; num++) {
            //跳过能被整除的数
            if (num % 3 == 0) {
                continue;
            }
            //把符合条件的数加入空变量
            temp = temp + num;

        }System.out.println(temp);
    }
}
