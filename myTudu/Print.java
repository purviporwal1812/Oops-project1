package myTudu;

public class Print implements InterfaceTodo {
    public void toPrint() {
        if (Add.tasks.size() == 0) {
            System.out.println("No assignments remaining.");
        }
        for (int i = 0; i < Add.tasks.size(); i++) {
            Task task = Add.tasks.get(i);
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
