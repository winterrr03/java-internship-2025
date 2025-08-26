package basic;

public class Exercise01 {
    public int getGCD(final int a, final int b) {
        return b == 0 ? a : getGCD(b, a % b);
    }

    public int getLCM(final int a, final int b) {
        if (a == 0 || b == 0) return 0;

        return a / getGCD(a, b) * b;
    }
}
