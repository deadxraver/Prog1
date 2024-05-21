import java.lang.Math;
public class Lab {

    public static void main(String[] Args) {

        long[] c = new long[17];
        double[] x = new double[19];
        double[][] C = new double[9][19];

        for (int i = 0; i < 17; i++) {
            c[i] = 23 - i;
        }

        for (int i = 0; i < 19; i++) {
            x[i] = Math.random() * 18 - 6.0;
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 19; j++) {
                if (c[i] == 9) {
                    C[i][j] = Math.asin(1 / Math.pow(Math.E, Math.pow(Math.sin(Math.sin(Math.pow(Math.PI * x[j], 3))), 2)));
                }
                // 7 11 17 21
                else if (c[i] == 7 || c[i] == 11 || c[i] == 17 || c[i] == 21) {
                    C[i][j] = Math.pow(Math.pow(Math.pow((1 / 4 + x[j]) / x[j], 2), x[j] * x[j]), 3 / Math.pow(Math.E, Math.tan(x[j])));
                }
                else {
                    C[i][j] = Math.log1p(Math.pow(Math.tan(Math.sin(Math.asin((x[j] + 3) / 36))), 2));
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.format("%.3f ", C[i][j]);
            }
            System.out.print('\n');
        }
    }
}
