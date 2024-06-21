package myTudu;

import java.util.Scanner;

public class Add implements InterfaceTodo {

    public void toAdd() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter heading: ");
        String heading = sc.next();

        System.out.print("Enter status (i for incomplete, c for completed) :  ");
        String status = sc.next();

        if (!status.equalsIgnoreCase("i") && !status.equalsIgnoreCase("c")) {
            System.out.println("Invalid status input. Task not added.");
            return;
        }

        if (status.equalsIgnoreCase("i")) {
            tasks.add(new Task(heading, "Incomplete"));
        } else {
            tasks.add(new Task(heading, "Completed"));
        }

        // Task task = new Task(heading, status);
        // tasks.add(task);

        System.out.println("\nTask added: " + heading);
    }

    public void toDelete() {

    }

    public void toSearch() {

    }

    public void toPrint() {

    }

    public void printOptions() {

    }

}
