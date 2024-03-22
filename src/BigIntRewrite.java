import java.math.BigInteger;
public class BigIntRewrite {
    public static BigInteger pow(int x, int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        BigInteger base = BigInteger.valueOf(x);
        BigInteger t = pow(x, n / 2);

        if (n % 2 == 0){
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(base);
        }
    }
    public static void main(String[] args) {
        int base = 2;
        int exponent = 100;

        BigInteger result = pow(base, exponent);
        System.out.println("Result of " + base + "^" + exponent + " = " + result);

    }
}
