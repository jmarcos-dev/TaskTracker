import model.Task;

public class Main {
    public static void main(String[] args) {
        Task t = new Task(1, "Buy bread");
        System.out.println(t);
        System.out.println(t.getTaskStatus());
    }
}