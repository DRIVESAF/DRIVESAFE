package top.zhf.java.gui.print;

public class integral {
    public static void main(String[] args) {
        System.out.println("********消费单********");
        System.out.println("购买物品\t\t\t\t单价\t\t\t\t个数\t\t\t\t金额");
        System.out.println("T恤\t\t\t\t\t￥245\t\t\t2\t\t\t\t￥490");
        System.out.println("网球鞋\t\t\t\t￥570\t\t\t1\t\t\t\t￥570");
        System.out.println("网球拍\t\t\t\t￥320\t\t\t1\t\t\t\t￥320");
        System.out.println("\t");
        System.out.println("折扣：\t\t\t\t8折");
        int t = 245;
        int xie = 570;
        int pai = 320;
        int sum = t * 2 + xie + pai;
        double zhe = sum * 0.8;
        int zhao = 1500;
        double z = zhao - zhe;
        System.out.println("消费总金额\t\t￥" + zhe);
        System.out.println("实际交费\t\t\t￥1500");
        System.out.println("实际交费\t\t\t￥" + z);
        System.out.println("本次购物所获的积分是：33");
    }
}