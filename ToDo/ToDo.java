import java.util.ArrayList;
import java.util.Scanner;

public class Todo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        String task;

        while (true) {
            System.out.print("Enter a task or type 'q' to quit: ");
            task = scanner.nextLine();

            if (task.equals("q")) {
                break;
            } else if (task.equals("list")) {
                if (tasks.isEmpty()) {
                    System.out.println("Your to-do list is empty");
                } else {
                    System.out.println("Your to-do list:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            } else if (task.startsWith("complete")) {
                int index = Integer.parseInt(task.substring(9)) - 1;
                if (index < 0 || index >= tasks.size()) {
                    System.out.println("Error: Invalid task number");
                } else {
                    String completedTask = tasks.remove(index);
                    System.out.println("Task \"" + completedTask + "\" has been marked as complete");
                }
            } else {
                tasks.add(task);
                System.out.println("Task \"" + task + "\" has been added to your to-do list");
            }
        }

        scanner.close();
    }
}
