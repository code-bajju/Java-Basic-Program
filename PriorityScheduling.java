import java.util.*;

class Process {
    int pid;
    int arrival_time;
    int burst_time;
    int priority;
    int waiting_time;
    int turnaround_time;
    int completion_time;
    boolean is_completed;

    public Process(int pid, int arrival_time, int burst_time, int priority) {
        this.pid = pid;
        this.arrival_time = arrival_time;
        this.burst_time = burst_time;
        this.priority = priority;
        this.waiting_time = 0;
        this.turnaround_time = 0;
        this.completion_time = 0;
        this.is_completed = false;
    }
}

 class PriorityScheduling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = sc.nextInt();

        List<Process> processes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the arrival time of process " + (i+1) + ": ");
            int arrival_time = sc.nextInt();
            System.out.print("Enter the burst time of process " + (i+1) + ": ");
            int burst_time = sc.nextInt();
            System.out.print("Enter the priority of process " + (i+1) + ": ");
            int priority = sc.nextInt();
            processes.add(new Process(i+1, arrival_time, burst_time, priority));
        }

        // sort the processes by arrival time
        Collections.sort(processes, (a, b) -> a.arrival_time - b.arrival_time);

        int current_time = 0;
        int completed_processes = 0;
        List<Integer> gantt_chart = new ArrayList<>();
        PriorityQueue<Process> ready_queue = new PriorityQueue<>((a, b) -> b.priority - a.priority);

        while (completed_processes < n) {
            // add the arrived processes to the ready queue
            for (Process p : processes) {
                if (!p.is_completed && p.arrival_time <= current_time) {
                    ready_queue.add(p);
                }
            }

            if (ready_queue.isEmpty()) {
                // no processes to execute, increment the current time
                current_time++;
                gantt_chart.add(-1);
            } else {
                // execute the process with highest priority
                Process p = ready_queue.poll();
                p.waiting_time = current_time - p.arrival_time;
                p.turnaround_time = p.waiting_time + p.burst_time;
                p.completion_time = current_time + p.burst_time;
                p.is_completed = true;
                completed_processes++;
                current_time = p.completion_time;
                gantt_chart.add(p.pid);
            }
        }

        // calculate the average waiting time and average turnaround time
        double avg_waiting_time = 0;
        double avg_turnaround_time = 0;

        for (Process p : processes) {
            avg_waiting_time += p.waiting_time;
            avg_turnaround_time += p.turnaround_time;
        }

        avg_waiting_time /= n;
        avg_turnaround_time /= n;

        // display the Gantt chart
        System.out.println("Gantt Chart:");
        System.out.print("-----------\n|");

        for (int i = 0; i < gantt_chart.size(); i++) {
            if (gantt_chart.get(i) == -1) {
                System.out.print("   |");
            } else {
                System.out.print(" P" + gantt_chart.get(i) + " |");
            }
        }

        System.out.println("\n-----------");

        // display the average
    System.out.printf("Average Waiting Time: %.2f\n", avg_waiting_time);
    System.out.printf("Average Turnaround Time: %.2f\n", avg_turnaround_time);

    // display the process details
    System.out.println("Process Details:");
    System.out.println("----------------");

    System.out.println("| Process | Arrival Time | Burst Time | Priority | Waiting Time | Turnaround Time | Completion Time |");

    for (Process p : processes) {
        System.out.printf("| P%-7d | %-12d | %-10d | %-8d | %-12d | %-15d | %-15d |\n",
                p.pid, p.arrival_time, p.burst_time, p.priority, p.waiting_time, p.turnaround_time, p.completion_time);
    }
}
}