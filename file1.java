import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] a= new double[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j]=sc.nextDouble();
            }
        }
        //调用struct（）方法计算三边长
        double m = struct(a[0][0],a[0][1],a[1][0],a[1][1]);
        double m1 = struct(a[1][0],a[1][1],a[2][0],a[2][1]);
        double m2 = struct(a[2][0],a[2][1],a[0][0],a[0][1]);

        double m3 = m + m2 + m1;//得到周长
        System.out.printf("%.2f\n",m3);//保留小数点后两位
    }
    //零点之间计算长度，这个公式会被多次使用，所以我们可以将其写成方法，供调用。
    public static double struct(double x1,double y1,double x2, double y2){
        double c = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return c;
    }
}