package myTudu;

import java.util.Scanner;

public class Options implements InterfaceTodo {
    public void printOptions() {
        System.out.println("1. Add Assignments.");
        System.out.println("2. Delete Assignments.");
        System.out.println("3. Print Assignments.");
        System.out.println("4. Search Assignments.");
        System.out.println("5. Exit.\n");
    }

    Scanner sc = new Scanner(System.in);

    // tasks arraylist
    // ArrayList<Task> tasks = new ArrayList<>();

    public void selectOptions(int choice) {
        System.out.println("\nEnter Option.");
        int choicex = sc.nextInt();
        switch (choicex) {
            case 1:
                Add add1 = new Add();
                add1.toAdd();
                printOptions();
                selectOptions(choicex);
                break;
            case 2:
                Delete d1 = new Delete();
                d1.toDelete();
                printOptions();
                selectOptions(choicex);
                break;
            case 3:
                Print p1 = new Print();
                p1.toPrint();
                printOptions();
                selectOptions(choicex);
                break;
            case 4:
                Search s1 = new Search();
                s1.toSearch();
                printOptions();
                selectOptions(choicex);

                break;

            case 5:
                break;
            default:
                System.out.println("Enter Correct number.");
        }
    }

    public void toAdd() {

    }

    public void toDelete() {

    }

    public void toSearch() {

    }

    public void toPrint() {

    }

}
