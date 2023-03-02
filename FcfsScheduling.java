import java.util.*;

public class FcfsScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, bt[], wt[], tat[], at[];
        float awt = 0, atat = 0;
        
        System.out.print("Enter the number of processes: ");
        n = sc.nextInt();
        
        bt = new int[n]; // burst time
        wt = new int[n]; // waiting time
        tat = new int[n]; // turnaround time
        at = new int[n]; // arrival time
        
        System.out.println("Enter the burst time and arrival time for each process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process " + (i+1) + ": ");
            bt[i] = sc.nextInt();
            at[i] = sc.nextInt();
        }
        sc.close();
        
        // calculate waiting time for each process
        wt[0] = 0;
        for (int i = 1; i < n; i++) {
            wt[i] = wt[i-1] + bt[i-1] - at[i-1];
        }
        
        // calculate turnaround time for each process
        for (int i = 0; i < n; i++) {
            tat[i] = wt[i] + bt[i];
        }
        
        // calculate average waiting time and turnaround time
        for (int i = 0; i < n; i++) {
            awt += wt[i];
            atat += tat[i];
        }
        awt /= n;
        atat /= n;
        
        // print the results
        System.out.println("\nProcess\tBurst Time\tArrival Time\tWaiting Time\tTurnaround Time");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t\t" + bt[i] + "\t\t" + at[i] + "\t\t" + wt[i] + "\t\t" + tat[i]);
        }
        System.out.println("\nAverage Waiting Time: " + awt);
        System.out.println("Average Turnaround Time: " + atat);
    }
}
