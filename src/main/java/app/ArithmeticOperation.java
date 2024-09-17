package app;

public interface ArithmeticOperation {
    int perform(int a, int b);


    public static int ResultOP(int a, int b, ArithmeticOperation op) {
        return op.perform(a, b);
    }


}
