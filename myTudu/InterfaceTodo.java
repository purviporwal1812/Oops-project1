package myTudu;

import java.util.ArrayList;

public interface InterfaceTodo {
    ArrayList<Task> tasks = new ArrayList<>();

    void toAdd();

    void toDelete();

    void toPrint();

    void toSearch();

    void printOptions();
}
