import manager.TaskManager;
import model.Status;

public class Main {

    public static void main(String[] args) {

        TaskManager t = new TaskManager();

        if (args.length == 0) {
            System.out.println("Inform a command.");
            return;
        }

        String command = args[0];

        switch (command) {

            case "add":
                if (args.length < 2) {
                    System.out.println("Description is required.");
                    return;
                }

                String description = args[1];
                t.addTask(description);
                break;
            case "teste":
                t.addTask("Fazer trabalho escola");
                t.addTask("Comprar batatinha");
                t.addTask("Treinar");
                for (Task task : t.getTaskList()) {
                    System.out.println(task);
                }
                break;
            case "update":
                if (args.length < 3) {
                    System.out.println("Task ID and description are required.");
                    return;
                }

                int taskId = Integer.parseInt(args[1]);
                description = args[2];

                t.changeTask(taskId, description);
                break;

            case "delete":
                if (args.length < 2) {
                    System.out.println("Task ID is required.");
                    return;
                }

                taskId = Integer.parseInt(args[1]);

                t.removeTask(taskId);
                break;

            case "list":
                t.getTaskList();
                break;

            case "mark-done":
                if (args.length < 2) {
                    System.out.println("Task ID is required.");
                    return;
                }

                taskId = Integer.parseInt(args[1]);

                t.changeTaskStatus(taskId, Status.DONE);
                break;

            case "mark-in-progress":
                if (args.length < 2) {
                    System.out.println("Task ID is required.");
                    return;
                }

                taskId = Integer.parseInt(args[1]);

                t.changeTaskStatus(taskId, Status.IN_PROGRESS);
                break;

            default:
                System.out.println("Unknown command: " + command);
        }
    }
}