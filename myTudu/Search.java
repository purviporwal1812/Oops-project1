package myTudu;

import java.util.ArrayList;
import java.util.Scanner;

public class Search implements InterfaceTodo {
    public void toSearch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Search by:\n1. Heading\n2. Status");
        int searchChoice = sc.nextInt();

        if (searchChoice == 1) {
            System.out.print("Enter task heading to search: ");
            String searchHeading = sc.next();

            // matching tasks array list
            ArrayList<Task> matchingTasks = new ArrayList<>();
            for (Task task : tasks) {
                if (task.heading.contains(searchHeading)) {
                    matchingTasks.add(task);
                }
            }
            // displaying
            if (matchingTasks.isEmpty()) {
                System.out.println("No matching tasks found.");
            } else {
                System.out.println("Matching Tasks:");
                for (Task task : matchingTasks) {
                    System.out.println("Title: " + task.heading + "\nDesc: This is my task.\nStatus: " + task.status);
                    System.out.println();
                }
            }
        } else if (searchChoice == 2) {
            System.out.print("Enter task status to search: ");
            String searchStatus = sc.next();

            if (!searchStatus.equalsIgnoreCase("i") && !searchStatus.equalsIgnoreCase("c")) {
                System.out.println("Invalid status input.");
                return;
            }

            ArrayList<Task> matchingTasks = new ArrayList<>();
            for (Task task : tasks) {
                if (searchStatus.equalsIgnoreCase("i")) {
                    matchingTasks.add(task);
                } else if (searchStatus.equalsIgnoreCase("c")) {
                    matchingTasks.add(task);
                }
            }

            if (matchingTasks.isEmpty()) {
                System.out.println("No matching tasks found.");
            } else {
                System.out.println("Matching Tasks:");
                for (Task task : matchingTasks) {
                    System.out.println("Title: " + task.heading + "\nDesc: This is my task.\nStatus: " + task.status);
                    System.out.println();
                }
            }
        } else {
            System.out.println("Invalid choice.");
        }

    }

    public void toAdd() {

    }

    public void toDelete() {

    }

    public void toPrint() {

    }

    public void printOptions() {

    }

    public void selectOptions() {

    }

}
