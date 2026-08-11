package manager;

import java.util.*;
import java.util.stream.Collectors;
import model.Status;
import model.Task;

public class TaskManager {
    private int taskNextid;
    private List<Task> taskList;

    /*
     * When creating constructor, it only passes
     * parameters to what will receive
     * value from the outside.
     */
    public TaskManager() {
        taskNextid = 1;
        taskList = new ArrayList<>();
    }

    public Task addTask(String taskDescription) {
        Task task = new Task(taskNextid, taskDescription);
        taskList.add(task);
        taskNextid++;
        return task;
    }

    public void removeTask(int taskId) {
        taskList.removeIf(t -> t.getTaskId() == taskId);
    }

    public List<Task> getTaskList() {
        return new ArrayList<>(taskList);
    }

    public Task getTaskById(int idTask) {
        for (Task t : taskList) {
            if (t.getTaskId() == idTask) {
                return t;
            }
        }
        return null;
    }

    public boolean changeTaskStatus(int taskId, Status newStatus) {
        Task t = getTaskById(taskId);
        if (t != null) {
            t.setTaskStatus(newStatus);
            return true;
        }
        return false;
    }

    public boolean changeTask(int taskId, String newTaskDescription) {
        Task t = getTaskById(taskId);
        if (t != null) {
            t.setTaskDescription(newTaskDescription);
            return true;
        }
        return false;
    }

    public List<Task> listByStatus(Status taskStatus) {
        return taskList.stream().filter(t -> t.getTaskStatus() == taskStatus).collect((Collectors.toList()));
    }
}