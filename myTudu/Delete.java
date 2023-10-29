package myTudu;

import java.util.Scanner;

public class Delete implements InterfaceTodo {
    public void toDelete() {
        Scanner sc = new Scanner(System.in);
        if (Add.tasks.size() == 0) {
            System.out.println("First Add a task!");
            return;
        }
        System.out.println("Enter the task heading to be removed : ");
        String removed = sc.next();

        for (int i = 0; i < Add.tasks.size(); i++) {
            Task task = Add.tasks.get(i);
            if (task.heading.equals(removed)) {
                Add.tasks.remove(i);
            }
        }
        System.out.println("\nTask removed : " + removed);
    }

    public void toAdd() {

    }

    public void toSearch() {

    }

    public void toPrint() {

    }

    public void printOptions() {

    }

    public void selectOptions() {

    }

}
