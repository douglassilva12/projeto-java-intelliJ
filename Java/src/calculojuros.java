import java.util.Scanner;

public class calculojuros {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double v,v2=181.01,v3=238.83,v4=295.4,v5=351.12,v6=405.59,v7=459.22,v8=512.02,v9=563.56,v10=613.84,v11=663.7,v12=712.3,v13=760.07,v14=806.99,v15=853.08,v16=897.92,v17=942.33,v18=985.91;
        int parcela;
        double r2=0,r3=0,r4=0,r5=0,r6=0,r7=0,r8=0,r9=0,r10=0,r11=0,r12=0,r13=0,r14=0,r15=0,r16=0,r17=0,r18=0;
        System.out.println("Valor:");
        v= teclado.nextDouble();
        for(int cont=1;cont<2;cont++){
            r2=((v2*100)/v)/100;
            r3=((v3*100)/v)/100;
            r4=((v4*100)/v)/100;
            r5=((v5*100)/v)/100;
            r6=((v6*100)/v)/100;
            r7=((v7*100)/v)/100;
            r8=((v8*100)/v)/100;
            r9=((v9*100)/v)/100;
            r10=((v10*100)/v)/100;
            r11=((v11*100)/v)/100;
            r12=((v12*100)/v)/100;
            r13=((v13*100)/v)/100;
            r14=((v14*100)/v)/100;
            r15=((v15*100)/v)/100;
            r16=((v16*100)/v)/100;
            r17=((v17*100)/v)/100;
            r18=((v18*100)/v)/100;
        }
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);
        System.out.println(r8);
        System.out.println(r9);
        System.out.println(r10);
        System.out.println(r11);
        System.out.println(r12);
        System.out.println(r13);
        System.out.println(r14);
        System.out.println(r15);
        System.out.println(r16);
        System.out.println(r17);
        System.out.println(r18);
    }
}
