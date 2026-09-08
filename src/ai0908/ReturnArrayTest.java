package ai0908;

public class ReturnArrayTest {
    public static float[] resultCalc(float n1, float n2) {
        float[] resultArr = new float[4];
        resultArr[0] = n1 + n2;
        resultArr[1] = n1 - n2;
        resultArr[2] = n1 * n2;
        resultArr[3] = n1 / n2;

        return resultArr;
    }

    public static void main(String[] args) {
        float n1 = 200;
        float n2 = 500;

        float [] resultArr = resultCalc(n1, n2);
        char [] cal = {'+', '-', '*', '/'};

        for (int i = 0; i < resultArr.length; i++) {
            System.out.printf("%.0f %c %.0f = %.1f\n", n1, cal[i], n2, resultArr[i]);
        }
    }
}
