import java.util.*;

class KnapsackItem {
    int weight, value;
    KnapsackItem(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class KnapsackGreedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = sc.nextInt();
        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        KnapsackItem[] items = new KnapsackItem[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the weight and value of item " + (i+1) + ": ");
            int weight = sc.nextInt();
            int value = sc.nextInt();
            items[i] = new KnapsackItem(weight, value);
        }
        Arrays.sort(items, (a, b) -> Double.compare((double)b.value/b.weight, (double)a.value/a.weight));
        int totalValue = 0, currentCapacity = capacity, i = 0;
        while (i < n && currentCapacity > 0) {
            if (items[i].weight <= currentCapacity) {
                totalValue += items[i].value;
                currentCapacity -= items[i].weight;
            } else {
                totalValue += (int)(((double)currentCapacity/items[i].weight)*items[i].value);
                currentCapacity = 0;
            }
            i++;
        }
        System.out.println("The maximum value that can be put in the knapsack is " + totalValue);
    }
}
