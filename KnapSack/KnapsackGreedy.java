package KnapSack;

import java.util.Arrays;

public class KnapsackGreedy {
    
    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;
        
        int maxProfit = knapsackGreedy(weights, values, capacity);
        System.out.println("Maximum profit: " + maxProfit);
    }
    
    public static int knapsackGreedy(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        double[] valuePerWeight = new double[n];
        for (int i = 0; i < n; i++) {
            valuePerWeight[i] = (double) values[i] / weights[i];
        }
        
        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        Arrays.sort(indices, (a, b) -> Double.compare(valuePerWeight[b], valuePerWeight[a]));
        
        int currentWeight = 0;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            int index = indices[i];
            if (currentWeight + weights[index] <= capacity) {
                currentWeight += weights[index];
                maxProfit += values[index];
            } else {
                int remainingCapacity = capacity - currentWeight;
                maxProfit += valuePerWeight[index] * remainingCapacity;
                break;
            }
        }
        
        return maxProfit;
    }
}
