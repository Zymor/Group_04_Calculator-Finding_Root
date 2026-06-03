public class Phannang_Algorithm extends Algorithm {

    @Override
    public double calculateDiscriminant(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    @Override
    public void solveQuadratic(double a, double b, double c) {
        double d = calculateDiscriminant(a, b, c);

        if (d > 0) { // Positive
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Discriminant is Positive");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (d == 0) { // Zero
            double x = -b / (2 * a);

            System.out.println("Discriminant is Zero");
            System.out.println("x = " + x);
        }
    }
}