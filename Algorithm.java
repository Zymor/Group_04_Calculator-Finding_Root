public class Algorithm {
// 2. Calculate the discriminant (B^2 - 4AC) (Phaleng)
    void calculateDiscriminant(double a, double b, double c){
        double discriminant = (b * b) - (4 * a * c);
        System.out.println("Discriminant (B² - 4AC) = " + discriminant);
    }
// 3. Algorithm logic based on the discriminant (Phanang = do Positive, Zero) + (Yunn = Negative)
    void solveQuadratic(double a, double b, double c){
        double discriminant = (b * b) - (4 * a * c);

        System.out.println("Solving: " + a + "x² + " + b + "x + " + c + " = 0");

        if (discriminant > 0) {
            // Positive discriminant → 2 real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real roots:");
            System.out.println("  x1 = " + root1);
            System.out.println("  x2 = " + root2);

        } else if (discriminant == 0) {
            // Zero discriminant → 1 repeated real root
            double root = -b / (2 * a);
            System.out.println("One repeated real root:");
            System.out.println("  x = " + root);

        } else {
            // Negative discriminant → 2 complex roots
            double realPart      = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Two complex roots:");
            System.out.println("  x1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("  x2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }

}
