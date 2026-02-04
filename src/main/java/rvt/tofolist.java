import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TodoList {

    private ArrayList<String> tasks;
    private final String filePath = "data/todo.csv";

    public TodoList() {
        this.tasks = new ArrayList<>();
        loadFromFile();
    }

    // Load tasks from todo.csv
    private void loadFromFile() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            // skip header line (id,task)
            for (int i = 1; i < lines.size(); i++) {
                String[] parts = lines.get(i).split(",", 2);
                tasks.add(parts[1]);
            }

        } catch (Exception e) {
            // if file does not exist, do nothing
        }
    }

    // Get last ID number
    private int getLastId() {
        return tasks.size();
    }

    // Add new task
    public void add(String task) {
        tasks.add(task);
        updateFile();
    }

    // Remove task by id
    public void remove(int id) {
        tasks.remove(id - 1);
        updateFile();
    }

    // Print tasks
    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + tasks.get(i));
        }
    }

    // Rewrite whole CSV file
    private boolean updateFile() {
        try {
            ArrayList<String> lines = new ArrayList<>();
            lines.add("id,task");

            for (int i = 0; i < tasks.size(); i++) {
                lines.add((i + 1) + "," + tasks.get(i));
            }

            Files.write(Paths.get(filePath), lines);
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
