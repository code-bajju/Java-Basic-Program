import java.util.*;

public class SJFNonPre {

    static class Process {
        int pid; // process ID
        int burstTime; // process burst time
        int waitingTime; // process waiting time

        public Process(int pid, int burstTime) {
            this.pid = pid;
            this.burstTime = burstTime;
            this.waitingTime = 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of processes: ");
        int n = sc.nextInt();

        ArrayList<Process> processes = new ArrayList<>();

        // input the process ID and burst time for each process
        for (int i = 0; i < n; i++) {
            System.out.print("Enter process ID for process " + (i+1) + ": ");
            int pid = sc.nextInt();
            System.out.print("Enter burst time for process " + (i+1) + ": ");
            int burstTime = sc.nextInt();
            processes.add(new Process(pid, burstTime));
        }

        Collections.sort(processes, new Comparator<Process>() {
            @Override
            public int compare(Process p1, Process p2) {
                return p1.burstTime - p2.burstTime;
            }
        });

        int currentTime = 0;
        for (int i = 0; i < n; i++) {
            Process p = processes.get(i);
            p.waitingTime = currentTime;
            currentTime += p.burstTime;
        }

        System.out.println("\nProcess\tBurst Time\tWaiting Time");
        for (int i = 0; i < n; i++) {
            Process p = processes.get(i);
            System.out.println("P" + p.pid + "\t\t" + p.burstTime + "\t\t" + p.waitingTime);
        }
    }
}
