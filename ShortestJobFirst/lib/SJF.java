import java.util.*;

public class SJF {
    
    // Process class to store process information
    static class Process {
        int pid; 
        int bt;   
        
        public Process(int pid, int bt) {
            this.pid = pid;
            this.bt = bt;
        }
    }
   
    public static void findWaitingTime(Process[] processes, int[] wt) {
        int n = processes.length;
        int[] rt = new int[n];
        for (int i = 0; i < n; i++) {
            rt[i] = processes[i].bt;
        }
        int complete = 0, t = 0, min = Integer.MAX_VALUE;
        int shortest = 0, finish_time;
        boolean check = false;
        while (complete != n) {
            for (int j = 0; j < n; j++) {
                if ((processes[j].bt <= min) && (rt[j] > 0)) {
                    min = processes[j].bt;
                    shortest = j;
                    check = true;
                }
            }
            if (check == false) {
                t++;
                continue;
            }
            rt[shortest]--;
            min = rt[shortest];
            if (min == 0) {
                min = Integer.MAX_VALUE;
            }
            if (rt[shortest] == 0) {
                complete++;
                check = false;
                finish_time = t + 1;
                wt[shortest] = finish_time - processes[shortest].bt;
                if (wt[shortest] < 0) {
                    wt[shortest] = 0;
                }
            }
            t++;
        }
    }
    
    // Method to calculate the average waiting time
    public static float findAverageWaitingTime(Process[] processes) {
        int n = processes.length;
        int[] wt = new int[n];
        findWaitingTime(processes, wt);
        int total_wt = 0;
        for (int i = 0; i < n; i++) {
            total_wt += wt[i];
        }
        return (float)total_wt / n;
    }
    
    // Driver method
    public static void main(String[] args) {
        Process[] processes = { new Process(1, 6), new Process(2, 8), new Process(3, 7), new Process(4, 3) };
        System.out.println("Average waiting time = " + findAverageWaitingTime(processes));
    }
}
