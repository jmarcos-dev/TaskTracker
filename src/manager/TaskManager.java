package model;

import java.util.*;
import java.util.stream.Collectors;

public class TaskManager {
    private int taskNextid;
    private List<Task> taskList;

    /*When creating constructor, it only passes
      parameters to what will receive
      value from the outside.
     */
    public TaskManager() {
        taskNextid = 1;
        Task taskList = new ArrayList<>();
    }

    public Task addTask(String taskDescription) {

    }

    public void removeTask(int taskId) {
    }

    public List<Task> getTaskList() {
    }

    public Task getTaskById(int idTask) {

    }

    public boolean changeTaskStatus(int taskId, Status newStatus) {

    }

    public boolean changeTask(int taskId, String newTaskDescription) {

    }

    public List<Task> listByStatus(Status taskStatus) {
    }
}