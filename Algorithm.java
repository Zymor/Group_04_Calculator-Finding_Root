public class Algorithm {
    // 2. Calculate the discriminant (B^2 - 4AC) (Phaleng)
    public double calculateDiscriminant(double a, double b, double c) {
        double discriminant = (b * b) - (4 * a * c);
        System.out.println("Discriminant (B² - 4AC) = " + discriminant);
        return discriminant;
    }

    // 3. Algorithm logic based on the discriminant (Phanang = do Positive, Zero) + (Yunn = Negative)
    public String[] solveQuadratic(double a, double b, double c) {
        double discriminant = calculateDiscriminant(a, b, c);
        System.out.println("Solving: " + a + "x² + " + b + "x + " + c + " = 0");

        String[] results = new String[2];
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real roots:");
            System.out.println("  x1 = " + root1);
            System.out.println("  x2 = " + root2);
            results[0] = String.format("%.2f", root1);
            results[1] = String.format("%.2f", root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One repeated real root:");
            System.out.println("  x = " + root);
            results[0] = String.format("%.2f", root);
            results[1] = String.format("%.2f", root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Two complex roots:");
            System.out.println("  x1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("  x2 = " + realPart + " - " + imaginaryPart + "i");
            results[0] = String.format("%.2f + %.2fi", realPart, imaginaryPart);
            results[1] = String.format("%.2f - %.2fi", realPart, imaginaryPart);
        }
        return results;
    }
}

