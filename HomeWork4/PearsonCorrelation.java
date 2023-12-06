import java.util.Arrays;

public class PearsonCorrelation {

    public static void main(String[] args) {
        int[] arrayX = {1,2,3};
        int[] arrayY = {2,7,8};

        double averageX = Arrays.stream(arrayX).average().getAsDouble();
        double averageY = Arrays.stream(arrayY).average().getAsDouble();

        System.out.println("Среднее значение по X: " + averageX);
        System.out.println("Среднее значение по Y: " + averageY);

        double [] deviationMultiply = new double [arrayX.length];

        double [] deviationSquareX = new double [arrayY.length];
        double [] deviationSquareY = new double [arrayY.length];

        double numerator = 0;
        double deviationSquareSummX = 0;
        double deviationSquareSummY = 0;

        for (int i = 0; i < arrayX.length; i++) {
            deviationMultiply[i] = (arrayX[i] - averageX)*(arrayY[i] - averageY);
            numerator = numerator + deviationMultiply[i];

            deviationSquareX[i] = Math.pow(arrayX[i] - averageX, 2);
            deviationSquareY[i] = Math.pow(arrayY[i] - averageY, 2);
            deviationSquareSummX = deviationSquareSummX + deviationSquareX[i];
            deviationSquareSummY = deviationSquareSummY + deviationSquareY[i];
        }
        System.out.println("числитель " + numerator);
        double denominator = Math.sqrt(deviationSquareSummX*deviationSquareSummY);
        System.out.println("знаменатель " + denominator);

        double pearsonFactor = numerator/denominator;

        System.out.println(pearsonFactor);
    }


}
