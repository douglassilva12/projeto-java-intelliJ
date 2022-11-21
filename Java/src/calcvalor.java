import java.text.DecimalFormat;
import java.util.Scanner;

public class calcvalor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double vc,v, v2 = 0, v3 = 0, v4 = 0, v5 = 0, v6 = 0, v7 = 0, v8 = 0, v9 = 0, v10 = 0, v11 = 0, v12 = 0, v13 = 0, v14 = 0, v15 = 0, v16 = 0, v17 = 0, v18 = 0;
        System.out.println("Custo:");
        vc = teclado.nextDouble();
        System.out.println("Valor:");
        v = teclado.nextDouble();
        double r2 = 0, r3 = 0, r4 = 0, r5 = 0, r6 = 0, r7 = 0, r8 = 0, r9 = 0, r10 = 0, r11 = 0, r12 = 0, r13 = 0, r14 = 0, r15 = 0, r16 = 0, r17 = 0, r18 = 0;
        double vr2 = 0, vr3 = 0, vr4 = 0, vr5 = 0, vr6 = 0, vr7 = 0, vr8 = 0, vr9 = 0, vr10 = 0, vr11 = 0, vr12 = 0, vr13 = 0, vr14 = 0, vr15 = 0, vr16 = 0, vr17 = 0, vr18 = 0;
        double j = 0.0559, j2 = 0.043200477326968974, j3 = 0.057, j4 = 0.07050119331742243, j5 = 0.08379952267303103,
                j6 = 0.09679952267303102, j7 = 0.10959904534606205, j8 = 0.12220047732696898, j9 = 0.1345011933174224,
                j10 = 0.14650119331742242, j11 = 0.15840095465393794, j12 = 0.17,
                j13 = 0.18140095465393796, j14 = 0.19259904534606206, j15 = 0.20359904534606205,
                j16 = 0.21430071599045344, j17 = 0.2248997613365155, j18 = 0.23530071599045346;
        for (int cont = 1; cont < 2; cont++) {
            r2 = v - (v * (j + j2));
            r3 = v - (v * (j + j3));
            r4 = v - (v * (j + j4));
            r5 = v - (v * (j + j5));
            r6 = v - (v * (j + j6));
            r7 = v - (v * (j + j7));
            r8 = v - (v * (j + j8));
            r9 = v - (v * (j + j9));
            r10 = v - (v * (j + j10));
            r11 = v - (v * (j + j11));
            r12 = v - (v * (j + j12));
            r13 = v - (v * (j + j13));
            r14 = v - (v * (j + j14));
            r15 = v - (v * (j + j15));
            r16 = v - (v * (j + j16));
            r17 = v - (v * (j + j17));
            r18 = v - (v * (j + j18));
        }
        while ((vr2 = v2 - (v2 * (j + j2))) < v) {
            v2 += 0.01;
        }
        while ((vr3 = v3 - (v3 * (j + j3))) < v) {
            v3 += 0.01;
        }
        while ((vr4 = v4 - (v4 * (j + j4))) < v) {
            v4 += 0.01;
        }
        while ((vr5 = v5 - (v5 * (j + j5))) < v) {
            v5 += 0.01;
        }
        while ((vr6 = v6 - (v6 * (j + j6))) < v) {
            v6 += 0.01;
        }
        while ((vr7 = v7 - (v7 * (j + j7))) < v) {
            v7 += 0.01;
        }
        while ((vr8 = v8 - (v8 * (j + j8))) < v) {
            v8 += 0.01;
        }
        while ((vr9 = v9 - (v9 * (j + j9))) < v) {
            v9 += 0.01;
        }
        while ((vr10 = v10 - (v10 * (j + j10))) < v) {
            v10 += 0.01;
        }
        while ((vr11 = v11 - (v11 * (j + j11))) < v) {
            v11 += 0.01;
        }
        while ((vr12 = v12 - (v12 * (j + j12))) < v) {
            v12 += 0.01;
        }
        while ((vr13 = v13 - (v13 * (j + j13))) < v) {
            v13 += 0.01;
        }
        while ((vr14 = v14 - (v14 * (j + j14))) < v) {
            v14 += 0.01;
        }
        while ((vr15 = v15 - (v15 * (j + j15))) < v) {
            v15 += 0.01;
        }
        while ((vr16 = v16 - (v16 * (j + j16))) < v) {
            v16 += 0.01;
        }
        while ((vr17 = v17 - (v17 * (j + j17))) < v) {
            v17 += 0.01;
        }
        while ((vr18 = v18 - (v18 * (j + j18))) < v) {
            v18 += 0.01;
        }
        System.out.println("02 parcelas: R$ " + df.format(r2) + " - R$ " + df.format(r2-vc) + " - R$ " + df.format(v2) + " - R$ " + df.format(v2 / 2));
        System.out.println("03 parcelas: R$ " + df.format(r3) + " - R$ " + df.format(r3-vc) + " - R$ " + df.format(v3) + " - R$ " + df.format(v3 / 3));
        System.out.println("04 parcelas: R$ " + df.format(r4) + " - R$ " + df.format(r4-vc) + " - R$ " + df.format(v4) + " - R$ " + df.format(v4 / 4));
        System.out.println("05 parcelas: R$ " + df.format(r5) + " - R$ " + df.format(r5-vc) + " - R$ " + df.format(v5) + " - R$ " + df.format(v5 / 5));
        System.out.println("06 parcelas: R$ " + df.format(r6) + " - R$ " + df.format(r6-vc) + " - R$ " + df.format(v6) + " - R$ " + df.format(v6 / 6));
        System.out.println("07 parcelas: R$ " + df.format(r7) + " - R$ " + df.format(r7-vc) + " - R$ " + df.format(v7) + " - R$ " + df.format(v7 / 7));
        System.out.println("08 parcelas: R$ " + df.format(r8) + " - R$ " + df.format(r8-vc) + " - R$ " + df.format(v8) + " - R$ " + df.format(v8 / 8));
        System.out.println("09 parcelas: R$ " + df.format(r9) + " - R$ " + df.format(r9-vc) + " - R$ " + df.format(v9) + " - R$ " + df.format(v9 / 9));
        System.out.println("10 parcelas: R$ " + df.format(r10) + " - R$ " + df.format(r10-vc) + " - R$ " + df.format(v10) + " - R$ " + df.format(v10 / 10));
        System.out.println("11 parcelas: R$ " + df.format(r11) + " - R$ " + df.format(r11-vc) + " - R$ " + df.format(v11) + " - R$ " + df.format(v11 / 11));
        System.out.println("12 parcelas: R$ " + df.format(r12) + " - R$ " + df.format(r12-vc) + " - R$ " + df.format(v12) + " - R$ " + df.format(v12 / 12));
        System.out.println("13 parcelas: R$ " + df.format(r13) + " - R$ " + df.format(r13-vc) + " - R$ " + df.format(v13) + " - R$ " + df.format(v13 / 13));
        System.out.println("14 parcelas: R$ " + df.format(r14) + " - R$ " + df.format(r14-vc) + " - R$ " + df.format(v14) + " - R$ " + df.format(v14 / 14));
        System.out.println("15 parcelas: R$ " + df.format(r15) + " - R$ " + df.format(r15-vc) + " - R$ " + df.format(v15) + " - R$ " + df.format(v15 / 15));
        System.out.println("16 parcelas: R$ " + df.format(r16) + " - R$ " + df.format(r16-vc) + " - R$ " + df.format(v16) + " - R$ " + df.format(v16 / 16));
        System.out.println("17 parcelas: R$ " + df.format(r17) + " - R$ " + df.format(r17-vc) + " - R$ " + df.format(v17) + " - R$ " + df.format(v17 / 17));
        System.out.println("18 parcelas: R$ " + df.format(r18) + " - R$ " + df.format(r18-vc) + " - R$ " + df.format(v18) + " - R$ " + df.format(v18 / 18));
    }
}