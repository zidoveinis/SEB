import java.util.Scanner;

public class Stocks {

    public static void logarithm() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter V value");

        int v = input.nextInt();
        int array[] = new int[v];

            if (v < 231 && v > 0) {
                System.out.println("Enter the " + v + " t integers now.");
            }
            else {
                System.out.println("Index out of range");
                return;
            }

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
            if (array[i] < 100000 && array[i] > 0) { }
            else {

                System.out.println("Index out of range");
                return;
            }
        }
        System.out.println(String.valueOf(MaxLoss(array)));
        input.close();
    }

    private static int MaxLoss(int[] array) {
        int maximalLoss = 0, lastPeakIndex = 0;

        for (int i = lastPeakIndex + 1; i < array.length; i++)
        {
            int lossOrGainFromLastPeak = array[i] - array[lastPeakIndex];

            if (lossOrGainFromLastPeak < 0 && lossOrGainFromLastPeak < maximalLoss) {
                maximalLoss = lossOrGainFromLastPeak;
            }
            else if (lossOrGainFromLastPeak > 0) {
                lastPeakIndex = i;
            }
        }
        System.out.print("Result: ");
        return maximalLoss;


    }
}