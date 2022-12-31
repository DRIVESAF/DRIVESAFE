package top.zhf.java.basic.array;

public class matrix {
    public static void main(String[] args) {
        int rowmax = 0;
        int colmax = 0;
        int row = 0;
        int col = 0;
        int[][] ary = new int[4][4];
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                ary[i][j] = (int) (Math.random() * 2);
                System.out.print(ary[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < ary.length; i++) {
            int rowx = 0;
            int colx = 0;
            for (int j = 0; j < ary[i].length; j++) {
                if (ary[i][j] == 1) {
                    rowx++;
                }
                if (ary[j][i] == 1) {
                    colx++;
                }
            }
            if (rowx > rowmax) {
                rowmax = rowx;
                row = i;
            }
            if (colx > colmax) {
                colmax = colx;
                col = i;
            }
        }
        System.out.println("The largest row index:" + (row + 1));
        System.out.println("The largest column index:" + (col + 1));
    }
}
