package Lab_2;

public class Lab_2 {
    public static void main(String[] args) {

        double a1 = 2.98;
        double b1 = 5.55;
        double c1 = 0.045;
        double d1 = 0.129;
        double y1 = (Math.pow(a1,b1)/Math.cosh(Math.abs(b1)))+4*(Math.log10(c1)/Math.pow(d1,1/5));
        System.out.printf(Double.toString(y1)+"\n");


        double a2 = 1.27;
        double b2 = 10.99;
        double c2 = 4;
        double d2 = -25.32;
        double y2 = Math.pow(Math.tan(a2),1/c2)/(2-Math.sinh(b2)/Math.log1p(Math.abs(d2+c2)));
        System.out.printf(Double.toString(y2)+"\n");


        double a3 = 0.478;
        double b3 = -1.26;
        double c3 = 2.68;
        double d3 = 18.24;
        double y3 = Math.sin(Math.pow(a3,-b3))+3*Math.abs(Math.acos(-Math.sqrt(c3/d3)));
        System.out.printf(Double.toString(y3)+"\n");

    }
}
