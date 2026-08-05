package model;

import java.time.LocalDateTime;

public class Task {
    private int taskId;
    private String taskDescription;
    private Status taskStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Task(int taskId, String taskDescription) {
        this.taskId = taskId;
        setTaskDescription(taskDescription);
        this.taskStatus = Status.TODO;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskDescription(String taskDescription) {
        //validation for null cases
        this.taskDescription = (taskDescription == null) ? "" : taskDescription.trim();
        this.updatedAt = LocalDateTime.now();
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskStatus(Status taskStatus) {
        this.taskStatus = taskStatus;
        this.updatedAt = LocalDateTime.now();
    }

    public Status getTaskStatus() {
        return taskStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return "[" + taskId + "]" + " - " + taskDescription + " - " + taskStatus;
    }
}