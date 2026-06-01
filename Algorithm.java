public abstract class Algorithm {
// 2. Calculate the discriminant (B^2 - 4AC) (Phaleng)
    abstract void calculateDiscriminant(double a, double b, double c);  
// 3. Algorithm logic based on the discriminant (Phanang = do Positive, Zero) + (Yunn = Negative)
    abstract void solveQuadratic(double a, double b, double c);

}
