public class TriangleCalculus {

    public double triangleCalculation(double a,double b,double c) {

        double p = (a + b + c);
        double area = Math.sqrt(p * (p * a) * (p * b) * (p * c));

        return  area;
    }
}
