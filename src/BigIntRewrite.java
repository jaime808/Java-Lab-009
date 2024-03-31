import java.math.BigInteger;
public class void main(String[] args) {
public class BigIntRewrite {
    public static BigInteger pow(int x, int n) {
        if (n == 0) return BigInteger.ONE;

        BigInteger t = pow(x, n / 2);

        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }
}
}