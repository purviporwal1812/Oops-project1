package myTudu;

import java.io.FileWriter;
import java.io.IOException;

public class Print implements InterfaceTodo {
    public void toPrint() {
        if (tasks.size() == 0) {
            System.out.println("No assignments remaining.");
        }
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            try (FileWriter writer = new FileWriter("assignment.txt")) {
                for (Task tas : tasks) {
                    writer.write("heading : " + tas.heading + " status : " + tas.status + "\n");
                }
            } catch (IOException e) {
                System.out.println("File could not be written.");
            }
            System.out.println("Title: " + task.heading + "\nDesc : This is my " + (i + 1) + " Task." + "\nStatus: "
                    + task.status);
            System.out.println("\n");
        }
    }

    public void toAdd() {

    }

    public void toDelete() {

    }

    public void toSearch() {

    }

    public void printOptions() {

    }

    public void selectOptions() {

    }
}
