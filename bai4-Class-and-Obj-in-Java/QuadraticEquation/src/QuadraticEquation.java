public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public int checkDelta(){
        double delta = getDiscriminant();
        if (delta > 0){
            return 1;
        }else if (delta == 0){
            return 0;
        }else
            return -1;
    }

    public double getRoot1() {
        double r1 = (-b + Math.pow(getDiscriminant(),0.5)) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.pow(getDiscriminant(),0.5)) / (2 * a);
        return r2;
    }

    public double getRoot3() {
        double r3 = -b/(2*a);
        return r3;
    }
}
